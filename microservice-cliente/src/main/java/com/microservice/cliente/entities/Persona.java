package com.microservice.cliente.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Persona {


    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "GENERO")
    private String genero;

    @Column(name = "EDAD")
    private Long edad;

    @Column(name = "IDENTIFICACION")
    private String identificacion;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "TELEFONO")
    private String telefono;


}
