package com.microservice.cuenta.persistence;

import com.microservice.cuenta.entities.Cuenta;
import com.microservice.cuenta.entities.Movimiento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CuentaRepository extends CrudRepository<Cuenta,Long> {

    List<Cuenta> findByCliente(Long codigoCliente);

    @Query("SELECT m FROM Movimiento m WHERE m.cuenta.id = :cuentaId AND m.fecha BETWEEN :fechaDesde AND :fechaHasta")
    List<Movimiento> findMovimientosByCuentaAndFechas(Long cuentaId, LocalDate fechaDesde, LocalDate fechaHasta);
}
