
package services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "covidWebService", targetNamespace = "http://services/", wsdlLocation = "http://localhost:8080/CovidSoap/covidWebService?WSDL")
public class CovidWebService_Service
    extends Service
{

    private final static URL COVIDWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException COVIDWEBSERVICE_EXCEPTION;
    private final static QName COVIDWEBSERVICE_QNAME = new QName("http://services/", "covidWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/CovidSoap/covidWebService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COVIDWEBSERVICE_WSDL_LOCATION = url;
        COVIDWEBSERVICE_EXCEPTION = e;
    }

    public CovidWebService_Service() {
        super(__getWsdlLocation(), COVIDWEBSERVICE_QNAME);
    }

    public CovidWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), COVIDWEBSERVICE_QNAME, features);
    }

    public CovidWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, COVIDWEBSERVICE_QNAME);
    }

    public CovidWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COVIDWEBSERVICE_QNAME, features);
    }

    public CovidWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CovidWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CovidWebService
     */
    @WebEndpoint(name = "covidWebServicePort")
    public CovidWebService getCovidWebServicePort() {
        return super.getPort(new QName("http://services/", "covidWebServicePort"), CovidWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CovidWebService
     */
    @WebEndpoint(name = "covidWebServicePort")
    public CovidWebService getCovidWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services/", "covidWebServicePort"), CovidWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COVIDWEBSERVICE_EXCEPTION!= null) {
            throw COVIDWEBSERVICE_EXCEPTION;
        }
        return COVIDWEBSERVICE_WSDL_LOCATION;
    }

}
