package com.Fizzbuzz.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
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
        when(service.execute(anyInt())).thenReturn("placeholder");
        mock.perform(
                get("/api/bound/3"))
                .andExpect(status().isOk())
                .andExpect(content().string("placeholder"));
        verify(service, times(1)).execute(3);
    }
}
