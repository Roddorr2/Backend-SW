package com.tailoy.inv.service;

import com.tailoy.inv.dto.MovimientoInventarioDTO;
import com.tailoy.inv.dto.ProductoDTO;
import com.tailoy.inv.dto.UsuarioDTO;
import com.tailoy.inv.model.MovimientoInventario;
import com.tailoy.inv.repository.MovimientoInventarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovimientoInventarioService {
    private final MovimientoInventarioRepository movimientoInventarioRepository;

    public MovimientoInventarioService(MovimientoInventarioRepository movimientoInventarioRepository) {
        this.movimientoInventarioRepository = movimientoInventarioRepository;
    }

    public List<MovimientoInventarioDTO> getAllMovimientosInventario() {
        List<MovimientoInventario> movimientoInventario = movimientoInventarioRepository.findAll();
        List<MovimientoInventarioDTO> dtos = new ArrayList<>();

        for (MovimientoInventario mi : movimientoInventario) {
            MovimientoInventarioDTO dto = convertirADTO(mi);
            dtos.add(dto);
        }
        return dtos;
    }

    public MovimientoInventarioDTO getMovimientoInventarioById(int id) {
        MovimientoInventario movimientoInventario = movimientoInventarioRepository.findById(id).orElse(null);

        if (movimientoInventario == null)
            return null;

        return convertirADTO(movimientoInventario);
    }

    public MovimientoInventario saveMovimientoInventario(MovimientoInventario mi) {
        return movimientoInventarioRepository.save(mi);
    }

    public void deleteMovimientoInventario(int id) {
        movimientoInventarioRepository.deleteById(id);
    }

    private MovimientoInventarioDTO convertirADTO(MovimientoInventario mi) {
        MovimientoInventarioDTO dto = new MovimientoInventarioDTO();

        dto.setId(mi.getId());
        dto.setCantidad(mi.getCantidad());
        dto.setNombre(mi.getNombre());
        dto.setFecha(mi.getFecha());
        dto.setProducto(new ProductoDTO(mi.getProducto()));
        dto.setUsuario(new UsuarioDTO(mi.getUsuario()));

        return dto;
    }
}
