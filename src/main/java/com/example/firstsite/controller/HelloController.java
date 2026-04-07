package com.example.firstsite.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Запуск для тестовой проверки работоспособности сайта осуществляется на:
 *      http://localhost:9090/
 */

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello world!";
    }
}