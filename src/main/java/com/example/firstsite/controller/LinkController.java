package com.example.firstsite.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class LinkController {

    @PostMapping("/shorten")
    public Map<String, String> shortenLink(@RequestBody Map<String, String> request) {

        // 1. Получаем ссылку из запроса
        String originalUrl = request.get("url");

        // 2. Выводим в консоль (чтобы убедиться, что ссылка пришла)
        System.out.println("Получена ссылка: " + originalUrl);

        // 3. Создаем ответ
        Map<String, String> response = new HashMap<>();
        response.put("message", "Ссылка получена_!");
        response.put("shortUrl", originalUrl + "_Hello"); // пока возвращаем ту же ссылку

        // 4. Возвращаем ответ
        return response;
    }
}