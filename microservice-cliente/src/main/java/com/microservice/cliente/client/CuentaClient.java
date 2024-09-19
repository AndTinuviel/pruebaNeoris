package com.microservice.cliente.client;

import com.microservice.cliente.controller.DTOs.CuentaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "msvc-cuenta", url = "localhost:9090/api/cuentas")
public interface CuentaClient {

    @GetMapping("/search-by-cliente/{codigoCliente}")
    List<CuentaDTO> findCuentaByCliente(@PathVariable Long codigoCliente);

}
