package com.microservice.cuenta.persistence;

import com.microservice.cuenta.entities.Cuenta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CuentaRepository extends CrudRepository<Cuenta,Long> {



}
