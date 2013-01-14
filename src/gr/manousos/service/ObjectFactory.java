
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
    private final static QName _FinalSubmitE2Response_QNAME = new QName("http://service.manousos.gr/", "finalSubmitE2Response");
	private final static QName _GetE2DocByIdResponse_QNAME = new QName("http://service.manousos.gr/", "getE2DocByIdResponse");
	private final static QName _GetE2DocById_QNAME = new QName("http://service.manousos.gr/", "getE2DocById");
	private final static QName _FinalSubmitE2_QNAME = new QName("http://service.manousos.gr/", "finalSubmitE2");
	private final static QName _RegisterResponse_QNAME = new QName("http://service.manousos.gr/", "RegisterResponse");
    private final static QName _Register_QNAME = new QName("http://service.manousos.gr/", "Register");
    private final static QName _RegisterTaxPayer_QNAME = new QName("http://service.manousos.gr/", "RegisterTaxPayer");
    private final static QName _RegisterTaxPayerResponse_QNAME = new QName("http://service.manousos.gr/", "RegisterTaxPayerResponse");
    private final static QName _GetTaxPayerById_QNAME = new QName("http://service.manousos.gr/", "getTaxPayerById");
    private final static QName _GetTaxPayerByIdResponse_QNAME = new QName("http://service.manousos.gr/", "getTaxPayerByIdResponse");
    private final static QName _Test_QNAME = new QName("http://service.manousos.gr/", "test");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gr.manousos.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetE2DocByIdResponse }
     * 
     */
    public GetE2DocByIdResponse createGetE2DocByIdResponse() {
        return new GetE2DocByIdResponse();
    }

	/**
     * Create an instance of {@link FinalSubmitE2Response }
     * 
     */
    public FinalSubmitE2Response createFinalSubmitE2Response() {
        return new FinalSubmitE2Response();
    }

	/**
     * Create an instance of {@link GetTaxPayerById }
     * 
     */
    public GetTaxPayerById createGetTaxPayerById() {
        return new GetTaxPayerById();
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
     * Create an instance of {@link FinalSubmitE2 }
     * 
     */
    public FinalSubmitE2 createFinalSubmitE2() {
        return new FinalSubmitE2();
    }

	/**
     * Create an instance of {@link GetE2DocById }
     * 
     */
    public GetE2DocById createGetE2DocById() {
        return new GetE2DocById();
    }

	/**
     * Create an instance of {@link GetTaxPayerByIdResponse }
     * 
     */
    public GetTaxPayerByIdResponse createGetTaxPayerByIdResponse() {
        return new GetTaxPayerByIdResponse();
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
     * Create an instance of {@link E2CoOwner }
     * 
     */
    public E2CoOwner createE2CoOwner() {
        return new E2CoOwner();
    }

	/**
     * Create an instance of {@link Taxpayer }
     * 
     */
    public Taxpayer createTaxpayer() {
        return new Taxpayer();
    }

    /**
     * Create an instance of {@link E2Estate }
     * 
     */
    public E2Estate createE2Estate() {
        return new E2Estate();
    }

	/**
     * Create an instance of {@link E2OtherEstate }
     * 
     */
    public E2OtherEstate createE2OtherEstate() {
        return new E2OtherEstate();
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
     * Create an instance of {@link E2Id }
     * 
     */
    public E2Id createE2Id() {
        return new E2Id();
    }

	/**
     * Create an instance of {@link E2 }
     * 
     */
    public E2 createE2() {
        return new E2();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FinalSubmitE2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "finalSubmitE2Response")
    public JAXBElement<FinalSubmitE2Response> createFinalSubmitE2Response(FinalSubmitE2Response value) {
        return new JAXBElement<FinalSubmitE2Response>(_FinalSubmitE2Response_QNAME, FinalSubmitE2Response.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetE2DocByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "getE2DocByIdResponse")
    public JAXBElement<GetE2DocByIdResponse> createGetE2DocByIdResponse(GetE2DocByIdResponse value) {
        return new JAXBElement<GetE2DocByIdResponse>(_GetE2DocByIdResponse_QNAME, GetE2DocByIdResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetE2DocById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "getE2DocById")
    public JAXBElement<GetE2DocById> createGetE2DocById(GetE2DocById value) {
        return new JAXBElement<GetE2DocById>(_GetE2DocById_QNAME, GetE2DocById.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinalSubmitE2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "finalSubmitE2")
    public JAXBElement<FinalSubmitE2> createFinalSubmitE2(FinalSubmitE2 value) {
        return new JAXBElement<FinalSubmitE2>(_FinalSubmitE2_QNAME, FinalSubmitE2 .class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "RegisterResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "Register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterTaxPayer }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "RegisterTaxPayer")
    public JAXBElement<RegisterTaxPayer> createRegisterTaxPayer(RegisterTaxPayer value) {
        return new JAXBElement<RegisterTaxPayer>(_RegisterTaxPayer_QNAME, RegisterTaxPayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterTaxPayerResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "RegisterTaxPayerResponse")
    public JAXBElement<RegisterTaxPayerResponse> createRegisterTaxPayerResponse(RegisterTaxPayerResponse value) {
        return new JAXBElement<RegisterTaxPayerResponse>(_RegisterTaxPayerResponse_QNAME, RegisterTaxPayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaxPayerById }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "getTaxPayerById")
    public JAXBElement<GetTaxPayerById> createGetTaxPayerById(GetTaxPayerById value) {
        return new JAXBElement<GetTaxPayerById>(_GetTaxPayerById_QNAME, GetTaxPayerById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaxPayerByIdResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.manousos.gr/", name = "getTaxPayerByIdResponse")
    public JAXBElement<GetTaxPayerByIdResponse> createGetTaxPayerByIdResponse(GetTaxPayerByIdResponse value) {
        return new JAXBElement<GetTaxPayerByIdResponse>(_GetTaxPayerByIdResponse_QNAME, GetTaxPayerByIdResponse.class, null, value);
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
