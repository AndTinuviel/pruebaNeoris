package com.microservice.cuenta.service;

import com.microservice.cuenta.entities.Cuenta;

import java.util.List;

public interface ICuentaService {

    void save(Cuenta cuenta);

    Cuenta findById(Long id);

    List<Cuenta> findAll();

}
