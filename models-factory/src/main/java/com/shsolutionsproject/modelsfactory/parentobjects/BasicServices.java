package com.shsolutionsproject.modelsfactory.parentobjects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BasicServices {

    @Autowired
    protected RestTemplate restTemplate;

}
