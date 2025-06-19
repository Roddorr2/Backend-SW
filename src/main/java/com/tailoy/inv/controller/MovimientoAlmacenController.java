package com.tailoy.inv.controller;

import com.tailoy.inv.dto.MovimientoAlmacenDTO;
import com.tailoy.inv.model.MovimientoAlmacen;
import com.tailoy.inv.service.MovimientoAlmacenService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoAlmacenController {
    private final MovimientoAlmacenService movimientoAlmacenService;

    public MovimientoAlmacenController(MovimientoAlmacenService movimientoAlmacenService) {
        this.movimientoAlmacenService = movimientoAlmacenService;
    }

    @GetMapping("/movimientos-almacen")
    public List<MovimientoAlmacenDTO> getAllMovimientosAlmacen() {
        return movimientoAlmacenService.getAllMovimientos();
    }

    @GetMapping("/movimientos-almacen/{id}")
    public MovimientoAlmacenDTO getMovimientoAlmacenById(@PathVariable int id) {
        return movimientoAlmacenService.getMovimientoAlmacenById(id);
    }

    @PostMapping("/movimientos-almacen")
    public MovimientoAlmacen createMovimientoAlmacen(@RequestBody MovimientoAlmacen movimientoAlmacen) {
        return movimientoAlmacenService.saveMovimiento(movimientoAlmacen);
    }

    @PutMapping("/movimientos-almacen/{id}")
    public MovimientoAlmacen updateMovimientoAlmacen(@PathVariable int id, @RequestBody MovimientoAlmacen movimientoAlmacen) {
        movimientoAlmacen.setId(id);
        return movimientoAlmacenService.saveMovimiento(movimientoAlmacen);
    }

    @DeleteMapping("/movimientos-almacen/{id}")
    public void deleteMovimientoAlmacen(@PathVariable int id) {
        movimientoAlmacenService.deleteMovimiento(id);
    }
}
