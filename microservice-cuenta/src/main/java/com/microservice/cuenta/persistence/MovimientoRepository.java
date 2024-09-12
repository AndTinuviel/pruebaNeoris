package com.microservice.cuenta.persistence;

import com.microservice.cuenta.entities.Movimiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepository extends CrudRepository<Movimiento, Long> {



}
