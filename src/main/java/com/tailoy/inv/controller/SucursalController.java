package com.tailoy.inv.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.tailoy.inv.dto.SucursalDTO;
import com.tailoy.inv.model.Sucursal;
import com.tailoy.inv.service.SucursalService;

@RestController
@RequestMapping("api/sucursales")
public class SucursalController {
    private final SucursalService sucursalService;

    public SucursalController(SucursalService sucursalService) {
        this.sucursalService = sucursalService;
    }

    @GetMapping
    public List<SucursalDTO> getAllSucursales() {
        return sucursalService.getAllSucursales();
    }

    @GetMapping("/{id}")
    public SucursalDTO getSucursalById(@PathVariable int id) {
        return sucursalService.getSucursalesById(id);
    }

    @PostMapping
    public Sucursal createSucursal(@RequestBody Sucursal sucursal) {
        return sucursalService.saveSucursal(sucursal);
    }

    @PutMapping("/{id}")
    public Sucursal updateSucursal(@PathVariable int id, @RequestBody Sucursal sucursal) {
        sucursal.setId(id);
        return sucursalService.saveSucursal(sucursal);
    }

    @DeleteMapping("/{id}")
    public void deleteSucursal(@PathVariable int id) {
        sucursalService.deleteSucursal(id);
    }

}
