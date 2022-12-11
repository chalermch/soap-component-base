/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidsoapclient;

import java.util.List;
import services.Covidtest;

/**
 *
 * @author Admin
 */
public class CovidSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Covidtest> co1 = findAllCovidtest();
        printAllCovidtest(co1);
    }
    
     public static void printAllCovidtest(List <Covidtest> covidList){
        for(Covidtest c : covidList){
            System.out.println("year : " + c.getCovidyear());
            System.out.println("weeknum : " + c.getWeeknum());
            System.out.println("new case : " + c.getNewCase());
            System.out.println("total case : " + c.getTotalCase());
            System.out.println("new case exclude abroad : " + c.getNewCaseExcludeabroad());
            System.out.println("total case exclude abroad : " + c.getTotalCaseExcludeabroad());
            System.out.println("new recovered : " + c.getNewRecovered());
            System.out.println("total recovered : " + c.getTotalRecovered());
            System.out.println("new death : " + c.getNewDeath());
            System.out.println("total death : " + c.getTotalCase());
            System.out.println("case foreign : " + c.getCaseForeign());
            System.out.println("case prison : " + c.getCasePrison());
            System.out.println("case walkin : " + c.getCaseWalkin());
            System.out.println("case new prev : " + c.getCaseNewPrev());
            System.out.println("case new diff : " + c.getCaseNewDiff());
            System.out.println("death new prev : " + c.getDeathNewPrev());
            System.out.println("death new diff : " + c.getDeathNewDiff());
            System.out.println("update date : " + c.getUpdateDate());
            System.out.println();
        }
    }

    private static java.util.List<services.Covidtest> findAllCovidtest() {
        services.CovidWebService_Service service = new services.CovidWebService_Service();
        services.CovidWebService port = service.getCovidWebServicePort();
        return port.findAllCovidtest();
    }
    
    
    
}
