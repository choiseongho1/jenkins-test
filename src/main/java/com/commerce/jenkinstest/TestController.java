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
    public void triggerError() {
        // 🚨 1. NullPointerException 발생 가능 (Bug)
        String str = null;
        System.out.println(str.length()); 

        // 🚨 2. 하드코딩된 비밀번호 (Security Issue)
        String password = "1234";

        // 🚨 3. 사용되지 않는 변수 (Code Smell)
        int unusedVariable = 42;

        // 🚨 4. 무한 루프 (Bug)
        while (true) {
            System.out.println("무한 루프 실행 중...");
        }
    }
}
