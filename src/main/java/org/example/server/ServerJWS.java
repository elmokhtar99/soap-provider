package org.example.server;

import org.example.ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8084/",new BanqueService());
    }

}
