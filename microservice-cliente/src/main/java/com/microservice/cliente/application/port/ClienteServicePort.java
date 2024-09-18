package com.microservice.cliente.application.port;

import com.microservice.cliente.application.port.DTOs.ClienteDTO;

public interface ClienteServicePort {
    ClienteDTO createCliente(ClienteDTO clienteDTO);
    ClienteDTO getCliente(Long id);
    // Otros métodos
}