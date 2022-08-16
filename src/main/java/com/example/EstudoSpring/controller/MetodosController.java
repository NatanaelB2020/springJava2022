package com.example.EstudoSpring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosController {

    @GetMapping
    public String get() {
        return "Requisição GET";
    }

    @PostMapping("/post")
    public String post() {
        return "Requisição POST";
    }

    @PutMapping
    public String put() {
        return "Requisição PUT";
    }

    @DeleteMapping
    public String patch() {
        return "Requisição PATCH";
    }

    public String delete() {
        return "Requisição DELETE";
    }
}
