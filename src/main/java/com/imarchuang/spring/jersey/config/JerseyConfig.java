package com.imarchuang.spring.jersey.config;

import com.imarchuang.spring.jersey.endpoint.Endpoint;
import com.imarchuang.spring.jersey.endpoint.ReverseEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * User: marchuang <br/>
 * Date: 2017-10-06 <br/>
 */
@Component
public class JerseyConfig extends ResourceConfig{
    public JerseyConfig() {
        register(Endpoint.class);
        register(ReverseEndpoint.class);
    }
}
