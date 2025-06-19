package com.tailoy.inv.controller;

import com.tailoy.inv.dto.DespachoSucursalDetalleDTO;
import com.tailoy.inv.model.DespachoSucursalDetalle;
import com.tailoy.inv.service.DespachoSucursalDetalleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DespachoSucursalDetalleController {
    private final DespachoSucursalDetalleService despachoSucursalDetalleService;

    public DespachoSucursalDetalleController(DespachoSucursalDetalleService despachoSucursalDetalleService) {
        this.despachoSucursalDetalleService = despachoSucursalDetalleService;
    }

    @GetMapping("/despachos-detalle")
    public List<DespachoSucursalDetalleDTO> getAllDespachosSucursalDetalle() {
        return despachoSucursalDetalleService.getAllDespachos();
    }

    @GetMapping("/despachos-detalle/{id}")
    public DespachoSucursalDetalleDTO getDespachoSucursalDetalleById(@PathVariable int id) {
        return despachoSucursalDetalleService.getDespachoDetalleById(id);
    }

    @PostMapping("/despachos-detalle")
    public DespachoSucursalDetalle createDespachoSucursalDetalle(@RequestBody DespachoSucursalDetalle despachoSucursalDetalle) {
        return despachoSucursalDetalleService.saveDespachoDetalle(despachoSucursalDetalle);
    }

    @PutMapping("/despachos-detalle/{id}")
    public DespachoSucursalDetalle updateDespachoSucursalDetalle(@PathVariable int id, @RequestBody DespachoSucursalDetalle despachoSucursalDetalle) {
        despachoSucursalDetalle.setId(id);
        return despachoSucursalDetalleService.saveDespachoDetalle(despachoSucursalDetalle);
    }

    @DeleteMapping("/despachos-detalle/{id}")
    public void deleteDespachoSucursalDetalle(@PathVariable int id) {
        despachoSucursalDetalleService.deleteDespacho(id);
    }

}
