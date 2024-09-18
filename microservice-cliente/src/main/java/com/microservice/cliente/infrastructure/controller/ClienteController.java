package com.microservice.cliente.infrastructure.controller;

import com.microservice.cliente.application.port.ClienteServicePort;
import com.microservice.cliente.application.port.DTOs.ClienteDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    @Autowired
    private ClienteServicePort clienteService; // Inyección usando @Autowired

    @PostMapping
    public ResponseEntity<ClienteDTO> createCliente(@RequestBody ClienteDTO clienteDTO) {
        return ResponseEntity.ok(clienteService.createCliente(clienteDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteDTO> getCliente(@PathVariable Long id) {
        Optional<ClienteDTO> clienteDTO = Optional.ofNullable(clienteService.getCliente(id));
        return clienteDTO.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}