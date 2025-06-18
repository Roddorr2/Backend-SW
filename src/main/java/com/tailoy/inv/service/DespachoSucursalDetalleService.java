package com.tailoy.inv.service;

import com.tailoy.inv.dto.DespachoSucursalDetalleDTO;
import com.tailoy.inv.model.DespachoSucursalDetalle;
import com.tailoy.inv.repository.DespachoSucursalDetalleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DespachoSucursalDetalleService {
    private final DespachoSucursalDetalleRepository despachoSucursalDetalleRepository;

    public DespachoSucursalDetalleService(DespachoSucursalDetalleRepository despachoSucursalDetalleRepository) {
        this.despachoSucursalDetalleRepository = despachoSucursalDetalleRepository;
    }

    public List<DespachoSucursalDetalleDTO> getAllDespachos() {
        List<DespachoSucursalDetalle> despachoSucursaleDetalles = despachoSucursalDetalleRepository.findAll();
        List<DespachoSucursalDetalleDTO> dtos = new ArrayList<>();

        for (DespachoSucursalDetalle dsd : despachoSucursaleDetalles) {
            DespachoSucursalDetalleDTO dto = convertirADTO(dsd);
            dtos.add(dto);
        }
        return dtos;
    }

    public DespachoSucursalDetalle saveDespacho(DespachoSucursalDetalle ds) {
        return despachoSucursalDetalleRepository.save(ds);
    }

    public void deleteDespacho(int id) {
        despachoSucursalDetalleRepository.deleteById(id);
    }

    private DespachoSucursalDetalleDTO convertirADTO(DespachoSucursalDetalle dsd) {
        DespachoSucursalDetalleDTO dto = new DespachoSucursalDetalleDTO();

        dto.setId(dsd.getId());
        dto.setProducto(dsd.getProducto());


        return dto;
    }

}
