/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Covidtest;

/**
 *
 * @author Admin
 */
@WebService(serviceName = "covidWebService")
public class covidWebService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("CovidSoapPU");

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findAllCovidtest")
    public List<Covidtest> findAllCovidtest() {
        EntityManager em = emf.createEntityManager();
        List<Covidtest> coList = (List<Covidtest>)em.createNamedQuery("Covidtest.findAll").getResultList();
        em.close();
        return coList;
    }

}
