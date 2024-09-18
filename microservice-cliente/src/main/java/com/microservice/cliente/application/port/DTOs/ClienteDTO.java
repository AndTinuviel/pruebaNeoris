package com.microservice.cliente.application.port.DTOs;

import lombok.Data;

@Data
public class ClienteDTO {
    private Long id;
    private String nombre;
    private String identificacion;
    private String telefono;
    // Otros atributos
}

