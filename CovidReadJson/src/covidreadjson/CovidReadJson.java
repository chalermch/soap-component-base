/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidreadjson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author Admin
 */
public class CovidReadJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://covid19.ddc.moph.go.th/api/Cases/today-cases-all");
        StringBuilder builder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream(), UTF_8))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                builder.append(str);
            }
        }
        String json = builder.toString();
            
            
        JsonReader jsonReader = Json.createReader(new StringReader(json));
        JsonArray jsonArray = jsonReader.readArray();
        jsonReader.close();
            
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
            
        System.out.println(jsonArray);
        for(int i = 0; i < jsonArray.size(); i++){
            JsonObject covid = jsonArray.getJsonObject(i);
            int year = covid.getInt("year");
            int weeknum = covid.getInt("weeknum");
            int new_case = covid.getInt("new_case");
            int total_case = covid.getInt("total_case");
            int new_case_excludeabroad = covid.getInt("new_case_excludeabroad");
            int total_case_excludeabroad = covid.getInt("total_case_excludeabroad");
            int new_recovered = covid.getInt("new_recovered");
            int total_recovered = covid.getInt("total_recovered");
            int new_death = covid.getInt("new_death");
            int total_death = covid.getInt("total_death");
            int case_foreign = covid.getInt("case_foreign");
            int case_prison = covid.getInt("case_prison");
            int case_walkin = covid.getInt("case_walkin");
            int case_new_prev = covid.getInt("case_new_prev");
            int case_new_diff = covid.getInt("case_new_diff");
            int death_new_prev = covid.getInt("death_new_prev");
            int death_new_diff = covid.getInt("death_new_diff");
            String date = covid.getString("update_date");
            Date update_date = dt.parse(date);
                
            Covidtest co = new Covidtest(year, weeknum, new_case, total_case, new_case_excludeabroad, total_case_excludeabroad, new_recovered, total_recovered, new_death, total_death, case_foreign, case_prison, case_walkin, case_new_prev, case_new_diff, death_new_prev, death_new_diff, update_date);
            CovidTable.insertCovidtest(co);
        }        
    }
    
}
