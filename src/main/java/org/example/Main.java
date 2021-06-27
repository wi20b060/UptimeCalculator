package org.example;

import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("server started");
        ResourceConfig rc = new ResourceConfig().packages("org.example");
        HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"),rc);
        System.out.println("server startd");

        try {
            System.in.read();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        server.stop(0);
        System.out.println("server stopped");



    }
}
