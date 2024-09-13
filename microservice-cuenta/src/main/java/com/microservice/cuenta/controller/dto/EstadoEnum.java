package com.microservice.cuenta.controller.dto;

public enum EstadoEnum {

    ACT ("Activo"),
    INA ("Inactivo");

    private String valor;

    EstadoEnum(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

}
