
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Covidtest_QNAME = new QName("http://services/", "covidtest");
    private final static QName _FindAllCovidtestResponse_QNAME = new QName("http://services/", "findAllCovidtestResponse");
    private final static QName _InsertCodvidtest_QNAME = new QName("http://services/", "insertCodvidtest");
    private final static QName _FindAllCovidtest_QNAME = new QName("http://services/", "findAllCovidtest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllCovidtest }
     * 
     */
    public FindAllCovidtest createFindAllCovidtest() {
        return new FindAllCovidtest();
    }

    /**
     * Create an instance of {@link FindAllCovidtestResponse }
     * 
     */
    public FindAllCovidtestResponse createFindAllCovidtestResponse() {
        return new FindAllCovidtestResponse();
    }

    /**
     * Create an instance of {@link Covidtest }
     * 
     */
    public Covidtest createCovidtest() {
        return new Covidtest();
    }

    /**
     * Create an instance of {@link InsertCodvidtest }
     * 
     */
    public InsertCodvidtest createInsertCodvidtest() {
        return new InsertCodvidtest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Covidtest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "covidtest")
    public JAXBElement<Covidtest> createCovidtest(Covidtest value) {
        return new JAXBElement<Covidtest>(_Covidtest_QNAME, Covidtest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCovidtestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllCovidtestResponse")
    public JAXBElement<FindAllCovidtestResponse> createFindAllCovidtestResponse(FindAllCovidtestResponse value) {
        return new JAXBElement<FindAllCovidtestResponse>(_FindAllCovidtestResponse_QNAME, FindAllCovidtestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCodvidtest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "insertCodvidtest")
    public JAXBElement<InsertCodvidtest> createInsertCodvidtest(InsertCodvidtest value) {
        return new JAXBElement<InsertCodvidtest>(_InsertCodvidtest_QNAME, InsertCodvidtest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCovidtest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findAllCovidtest")
    public JAXBElement<FindAllCovidtest> createFindAllCovidtest(FindAllCovidtest value) {
        return new JAXBElement<FindAllCovidtest>(_FindAllCovidtest_QNAME, FindAllCovidtest.class, null, value);
    }

}
