package com.example.demo2301;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHelloEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hello, World!"));
    }

    @Test
    public void testReverseStringEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/reverse").param("input", "hello"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("olleh"));
    }

    @Test
    public void testReverseStringEndpointWithSpaces() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/reverse").param("input", "hello world"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("dlrow olleh"));
    }

    @Test
    public void testReverseStringEndpointWithSpecialCharacters() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/reverse").param("input", "hello, world!"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("!dlrow ,olleh"));
    }

    @Test
    public void testRemoveVowelsEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/removeVowels").param("input", "Hello, World!"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hll, Wrld!"));
    }

    @Test
    public void testRemoveVowelsEndpointWithSpaces() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/removeVowels").param("input", "Hello, World!"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hll, Wrld!"));
    }

    @Test
    public void testRemoveVowelsEndpointWithSpecialCharacters() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/removeVowels").param("input", "Hello, World!"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("Hll, Wrld!"));
    }
    
}