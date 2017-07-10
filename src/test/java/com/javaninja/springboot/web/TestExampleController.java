package com.javaninja.springboot.web;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.fail;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


/**
 * @author norris.shelton
 */
@RunWith(SpringRunner.class)
@WebMvcTest(ExampleController.class)
public class TestExampleController {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testExampleBoolean() {
        try {
            mvc.perform(get("/example/boolean")
                            .accept(MediaType.APPLICATION_JSON))
               .andExpect(status().isOk())
               .andExpect(content().string("true"));
        } catch (Exception e) {
            fail(e.toString());
        }
    }
}
