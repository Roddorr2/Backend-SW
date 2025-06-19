package com.tailoy.inv.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.tailoy.inv.dto.SucursalDTO;
import com.tailoy.inv.model.Sucursal;
import com.tailoy.inv.service.SucursalService;

@RestController
public class SucursalController {
    private final SucursalService sucursalService;

    public SucursalController(SucursalService sucursalService) {
        this.sucursalService = sucursalService;
    }

    @GetMapping("/sucursales")
    public List<SucursalDTO> getAllSucursales() {
        return sucursalService.getAllSucursales();
    }

    @GetMapping("/sucursales/{id}")
    public SucursalDTO getSucursalById(@PathVariable int id) {
        return sucursalService.getSucursalesById(id);
    }

    @PostMapping("/sucursales")
    public Sucursal createSucursal(@RequestBody Sucursal sucursal) {
        return sucursalService.saveSucursal(sucursal);
    }

    @PutMapping("/sucursales/{id}")
    public Sucursal updateSucursal(@PathVariable int id, @RequestBody Sucursal sucursal) {
        sucursal.setId(id);
        return sucursalService.saveSucursal(sucursal);
    }

    @DeleteMapping("/sucursales/{id}")
    public void deleteSucursal(@PathVariable int id) {
        sucursalService.deleteSucursal(id);
    }

}
