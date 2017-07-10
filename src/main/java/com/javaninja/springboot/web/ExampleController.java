package com.javaninja.springboot.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExampleController {

    private Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/example/boolean")
    public Boolean exampleBoolean() {
        log.info("Eureka!");
        return true;
    }
}
