package com.tailoy.inv.controller;

import com.tailoy.inv.dto.SubcategoriaDTO;
import com.tailoy.inv.model.Subcategoria;
import com.tailoy.inv.service.SubcategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubcategoriaController {
    private final SubcategoriaService subcategoriaService;

    public SubcategoriaController(SubcategoriaService subcategoriaService) {
        this.subcategoriaService = subcategoriaService;
    }

    @GetMapping("/subcategorias")
    public List<SubcategoriaDTO> getAllSubcategorias() {
        return subcategoriaService.getAllSubcategorias();
    }

    @GetMapping("/subcategorias/{id}")
    public SubcategoriaDTO getSubcategoriaById(@PathVariable int id) {
        return subcategoriaService.getSubcategoriasById(id);
    }

    @PostMapping("/subcategorias")
    public Subcategoria createSubcategoria(@RequestBody Subcategoria subcategoria) {
        return subcategoriaService.saveSubcategoria(subcategoria);
    }

    @PutMapping("/subcategorias/{id}")
    public Subcategoria updateSubcategoria(@PathVariable int id, @RequestBody Subcategoria subcategoria) {
        subcategoria.setId(id);
        return subcategoriaService.saveSubcategoria(subcategoria);
    }

    @DeleteMapping("/subcategorias/{id}")
    public void deleteSubcategoria(@PathVariable int id) {
        subcategoriaService.deleteSubcategoria(id);
    }

}
