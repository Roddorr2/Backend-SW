package com.tailoy.inv.controller;

import com.tailoy.inv.dto.ProveedorDTO;
import com.tailoy.inv.model.Proveedor;
import com.tailoy.inv.service.ProveedorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProveedorController {
    private final ProveedorService proveedorService;
    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @GetMapping("/proveedores")
    public List<ProveedorDTO> getAllProveedores() {
        return proveedorService.getAllProveedores();
    }

    @GetMapping("/proveedores/{id}")
    public ProveedorDTO getProveedoresById(@PathVariable int id) {
        return proveedorService.getProveedoresById(id);
    }

    @PostMapping("/proveedores")
    public Proveedor createproveedor(@RequestBody Proveedor proveedor) {
        return proveedorService.saveProveedor(proveedor);
    }

    @PutMapping("/proveedores/{id}")
    public Proveedor updateproveedor(@PathVariable int id, @RequestBody Proveedor proveedor) {
        proveedor.setId(id);
        return proveedorService.saveProveedor(proveedor);
    }

    @DeleteMapping("/proveedores/{id}")
    public void deleteProveedor(@PathVariable int id) {
        proveedorService.deleteProveedor(id);
    }
}
