package com.javaninja.springboot.web;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


//@ImportResource({"classpath:health-check-context.xml", "classpath:settings-repo-context.xml"})
//@ImportResource({"classpath:health-check-context.xml"})
@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebApplication.class);
    }

    //public static void main(String[] args) throws Exception {
    //    SpringApplication.run(WebApplication.class, args);
    //}
}