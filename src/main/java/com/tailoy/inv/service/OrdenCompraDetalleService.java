package com.tailoy.inv.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tailoy.inv.dto.OrdenCompraDTO;
import com.tailoy.inv.dto.OrdenCompraDetalleDTO;
import com.tailoy.inv.dto.ProductoDTO;
import com.tailoy.inv.model.OrdenCompraDetalle;
import com.tailoy.inv.repository.OrdenCompraDetalleRepository;

@Service
public class OrdenCompraDetalleService {
	private final OrdenCompraDetalleRepository ordenCompralDetalleRepository;

    public OrdenCompraDetalleService(OrdenCompraDetalleRepository ordenCompralDetalleRepository) {
        this.ordenCompralDetalleRepository = ordenCompralDetalleRepository;
    }

    public List<OrdenCompraDetalleDTO> getAllOrdenes() {
        List<OrdenCompraDetalle> ordenCompraDetalles = ordenCompralDetalleRepository.findAll();
        List<OrdenCompraDetalleDTO> dtos = new ArrayList<>();

        for (OrdenCompraDetalle ocd : ordenCompraDetalles) {
        	OrdenCompraDetalleDTO dto = convertirADTO(ocd);
            dtos.add(dto);
        }
        return dtos;
    }

    public OrdenCompraDetalle saveOrden(OrdenCompraDetalle ocd) {
        return ordenCompralDetalleRepository.save(ocd);
    }

    public void deleteOrden(int id) {
    	ordenCompralDetalleRepository.deleteById(id);
    }

    private OrdenCompraDetalleDTO convertirADTO(OrdenCompraDetalle ocd) {
    	OrdenCompraDetalleDTO dto = new OrdenCompraDetalleDTO();

        dto.setId(ocd.getId());
        dto.setProducto(new ProductoDTO(ocd.getProducto()));
        dto.setCantidad(ocd.getCantidad());
        dto.setObservaciones(ocd.getObservaciones());
        dto.setOrdenCompra(new OrdenCompraDTO(ocd.getOrdenCompra()));
        
        return dto;
    }

}
