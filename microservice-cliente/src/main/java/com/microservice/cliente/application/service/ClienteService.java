package com.microservice.cliente.application.service;

import com.microservice.cliente.application.port.ClienteRepositoryPort;
import com.microservice.cliente.application.port.ClienteServicePort;
import com.microservice.cliente.application.port.DTOs.ClienteDTO;
import com.microservice.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService implements ClienteServicePort {

    @Autowired
    private ClienteRepositoryPort clienteRepository;

    @Override
    public ClienteDTO createCliente(ClienteDTO clienteDTO) {
        Cliente cliente = new Cliente();
        cliente.setNombre(clienteDTO.getNombre());
        cliente.setIdentificacion(clienteDTO.getIdentificacion());
        cliente.setTelefono(clienteDTO.getTelefono());
        // Mapea otros campos
        return mapToDTO(clienteRepository.save(cliente));
    }

    @Override
    public Optional<ClienteDTO> getCliente(Long id) {
        return clienteRepository.findById(id).map(this::mapToDTO);
    }

    // Mapear Cliente a ClienteDTO
    private ClienteDTO mapToDTO(Cliente cliente) {
        ClienteDTO dto = new ClienteDTO();
        dto.setId(cliente.getClienteId());
        dto.setNombre(cliente.getNombre());
        dto.setIdentificacion(cliente.getIdentificacion());
        dto.setTelefono(cliente.getTelefono());
        // Mapea otros campos
        return dto;
    }
}