package com.aoher.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

import static com.aoher.util.Constants.NAMESPACE;
import static com.aoher.util.Constants.WSDL_LOCATION;

@WebServiceClient(
        name = "HelloWorldWSService",
        targetNamespace = NAMESPACE,
        wsdlLocation = WSDL_LOCATION)
public class HelloWorldWSService extends Service {

    private static final  URL HELLO_WORLD_SERVICE_WSDL_LOCATION;
    private static final Logger log = LoggerFactory.getLogger(HelloWorldWSService.class);

    static {
        URL url = null;
        try {
            URL baseUrl = HelloWorldWSService.class.getResource(".");
            url = new URL(baseUrl, WSDL_LOCATION);
        } catch (MalformedURLException e) {
            log.error("Failed to create URL for the wsdl Location: '{}', retrying as a local file", WSDL_LOCATION);
            log.error(e.getMessage());
        }
        HELLO_WORLD_SERVICE_WSDL_LOCATION = url;
    }

    public HelloWorldWSService() {
        super(HELLO_WORLD_SERVICE_WSDL_LOCATION, new QName(NAMESPACE, "HelloWorldWSService"));
    }

    public HelloWorldWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * @return returns HelloWorldWS
     */
    @WebEndpoint(name = "HelloWorldWSPort")
    public HelloWorldWSI getWorldWSPort() {
        return super.getPort(new QName(NAMESPACE, "HelloWorldWSPort"), HelloWorldWSI.class);
    }

    /**
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorldWS
     */
    @WebEndpoint(name = "HelloWorldWSPort")
    public HelloWorldWSI getHelloWorldWSPort(WebServiceFeature... features) {
        return super.getPort(new QName(NAMESPACE, "HelloWorldWSPort"), HelloWorldWSI.class, features);
    }
}
