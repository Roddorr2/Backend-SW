package com.tailoy.inv.service;

import com.tailoy.inv.dto.SucursalDTO;
import com.tailoy.inv.model.Sucursal;
import com.tailoy.inv.repository.SucursalRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SucursalService {
    private final SucursalRepository sucursalRepository;

    public SucursalService(SucursalRepository sucursalRepository) {
        this.sucursalRepository = sucursalRepository;
    }

    public List<SucursalDTO> getAllSucursales() {
        List<Sucursal> sucursales = sucursalRepository.findAll();
        List<SucursalDTO> dtos = new ArrayList<>();

        for (Sucursal s : sucursales) {
            SucursalDTO dto = convertirADTO(s);
            dtos.add(dto);
        }
        return dtos;
    }

    public SucursalDTO getSucursalesById(int id) {
        Sucursal sucursal = sucursalRepository.findById(id).orElse(null);

        if (sucursal == null)
            return null;

        return convertirADTO(sucursal);
    }

    public Sucursal saveSucursal(Sucursal sucursal) {
        return sucursalRepository.save(sucursal);
    }

    public void deleteSucursal(int id) {
        sucursalRepository.deleteById(id);
    }


    private SucursalDTO convertirADTO(Sucursal sucursal) {
        SucursalDTO dto = new SucursalDTO();

        dto.setId(sucursal.getId());
        dto.setCiudad(sucursal.getCiudad());
        dto.setCorreo(sucursal.getCorreo());
        dto.setDireccion(sucursal.getDireccion());

        return dto;
    }
}
