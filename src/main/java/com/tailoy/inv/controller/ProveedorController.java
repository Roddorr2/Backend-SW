package com.tailoy.inv.controller;

import com.tailoy.inv.dto.ProveedorDTO;
import com.tailoy.inv.model.Proveedor;
import com.tailoy.inv.service.ProveedorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/proveedores")
public class ProveedorController {
    private final ProveedorService proveedorService;
    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @GetMapping
    public List<ProveedorDTO> getAllProveedores() {
        return proveedorService.getAllProveedores();
    }

    @GetMapping("/{id}")
    public ProveedorDTO getProveedoresById(@PathVariable int id) {
        return proveedorService.getProveedoresById(id);
    }

    @PostMapping
    public Proveedor createproveedor(@RequestBody Proveedor proveedor) {
        return proveedorService.saveProveedor(proveedor);
    }

    @PutMapping("/{id}")
    public Proveedor updateproveedor(@PathVariable int id, @RequestBody Proveedor proveedor) {
        proveedor.setId(id);
        return proveedorService.saveProveedor(proveedor);
    }

    @DeleteMapping("/{id}")
    public void deleteProveedor(@PathVariable int id) {
        proveedorService.deleteProveedor(id);
    }
}
