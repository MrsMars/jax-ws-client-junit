package com.aoher;

import com.aoher.service.HelloWorldWSI;
import com.aoher.service.HelloWorldWSService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.WebServiceRef;

import static com.aoher.util.Constants.WSDL_LOCATION;
import static org.junit.Assert.assertEquals;

public class JaxWsClientTest {

    private static final Logger log = LoggerFactory.getLogger(JaxWsClientTest.class);

    /**
     * The @WebServiceRef annotation is used to define a reference
     * to a web service and an injection target for it.
     */
    @WebServiceRef(wsdlLocation = WSDL_LOCATION)
    private static HelloWorldWSService serviceProxy = new HelloWorldWSService();

    /**
     * The purpose of this method is to execute a JUnit4 test.  This
     * method will invoke the web service that was deployed earlier
     * as part of this quickstart.  The web service must be deployed
     * prior to executing this class.
     *
     * The @Test annotation marks this method to be run by JUnit4.
     */
    @Test
    public void test() {
        log.info("\nBegin test of HelloWorld Web Service");

        HelloWorldWSI port = serviceProxy.getHelloWorldWSPort();
        String result = port.sayHello("world");

        log.info("Result: {}", result);

        assertEquals("Hello, world!", result);

        log.info("End test of HelloWorld Web Service\n");
    }

}
