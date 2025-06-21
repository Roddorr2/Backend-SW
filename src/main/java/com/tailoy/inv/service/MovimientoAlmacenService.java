package com.tailoy.inv.service;

import com.tailoy.inv.dto.MovimientoAlmacenDTO;
import com.tailoy.inv.model.MovimientoAlmacen;
import com.tailoy.inv.repository.MovimientoAlmacenRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoAlmacenService {
    private final MovimientoAlmacenRepository movimientoAlmacenRepository;

    public MovimientoAlmacenService(MovimientoAlmacenRepository movimientoAlmacenRepository) {
        this.movimientoAlmacenRepository = movimientoAlmacenRepository;
    }

    public List<MovimientoAlmacenDTO> getAllMovimientos() {
        List<MovimientoAlmacen> MovimientoAlmacen = movimientoAlmacenRepository.findAll();
        List<MovimientoAlmacenDTO> dtos = new ArrayList<>();

        for (MovimientoAlmacen ma : MovimientoAlmacen) {
            MovimientoAlmacenDTO dto = convertirADTO(ma);
            dtos.add(dto);
        }
        return dtos;
    }

    public MovimientoAlmacenDTO getMovimientoAlmacenById(int id) {
        MovimientoAlmacen movimientoAlmacen = movimientoAlmacenRepository.findById(id).orElse(null);

        if (movimientoAlmacen == null)
            return null;

        return convertirADTO(movimientoAlmacen);
    }

    public MovimientoAlmacen saveMovimiento(MovimientoAlmacen ma) {
        return movimientoAlmacenRepository.save(ma);
    }

    public void deleteMovimiento(int id) {
        movimientoAlmacenRepository.deleteById(id);
    }

    private MovimientoAlmacenDTO convertirADTO(MovimientoAlmacen ma) {
        MovimientoAlmacenDTO dto = new MovimientoAlmacenDTO();

        dto.setId(ma.getId());
        dto.setCantidad(ma.getCantidad());
        dto.setTipoAlmacen(ma.getTipoAlmacen());

        return dto;
    }

}
