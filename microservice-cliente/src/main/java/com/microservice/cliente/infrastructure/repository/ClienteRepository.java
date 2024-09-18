package com.microservice.cliente.infrastructure.repository;

import com.microservice.cliente.application.port.ClienteRepositoryPort;
import com.microservice.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>, ClienteRepositoryPort {
    @Override
    Optional<Cliente> findById(Long id);
}
