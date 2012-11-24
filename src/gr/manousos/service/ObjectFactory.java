
package gr.manousos.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gr.manousos.service package. 
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

    private final static QName _TestResponse_QNAME = new QName("http://service.manousos.gr/", "testResponse");
    private final static QName _RegisterResponse_QNAME = new QName("http://service.manousos.gr/", "RegisterResponse");
    private final static QName _Register_QNAME = new QName("http://service.manousos.gr/", "Register");
    private final static QName _RegisterTaxPayer_QNAME = new QName("http://service.manousos.gr/", "RegisterTaxPayer");
    private final static QName _RegisterTaxPayerResponse_QNAME = new QName("http://service.manousos.gr/", "RegisterTaxPayerResponse");
    private final static QName _Test_QNAME = new QName("http://service.manousos.gr/", "test");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gr.manousos.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterTaxPayerResponse }
     * 
     */
    public RegisterTaxPayerResponse createRegisterTaxPayerResponse() {
        return new RegisterTaxPayerResponse();
    }

    /**
     * Create an instance of {@link RegisterTaxPayer }
     * 
     */
    public RegisterTaxPayer createRegisterTaxPayer() {
        return new RegisterTaxPayer();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link Taxpayer }
     * 
     */
    public Taxpayer createTaxpayer() {
        return new Taxpayer();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Contact }
     * 
     */
    public Contact createContact() {
        return new Contact();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "testResponse")
    public JAXBElement<TestResponse> createTestResponse(TestResponse value) {
        return new JAXBElement<TestResponse>(_TestResponse_QNAME, TestResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "RegisterResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "Register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterTaxPayer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "RegisterTaxPayer")
    public JAXBElement<RegisterTaxPayer> createRegisterTaxPayer(RegisterTaxPayer value) {
        return new JAXBElement<RegisterTaxPayer>(_RegisterTaxPayer_QNAME, RegisterTaxPayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterTaxPayerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "RegisterTaxPayerResponse")
    public JAXBElement<RegisterTaxPayerResponse> createRegisterTaxPayerResponse(RegisterTaxPayerResponse value) {
        return new JAXBElement<RegisterTaxPayerResponse>(_RegisterTaxPayerResponse_QNAME, RegisterTaxPayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Test }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "test")
    public JAXBElement<Test> createTest(Test value) {
        return new JAXBElement<Test>(_Test_QNAME, Test.class, null, value);
    }

}
