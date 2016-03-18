package com.javaninja.spring.boot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by norris on 3/2/2016.
 */
@RestController
public class MyController {

    @RequestMapping("/index")
    public String index() {
        return "Greetings";
    }
}
