package com.imarchuang.spring.jersey.endpoint;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 * User: marchuang <br/>
 * Date: 2017-10-06 <br/>
 */
@Component
@Path("/reverse")
public class ReverseEndpoint {
    @GET
    public String reverse(@QueryParam("input") @NotNull String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
