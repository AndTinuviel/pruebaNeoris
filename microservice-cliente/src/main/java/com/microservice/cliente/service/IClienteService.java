package com.microservice.cliente.service;

import com.microservice.cliente.entities.Cliente;
import com.microservice.cliente.http.response.CuentaByClienteResponse;

public interface IClienteService {

    Cliente findClientById(Long id);

    void save(Cliente cliente);

    CuentaByClienteResponse findCuentaByIdCliente(Long codigoCliente);
}
