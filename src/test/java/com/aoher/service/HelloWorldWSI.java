package com.aoher.service;

import com.aoher.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import static com.aoher.util.Constants.NAMESPACE;

@WebService(name = "HelloWorldWS", targetNamespace = NAMESPACE)
@XmlSeeAlso({
        ObjectFactory.class
})
public interface HelloWorldWSI {

    /**
     *
     * @param arg0 param
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(
            localName = "sayHello",
            targetNamespace = NAMESPACE,
            className = "com.aoher.model.SayHello")
    @ResponseWrapper(
            localName = "sayHelloResponse",
            targetNamespace = NAMESPACE,
            className = "com.aoher.model.SayHelloResponse")
    String sayHello(@WebParam(name = "arg0", targetNamespace = "") String arg0);

    @WebMethod(operationName = "Hello")
    @RequestWrapper(
            localName = "Hello",
            targetNamespace = NAMESPACE,
            className = "com.aoher.model.Hello")
    @ResponseWrapper(
            localName = "HelloResponse",
            targetNamespace = NAMESPACE,
            className = "com.aoher.model.HelloResponse")
    void hello();

}
