package com.tptrain.soapserver;

import javax.xml.ws.WebFault;

@WebFault(name = "FactureNotFoundFault")
public class FactureNotFoundFault extends RuntimeException {
    public FactureNotFoundFault(String message) {
        super(message);
    }
}
