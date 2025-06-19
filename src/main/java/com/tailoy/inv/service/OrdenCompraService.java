package com.tailoy.inv.service;

import com.tailoy.inv.dto.OrdenCompraDTO;
import com.tailoy.inv.dto.ProveedorDTO;
import com.tailoy.inv.model.OrdenCompra;
import com.tailoy.inv.repository.OrdenCompraRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrdenCompraService {
    private final OrdenCompraRepository ordenCompraRepository;

    public OrdenCompraService(OrdenCompraRepository OrdenCompraRepository) {
        this.ordenCompraRepository = OrdenCompraRepository;
    }

    public List<OrdenCompraDTO> getAllOrdenCompras() {
        List<OrdenCompra> ordenCompras = ordenCompraRepository.findAll();
        List<OrdenCompraDTO> dtos = new ArrayList<>();

        for (OrdenCompra oc : ordenCompras) {
            OrdenCompraDTO dto = convertirADTO(oc);
            dtos.add(dto);
        }
        return dtos;
    }

    public OrdenCompra saveOrdenCompra(OrdenCompra oc) {
        return ordenCompraRepository.save(oc);
    }

    public void deleteOrden(int id) {
        ordenCompraRepository.deleteById(id);
    }

    private OrdenCompraDTO convertirADTO(OrdenCompra oc) {
        OrdenCompraDTO dto = new OrdenCompraDTO();

        dto.setId(oc.getId());
        dto.setFecha(oc.getFecha());
        dto.setEstadoOperacion(oc.getEstadoOperacion());
        dto.setProveedor(new ProveedorDTO(oc.getProveedor()));
        
        return dto;
    }
}
