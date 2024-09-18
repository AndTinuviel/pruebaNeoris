package com.microservice.cliente.domain;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cliente extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clienteId;
    @Column(unique = true)
    private String contraseña;
    private boolean estado;
}