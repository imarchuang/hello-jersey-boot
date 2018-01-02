package com.imarchuang.spring.jersey.endpoint;

import com.imarchuang.spring.jersey.service.Service;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * User: marchuang <br/>
 * Date: 2017-10-06 <br/>
 */
@Component
@Path("/hello")
public class Endpoint {
    private final Service service;

    public Endpoint(Service service) {
        this.service = service;
    }

    @GET
    public String message() {
        return "Hello " + this.service.message();
    }
}
