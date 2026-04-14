// Пакет контроллера
package com.example.firstsite.controller;

// Импорт аннотаций Spring
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Запуск для тестовой проверки работоспособности сайта осуществляется на:
 *      http://localhost:9090/hello
 */

// Аннотация @RestController означает, что класс обрабатывает HTTP-запросы
@RestController
public class HelloController {

    // @GetMapping("/") обрабатывает GET-запросы на корневой URL (/)
    @GetMapping("/hello")
    public String sayHello() {
        // Этот текст вернётся в браузер
        return "Hello world!";
    }
}