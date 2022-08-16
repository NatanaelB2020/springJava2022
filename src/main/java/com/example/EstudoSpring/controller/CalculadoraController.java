package com.example.EstudoSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/calculadora")
public class CalculadoraController {

    // /calculadora /soma /10 /20

    // caculadora /subtrair ?a=10&b=20
    Integer numA = 20;
    Integer numB = 10;
    Integer soma = numA + numB;

    Integer subtrair = numA - numB;

    Integer dividir = numA / numB;

    Integer multiplicar = numA * numB;


    @GetMapping("/somar")
    public int somar() {
        return soma;
    }

    @GetMapping("/subtrair")
    public int subtrair(){
        return subtrair;
    }

    @GetMapping("/dividir")
    public int dividir() {
        return dividir;
    }
    @GetMapping("/multiplicar")
    public int multiplicar() {
        return multiplicar;
    }
}