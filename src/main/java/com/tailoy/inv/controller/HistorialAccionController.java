package com.tailoy.inv.controller;


import com.tailoy.inv.dto.HistorialAccionDTO;
import com.tailoy.inv.dto.HistorialUsuarioDTO;
import com.tailoy.inv.model.HistorialAccion;
import com.tailoy.inv.service.HistorialAccionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class HistorialAccionController {
    private final HistorialAccionService historialAccionService;

    public HistorialAccionController(HistorialAccionService historialAccionService) {
        this.historialAccionService = historialAccionService;
    }

    @GetMapping("/historiales")
    public List<HistorialAccionDTO> getAllHistoriales() {
        return historialAccionService.getAllHistoriales();
    }

    @GetMapping("/historiales/{id}")
    public HistorialAccionDTO getHistorialById(@PathVariable int id) {
        return historialAccionService.getHistorialesById(id);
    }

    @PostMapping("/historiales")
    public HistorialAccion createhistorialAccion(@RequestBody HistorialAccion historialAccion) {
        return historialAccionService.saveHistorial(historialAccion);
    }

    @PutMapping("/historiales{id}")
    public HistorialAccion updatehistorialAccion(@PathVariable int id, @RequestBody HistorialAccion historialAccion) {
        historialAccion.setId(id);
        return historialAccionService.saveHistorial(historialAccion);
    }

    @DeleteMapping("/historiales/{id}")
    public void deletehistorialAccion(@PathVariable int id) {
        historialAccionService.deleteHistorial(id);
    }

    @GetMapping("/historiales/jpql")
    public List<HistorialUsuarioDTO> getHistorialUsuarioJPQL() {
        return historialAccionService.getHistorialConUsuarioJPQL();
    }

    @GetMapping("/historiales/native")
    public List<Map<String, Object>> getHistorialUsuarioNativo() {
        return historialAccionService.getHistorialConUsuarioNativo();
    }
}
