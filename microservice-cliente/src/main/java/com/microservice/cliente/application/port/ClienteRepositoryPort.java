package com.microservice.cliente.application.port;

import com.microservice.cliente.domain.Cliente;

import java.util.Optional;

public interface ClienteRepositoryPort {

    Cliente save(Cliente cliente);

    Optional<Cliente> findById(Long id);

    void deleteById(Long id);
}

