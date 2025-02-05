package com.commerce.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * explain the Class File
 *
 * @author : choiseongho
 * @fileName : TestController.java
 * @since : 2025-01-24
 */
@RestController
public class TestController {
    @GetMapping
    public String test() {
        System.out.println("22222222222222222222222222222222222222");
        return "lllllllllllllllllllllllllllllloooooooooooooooooooooooooooooooooooooooogggggggggggggggggggggggggggggggg";
    }
   
}
