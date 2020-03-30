package com.aoher.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public class HelloWorldWS {

    private static final Logger log = LoggerFactory.getLogger(HelloWorldWS.class);

    private static final String MESSAGE = "Hello, ";

    /**
     * Empty method declaration
     */
    public void Hello() {
    }

    /**
     * The purpose of this method is to combine the
     * argument with the String constant above as a
     * response to the web service call.
     *
     * @param name The name or string value passed to the method
     *
     * @return String "Hello, <name>!"
     */

    @WebMethod
    public String sayHello(String name) {
        String returnMessage = MESSAGE + name + "!";
        log.info("Return message: {}", returnMessage);
        return returnMessage;
    }
}
