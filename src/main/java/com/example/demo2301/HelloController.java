package com.example.demo2301;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Entering hello() method");
        String result = "Hello, World!";
        System.out.println("Exiting hello() method with result: " + result);
        return result;
    }

    @GetMapping("/reverse")
    public String reverseString(@RequestParam("input") String input) {
        System.out.println("Entering reverseString() method with input: " + input);
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        String result = reversed.toString();
        System.out.println("Exiting reverseString() method with result: " + result);
        return result;
    }

    // operación para eliminar las vocales de una cadena
    @GetMapping("/removeVowels")
    public String removeVowels(@RequestParam("input") String input) {
        System.out.println("Entering removeVowels() method with input: " + input);
        String result = input.replaceAll("[aeiouAEIOU]", "");
        System.out.println("Exiting removeVowels() method with result: " + result);
        return result;
    }

    
}