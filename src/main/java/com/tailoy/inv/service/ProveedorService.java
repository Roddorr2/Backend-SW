package com.tailoy.inv.service;

import com.tailoy.inv.dto.ProveedorDTO;
import com.tailoy.inv.model.Proveedor;
import com.tailoy.inv.repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProveedorService {

    private final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public List<ProveedorDTO> getAllProveedores() {
        List<Proveedor> proveedores = proveedorRepository.findAll();
        List<ProveedorDTO> dtos = new ArrayList<>();

        for (Proveedor p : proveedores) {
            ProveedorDTO dto = convertirADTO(p);
            dtos.add(dto);
        }
        return dtos;
    }

    public ProveedorDTO getProveedoresById(int id) {
        Proveedor proveedor = proveedorRepository.findById(id).orElse(null);

        if (proveedor == null)
            return null;

        return convertirADTO(proveedor);
    }

    public Proveedor saveProveedor(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    public void deleteProveedor(int id) {
        proveedorRepository.deleteById(id);
    }


    private ProveedorDTO convertirADTO(Proveedor proveedor) {
        ProveedorDTO dto = new ProveedorDTO();

        dto.setId(proveedor.getId());
        dto.setNombre(proveedor.getNombre());
        dto.setRuc(proveedor.getRuc());
        dto.setTelefono(proveedor.getTelefono());
        dto.setDireccion(proveedor.getDireccion());

        return dto;
    }
}
