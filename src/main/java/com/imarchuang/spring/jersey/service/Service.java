package com.imarchuang.spring.jersey.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * User: marchuang <br/>
 * Date: 2017-10-06 <br/>
 */
@Component
public class Service {
    @Value("${message:World}")
    private String msg;

    public String message() {
        return this.msg;
    }
}
