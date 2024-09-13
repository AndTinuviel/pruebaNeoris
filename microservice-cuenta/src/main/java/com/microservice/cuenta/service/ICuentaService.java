package com.microservice.cuenta.service;

import com.microservice.cuenta.entities.Cuenta;

import java.time.LocalDate;
import java.util.List;

public interface ICuentaService {

    void save(Cuenta cuenta);

    Cuenta findById(Long id);

    List<Cuenta> findAll();

    List<Cuenta> findByCliente(Long codigoCliente);

    List<Cuenta> findCuentasConMovimientos(Long clienteId, LocalDate fechaDesde, LocalDate fechaHasta) ;

}
