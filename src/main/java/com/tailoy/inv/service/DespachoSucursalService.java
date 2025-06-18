package com.tailoy.inv.service;

import com.tailoy.inv.dto.DespachoSucursalDTO;
import com.tailoy.inv.dto.SucursalDTO;
import com.tailoy.inv.model.DespachoSucursal;
import com.tailoy.inv.repository.DespachoSucursalRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DespachoSucursalService {
    private final DespachoSucursalRepository despachoSucursalRepository;

    public DespachoSucursalService(DespachoSucursalRepository despachoSucursalRepository) {
        this.despachoSucursalRepository = despachoSucursalRepository;
    }

    public List<DespachoSucursalDTO> getAllDespachos() {
        List<DespachoSucursal> despachoSucursales = despachoSucursalRepository.findAll();
        List<DespachoSucursalDTO> dtos = new ArrayList<>();

        for (DespachoSucursal ds : despachoSucursales) {
            DespachoSucursalDTO dto = convertirADTO(ds);
            dtos.add(dto);
        }
        return dtos;
    }

    public DespachoSucursal saveDespacho(DespachoSucursal ds) {
        return despachoSucursalRepository.save(ds);
    }

    public void deleteDespacho(int id) {
        despachoSucursalRepository.deleteById(id);
    }

    private DespachoSucursalDTO convertirADTO(DespachoSucursal ds) {
        DespachoSucursalDTO dto = new DespachoSucursalDTO();

        dto.setId(ds.getId());
        dto.setFecha(ds.getFecha());
        dto.setEstadoOperacion(ds.getEstadoOperacion());
        // dto.setSucursal(new SucursalDTO(ds.getSucursal()));

        return dto;
    }
}
