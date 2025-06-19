package com.tailoy.inv.controller;

import com.tailoy.inv.dto.MovimientoInventarioDTO;
import com.tailoy.inv.model.MovimientoInventario;
import com.tailoy.inv.service.MovimientoInventarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoInventarioController {
    private final MovimientoInventarioService movimientoInventarioService;

    public MovimientoInventarioController(MovimientoInventarioService movimientoInventarioService) {
        this.movimientoInventarioService = movimientoInventarioService;
    }

    @GetMapping("/movimientos-inventario")
    public List<MovimientoInventarioDTO> getAllMovimientosInventario() {
        return movimientoInventarioService.getAllMovimientosInventario();
    }

    @GetMapping("/movimientos-inventario/{id}")
    public MovimientoInventarioDTO getMovimientoInventarioById(@PathVariable int id) {
        return movimientoInventarioService.getMovimientoInventarioById(id);
    }

    @PostMapping("/movimientos-inventario")
    public MovimientoInventario createMovimientoInventario(@RequestBody MovimientoInventario movimientoInventario) {
        return movimientoInventarioService.saveMovimientoInventario(movimientoInventario);
    }

    @PutMapping("/movimientos-inventario/{id}")
    public MovimientoInventario updateMovimientoInventario(@PathVariable int id, @RequestBody MovimientoInventario movimientoInventario) {
        movimientoInventario.setId(id);
        return movimientoInventarioService.saveMovimientoInventario(movimientoInventario);
    }

    @DeleteMapping("/movimientos-inventario/{id}")
    public void deleteMovimientoInventario(@PathVariable int id) {
        movimientoInventarioService.deleteMovimientoInventario(id);
    }

}
