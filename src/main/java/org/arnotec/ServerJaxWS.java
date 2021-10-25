package org.arnotec;

import org.arnotec.ws.BankWS;

import javax.xml.ws.Endpoint;

public class ServerJaxWS {
    public static void main (String... args) {
        String url = "http://0.0.0.0:8585/";
        Endpoint.publish(url, new BankWS());
        System.out.println("Web service deployed on : " + url );
    }
}
