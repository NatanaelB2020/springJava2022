package com.example.EstudoSpring.controller;

import com.example.EstudoSpring.entity.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(25, "Arthur King", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obeterClienteId1(@PathVariable int id){
        return new Cliente(id, "Margareth", "987.654.321-00");
    }

    @GetMapping
    public Cliente obeterClienteId2(@RequestParam(name = "id", defaultValue = "656") int id){
        return new Cliente(id, "Francisquina", "567.564.321-00");
    }

}
