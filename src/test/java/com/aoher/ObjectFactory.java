package com.aoher;

import com.aoher.model.Hello;
import com.aoher.model.HelloResponse;
import com.aoher.model.SayHello;
import com.aoher.model.SayHelloResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import static com.aoher.util.Constants.NAMESPACE;

@XmlRegistry
public class ObjectFactory {

    private static final QName _HelloResponse_QNAME = new QName(NAMESPACE, "HelloResponse");
    private static final QName _SayHello_QNAME = new QName(NAMESPACE, "sayHello");
    private static final QName _SayHelloResponse_QNAME = new QName(NAMESPACE, "sayHelloResponse");
    private static final QName _Hello_QNAME = new QName(NAMESPACE, "Hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.jboss.as.quickstarts.wshelloworld
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloResponse }
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link SayHello }
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     */
    @XmlElementDecl(namespace = NAMESPACE, name = "HelloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     */
    @XmlElementDecl(namespace = NAMESPACE, name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     */
    @XmlElementDecl(namespace = NAMESPACE, name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     */
    @XmlElementDecl(namespace = NAMESPACE, name = "Hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<>(_Hello_QNAME, Hello.class, null, value);
    }



}
