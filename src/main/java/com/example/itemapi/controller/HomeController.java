package com.example.itemapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return """
               ✅ Item API is running successfully!

               Available Endpoints:
               POST /api/items       → Add new item
               GET  /api/items/{id}  → Get item by ID

               Test using Postman.
               """;
    }
}
