package com.microservice.cuenta.service;

import com.microservice.cuenta.entities.Cuenta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaServiceImpl implements ICuentaService{

    @Autowired
    private ICuentaService cuentaService;

    @Override
    public void save(Cuenta cuenta) {
        cuentaService.save(cuenta);
    }

    @Override
    public Cuenta findById(Long id) {
        return cuentaService.findById(id);
    }

    @Override
    public List<Cuenta> findAll() {
        return (List<Cuenta>) cuentaService.findAll();
    }
}
