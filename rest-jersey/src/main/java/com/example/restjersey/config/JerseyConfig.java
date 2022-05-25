package com.example.restjersey.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.example.restjersey.controller.TestResource;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        
        register(TestResource.class);
    }
}