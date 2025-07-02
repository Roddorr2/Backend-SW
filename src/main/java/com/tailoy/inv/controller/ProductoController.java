package com.tailoy.inv.controller;

import com.tailoy.inv.dto.HistorialUsuarioDTO;
import com.tailoy.inv.dto.ProdSubCatDTO;
import com.tailoy.inv.dto.ProductoDTO;
import com.tailoy.inv.model.Producto;
import com.tailoy.inv.service.ProductoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/productos")
public class ProductoController {
    private final ProductoService productoService;
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<ProductoDTO> getAllProductos() {
        return productoService.getAllProductos();
    }

    @GetMapping("/{id}")
    public ProductoDTO getProductosById(@PathVariable int id) {
        return productoService.getProductosById(id);
    }

    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productoService.saveProducto(producto);
    }

    @PutMapping("/{id}")
    public Producto updateProducto(@PathVariable int id, @RequestBody Producto producto) {
        producto.setId(id);
        return productoService.saveProducto(producto);
    }

    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable int id) {
        productoService.deleteProducto(id);
    }

    @GetMapping("/jpql")
    public List<ProdSubCatDTO> getProductosConSubCatJPQL() {
        return productoService.getProductosConSubCatJPQL();
    }

    @GetMapping("/native")
    public List<Map<String, Object>> getProductosConSubCatSQL() {
        return productoService.getProductosConSubCatSQL();
    }
}
