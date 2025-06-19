package com.tailoy.inv.service;

import com.tailoy.inv.dto.HistorialAccionDTO;
import com.tailoy.inv.dto.UsuarioDTO;
import com.tailoy.inv.model.Cargo;
import com.tailoy.inv.model.HistorialAccion;
import com.tailoy.inv.repository.HistorialAccionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HistorialAccionService {
    private final HistorialAccionRepository historialAccionRepository;

    public HistorialAccionService(HistorialAccionRepository historialAccionRepository) {
        this.historialAccionRepository = historialAccionRepository;
    }

    public List<HistorialAccionDTO> getAllHistoriales() {
        List<HistorialAccion> historiales = historialAccionRepository.findAll();
        List<HistorialAccionDTO> dtos = new ArrayList<>();

        for (HistorialAccion h : historiales) {
            HistorialAccionDTO dto = convertirADTO(h);
            dtos.add(dto);
        }
        return dtos;
    }

    public HistorialAccionDTO getHistorialesById(int id) {
        HistorialAccion historialAccion = historialAccionRepository.findById(id).orElse(null);

        if (historialAccion == null)
            return null;

        return convertirADTO(historialAccion);
    }

    public HistorialAccion saveHistorial(HistorialAccion historialAccion) {
        return historialAccionRepository.save(historialAccion);
    }

    public void deleteHistorial(int id) {
        historialAccionRepository.deleteById(id);
    }

    private HistorialAccionDTO convertirADTO(HistorialAccion historialAccion) {
        HistorialAccionDTO dto = new HistorialAccionDTO();

        dto.setId(historialAccion.getId());
        dto.setFecha(historialAccion.getFecha());
        dto.setDescripcion(historialAccion.getDescripcion());
        dto.setTipoAccion(historialAccion.getTipoAccion());
        dto.setModulo(historialAccion.getModulo());
        dto.setUsuario(new UsuarioDTO(historialAccion.getUsuario()));

        return dto;
    }
}
