package com.Fizzbuzz.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@RunWith(SpringRunner.class)
@WebMvcTest(FizzBuzzController.class)
class FIzzBuzzControllerTest {

    @Autowired
    private MockMvc mock;
    @MockBean
    private FizzBuzzService service;

    @Test
    void CheckInput() throws Exception
    {
        when(service.execute(anyInt())).thenReturn(anyList());
        mock.perform(
                get("/api/bound/3"))
                .andExpect(status().isOk());
        mock.perform(
                        get("/api/bound/q"))
                        .andExpect(status().isBadRequest());
        verify(service, times(1)).execute(3);


    }
}
