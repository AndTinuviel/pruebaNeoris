package com.microservice.cuenta.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@Table(name="CUENTA")
@AllArgsConstructor
@NoArgsConstructor
public class Cuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO_CUENTA")
    private Long id;

    @Column(name = "NUMERO_CUENTA")
    private String numeroCuenta;

    @Column(name = "TIPO_CUENTA")
    private TipoCuentaEnum tipoCuenta;

    @Column(name = "SALDO_INICIAL")
    private Float saldoInicial;

    @Column(name = "SALDO_ACTUAL")
    private Float saldoActual;

    @Column(name = "ESTADO")
    private EstadoEnum estado;

    @OneToMany(mappedBy = "cuenta")
    private List<Movimiento> listaMovimientos;

    private Long cliente;




}
