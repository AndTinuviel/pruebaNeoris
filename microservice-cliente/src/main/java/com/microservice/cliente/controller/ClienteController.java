package com.microservice.cliente.controller;

import com.microservice.cliente.entities.Cliente;
import com.microservice.cliente.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private IClienteService clienteService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveCliente(@RequestBody Cliente cliente){
        clienteService.save(cliente);
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        return ResponseEntity.ok(clienteService.findClientById(id));
    }

    @GetMapping("/search-cuentas/{idCliente}")
    public ResponseEntity<?> findCuentasByIdCliente(@PathVariable Long idCliente){
        return ResponseEntity.ok(clienteService.findCuentaByIdCliente(idCliente));
    }

}
