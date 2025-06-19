package com.tailoy.inv.service;

import com.tailoy.inv.dto.MovimientoAlmacenDTO;
import com.tailoy.inv.dto.MovimientoAlmacenDetalleDTO;
import com.tailoy.inv.dto.ProductoDTO;
import com.tailoy.inv.model.MovimientoAlmacen;
import com.tailoy.inv.model.MovimientoAlmacenDetalle;
import com.tailoy.inv.repository.MovimientoAlmacenDetalleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoAlmacenDetalleService {
    private final MovimientoAlmacenDetalleRepository movimientoAlmacenDetalleRepository;

    public MovimientoAlmacenDetalleService(MovimientoAlmacenDetalleRepository movimientoAlmacenDetalleRepository) {
        this.movimientoAlmacenDetalleRepository = movimientoAlmacenDetalleRepository;
    }

    public List<MovimientoAlmacenDetalleDTO> getAllMovimientoDetalles() {
        List<MovimientoAlmacenDetalle> movimientoAlmacenDetalle = movimientoAlmacenDetalleRepository.findAll();
        List<MovimientoAlmacenDetalleDTO> dtos = new ArrayList<>();

        for (MovimientoAlmacenDetalle mad : movimientoAlmacenDetalle) {
            MovimientoAlmacenDetalleDTO dto = convertirADTO(mad);
            dtos.add(dto);
        }
        return dtos;
    }

    public MovimientoAlmacenDetalleDTO getMovimientoDetalleById(int id) {
        MovimientoAlmacenDetalle mad = movimientoAlmacenDetalleRepository.findById(id).orElse(null);

        if (mad == null)
            return null;

        return convertirADTO(mad);
    }

    public MovimientoAlmacenDetalle saveMovimientoDetalle(MovimientoAlmacenDetalle mad) {
        return movimientoAlmacenDetalleRepository.save(mad);
    }

    public void deleteMovimientoDetalle(int id) {
        movimientoAlmacenDetalleRepository.deleteById(id);
    }

    private MovimientoAlmacenDetalleDTO convertirADTO(MovimientoAlmacenDetalle mad) {
        MovimientoAlmacenDetalleDTO dto = new MovimientoAlmacenDetalleDTO();

        dto.setId(mad.getId());
        dto.setMovimientoAlmacen(new MovimientoAlmacenDTO(mad.getMovimientoAlmacen()));
        dto.setProducto(new ProductoDTO(mad.getProducto()));

        return dto;
    }
}
