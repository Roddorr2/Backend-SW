package com.tailoy.inv.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.tailoy.inv.dto.DespachoSucursalDTO;
import com.tailoy.inv.model.DespachoSucursal;
import com.tailoy.inv.service.DespachoSucursalService;

@RestController
public class DespachoSucursalController {
    private final DespachoSucursalService despachoSucursalService;

    public DespachoSucursalController(DespachoSucursalService despachoSucursalService) {
        this.despachoSucursalService = despachoSucursalService;
    }

    @GetMapping("/despachos")
    public List<DespachoSucursalDTO> getAllDespachos() {
        return despachoSucursalService.getAllDespachos();
    }

    @GetMapping("/despachos/{id}")
    public DespachoSucursalDTO getDespachoById(@PathVariable int id) {
        return despachoSucursalService.getDespachosById(id);
    }

    @PostMapping("/despachos")
    public DespachoSucursal createDespacho(@RequestBody DespachoSucursal despachoSucursal) {
        return despachoSucursalService.saveDespacho(despachoSucursal);
    }

    @PutMapping("/despachos/{id}")
    public DespachoSucursal updateDespacho(@PathVariable int id, @RequestBody DespachoSucursal despachoSucursal) {
        despachoSucursal.setId(id);
        return despachoSucursalService.saveDespacho(despachoSucursal);
    }

    @DeleteMapping("/despachos/{id}")
    public void deleteDespacho(@PathVariable int id) {
        despachoSucursalService.deleteDespacho(id);
    }
}
