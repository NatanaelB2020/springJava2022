package com.example.EstudoSpring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/calculadora")
public class CalculadoraController {

    // /calculadora /soma /10 /20

    // caculadora /subtrair ?a=10&b=20

    @GetMapping("/somar/{numA}/{numB}")
    public int somar(@PathVariable int numA, @PathVariable int numB) {
        return numA + numB;
    }

    @GetMapping("/subtrair/{numA}/{numB}")
    public int subtrair(int numA, int numB){
        return numA - numB;
    }

    @GetMapping("/dividir/{numA}/{numB}")
    public int dividir(@PathVariable int numA, @PathVariable int numB) {
        return numA / numB;
    }
    @GetMapping("/multiplicar/{numA}/{numB}")
    public int multiplicar(@PathVariable int numA, @PathVariable int numB) {
        return numA * numB;
    }
}