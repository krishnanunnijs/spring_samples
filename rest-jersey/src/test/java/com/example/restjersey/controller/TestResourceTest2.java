package com.example.restjersey.controller;

import static org.junit.Assert.assertEquals;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.restjersey.RestJerseyApplication;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class TestResourceTest2 extends JerseyTest {

	@Test
	public void hello1() {
		final javax.ws.rs.core.Response response = target("/test").request().get();

		assertEquals(HttpStatus.OK.value(), response.getStatus());
		assertEquals(MediaType.TEXT_PLAIN, response.getMediaType().toString());

	}
	
	@Override
    protected Application configure() {
        final ApplicationContext context = new AnnotationConfigApplicationContext(RestJerseyApplication.class);
        return new ResourceConfig(TestResource.class).property("contextConfig", context);
    }

}
