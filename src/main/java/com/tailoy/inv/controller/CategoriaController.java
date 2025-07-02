package com.tailoy.inv.controller;

import com.tailoy.inv.dto.CategoriaDTO;
import com.tailoy.inv.model.Categoria;
import com.tailoy.inv.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categorias")
public class CategoriaController {
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public List<CategoriaDTO> getAllCategorias() {
        return categoriaService.getAllCategorias();
    }

    @GetMapping("/{id}")
    public CategoriaDTO getCategoriaById(@PathVariable int id) {
        return categoriaService.getCategoriasById(id);
    }

    @PostMapping
    public Categoria createCategoria(@RequestBody Categoria categoria) {
        return categoriaService.saveCategoria(categoria);
    }

    @PutMapping("/{id}")
    public Categoria updateCategoria(@PathVariable int id, @RequestBody Categoria categoria) {
        categoria.setId(id);
        return categoriaService.saveCategoria(categoria);
    }

    @DeleteMapping("/{id}")
    public void deleteCategoria(@PathVariable int id) {
        categoriaService.deleteCategoria(id);
    }
}
