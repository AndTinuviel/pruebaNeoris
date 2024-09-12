package com.microservice.cliente.service;

import com.microservice.cliente.entities.Cliente;

public interface IClienteService {

    Cliente findClientById(Long id);

    void save(Cliente cliente);

}
