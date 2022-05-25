package com.example.restjersey.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Service;

@Service
@Path("/test")
public class TestResource {

    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello from Spring";
    }
}