package com.example.EstudoSpring.controller;

import com.example.EstudoSpring.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(25, "Arthur King", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obeterClienteId(@PathVariable int id){
        return new Cliente(id, "Margareth", "987.654.321-00");
    }

}
