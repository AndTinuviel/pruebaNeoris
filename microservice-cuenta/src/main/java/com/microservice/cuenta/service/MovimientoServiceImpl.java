package com.microservice.cuenta.service;

import com.microservice.cuenta.entities.Movimiento;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovimientoServiceImpl implements IMovimientoService{

    @Autowired
    private IMovimientoService movimientoService;

    @Override
    public void save(Movimiento movimiento) {
        movimientoService.save(movimiento);
    }

    @Override
    public Movimiento findById(Long id) {
        return movimientoService.findById(id);
    }

    @Override
    public List<Movimiento> findAll() {
        return (List<Movimiento>) movimientoService.findAll();
    }

    @Override
    public void delete(Long id) {
        movimientoService.delete(id);
    }
}
