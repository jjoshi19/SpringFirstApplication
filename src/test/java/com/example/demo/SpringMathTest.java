package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(SpringMath.class)
public class SpringMathTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetPI() throws Exception{
        this.mvc.perform(get("/math/pi").accept(MediaType.ALL))
                .andExpect(status().isOk())
                .andExpect(content().string("3.141592653589793"));
    }
}
