package com.tailoy.inv.controller;

import com.tailoy.inv.dto.SubcategoriaDTO;
import com.tailoy.inv.model.Subcategoria;
import com.tailoy.inv.service.SubcategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/subcategorias")
public class SubcategoriaController {
    private final SubcategoriaService subcategoriaService;

    public SubcategoriaController(SubcategoriaService subcategoriaService) {
        this.subcategoriaService = subcategoriaService;
    }

    @GetMapping
    public List<SubcategoriaDTO> getAllSubcategorias() {
        return subcategoriaService.getAllSubcategorias();
    }

    @GetMapping("/{id}")
    public SubcategoriaDTO getSubcategoriaById(@PathVariable int id) {
        return subcategoriaService.getSubcategoriasById(id);
    }

    @PostMapping
    public Subcategoria createSubcategoria(@RequestBody Subcategoria subcategoria) {
        return subcategoriaService.saveSubcategoria(subcategoria);
    }

    @PutMapping("/{id}")
    public Subcategoria updateSubcategoria(@PathVariable int id, @RequestBody Subcategoria subcategoria) {
        subcategoria.setId(id);
        return subcategoriaService.saveSubcategoria(subcategoria);
    }

    @DeleteMapping("/{id}")
    public void deleteSubcategoria(@PathVariable int id) {
        subcategoriaService.deleteSubcategoria(id);
    }

}
