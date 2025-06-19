package com.tailoy.inv.controller;

import com.tailoy.inv.dto.OrdenCompraDTO;
import com.tailoy.inv.model.OrdenCompra;
import com.tailoy.inv.service.OrdenCompraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdenCompraController {
    private final OrdenCompraService OrdenCompraService;

    public OrdenCompraController(OrdenCompraService OrdenCompraService) {
        this.OrdenCompraService = OrdenCompraService;
    }

    @GetMapping("/ordenes")
    public List<OrdenCompraDTO> getAllOrdenes() {
        return OrdenCompraService.getAllOrdenCompras();
    }

    @GetMapping("/ordenes/{id}")
    public OrdenCompraDTO getOrdenesById(@PathVariable int id) {
        return OrdenCompraService.getOrdenesById(id);
    }

    @PostMapping("/ordenes")
    public OrdenCompra createOrdenCompra(@RequestBody OrdenCompra OrdenCompra) {
        return OrdenCompraService.saveOrdenCompra(OrdenCompra);
    }

    @PutMapping("/ordenes/{id}")
    public OrdenCompra updateOrdenCompra(@PathVariable int id, @RequestBody OrdenCompra OrdenCompra) {
        OrdenCompra.setId(id);
        return OrdenCompraService.saveOrdenCompra(OrdenCompra);
    }

    @DeleteMapping("/ordenes/{id}")
    public void deleteOrdenCompra(@PathVariable int id) {
        OrdenCompraService.deleteOrden(id);
    }
}
