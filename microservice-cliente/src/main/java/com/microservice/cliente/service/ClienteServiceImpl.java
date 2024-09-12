package com.microservice.cliente.service;

import com.microservice.cliente.entities.Cliente;
import com.microservice.cliente.persistence.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl implements IClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente findClientById(Long id) {
        return clienteRepository.findClientById(id);
    }

    @Override
    public void save(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
