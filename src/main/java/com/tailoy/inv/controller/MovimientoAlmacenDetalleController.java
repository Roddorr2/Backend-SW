package com.tailoy.inv.controller;

import com.tailoy.inv.dto.MovimientoAlmacenDetalleDTO;
import com.tailoy.inv.model.MovimientoAlmacenDetalle;
import com.tailoy.inv.service.MovimientoAlmacenDetalleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoAlmacenDetalleController {
    private final MovimientoAlmacenDetalleService movimientoAlmacenDetalleService;

    public MovimientoAlmacenDetalleController(MovimientoAlmacenDetalleService movimientoAlmacenDetalleService) {
        this.movimientoAlmacenDetalleService = movimientoAlmacenDetalleService;
    }

    @GetMapping("/movimientos-detalle")
    public List<MovimientoAlmacenDetalleDTO> getAllMovimientosAlmacenDetalle() {
        return movimientoAlmacenDetalleService.getAllMovimientoDetalles();
    }

    @GetMapping("/movimientos-detalle/{id}")
    public MovimientoAlmacenDetalleDTO getMovimientoAlmacenDetalleById(@PathVariable int id) {
        return movimientoAlmacenDetalleService.getMovimientoDetalleById(id);
    }

    @PostMapping("/movimientos-detalle")
    public MovimientoAlmacenDetalle createMovimientoAlmacenDetalle(@RequestBody MovimientoAlmacenDetalle movimientoAlmacenDetalle) {
        return movimientoAlmacenDetalleService.saveMovimientoDetalle(movimientoAlmacenDetalle);
    }

    @PutMapping("/movimientos-detalle/{id}")
    public MovimientoAlmacenDetalle updateMovimientoAlmacenDetalle(@PathVariable int id, @RequestBody MovimientoAlmacenDetalle movimientoAlmacenDetalle) {
        movimientoAlmacenDetalle.setId(id);
        return movimientoAlmacenDetalleService.saveMovimientoDetalle(movimientoAlmacenDetalle);
    }

    @DeleteMapping("/movimientos-detalle/{id}")
    public void deleteMovimientoAlmacenDetalle(@PathVariable int id) {
        movimientoAlmacenDetalleService.deleteMovimientoDetalle(id);
    }

}
