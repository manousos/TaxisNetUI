package gr.manousos.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2013-01-13T20:25:36.518+02:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://service.manousos.gr/", name = "UserSrv")
@XmlSeeAlso({ObjectFactory.class})
public interface UserSrv {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "test", targetNamespace = "http://service.manousos.gr/", className = "gr.manousos.service.Test")
    @WebMethod
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://service.manousos.gr/", className = "gr.manousos.service.TestResponse")
    public java.lang.String test(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getTaxPayerById", targetNamespace = "http://service.manousos.gr/", className = "gr.manousos.service.GetTaxPayerById")
    @WebMethod
    @ResponseWrapper(localName = "getTaxPayerByIdResponse", targetNamespace = "http://service.manousos.gr/", className = "gr.manousos.service.GetTaxPayerByIdResponse")
    public gr.manousos.service.Taxpayer getTaxPayerById(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "Register", targetNamespace = "http://service.manousos.gr/", className = "gr.manousos.service.Register")
    @WebMethod(operationName = "Register")
    @ResponseWrapper(localName = "RegisterResponse", targetNamespace = "http://service.manousos.gr/", className = "gr.manousos.service.RegisterResponse")
    public gr.manousos.service.Taxpayer register(
        @WebParam(name = "arg0", targetNamespace = "")
        gr.manousos.service.Taxpayer arg0
    );

    @RequestWrapper(localName = "RegisterTaxPayer", targetNamespace = "http://service.manousos.gr/", className = "gr.manousos.service.RegisterTaxPayer")
    @WebMethod(operationName = "RegisterTaxPayer")
    @ResponseWrapper(localName = "RegisterTaxPayerResponse", targetNamespace = "http://service.manousos.gr/", className = "gr.manousos.service.RegisterTaxPayerResponse")
    public void registerTaxPayer(
        @WebParam(name = "arg0", targetNamespace = "")
        gr.manousos.service.Taxpayer arg0
    );
}