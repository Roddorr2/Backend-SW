package com.tailoy.inv.service;

import com.tailoy.inv.dto.CategoriaDTO;
import com.tailoy.inv.dto.SubcategoriaDTO;
import com.tailoy.inv.model.Subcategoria;
import com.tailoy.inv.repository.SubcategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubcategoriaService {
    private final SubcategoriaRepository subcategoriaRepository;

    public SubcategoriaService(SubcategoriaRepository subcategoriaRepository) {
        this.subcategoriaRepository = subcategoriaRepository;
    }

    public List<SubcategoriaDTO> getAllSubcategorias() {
        List<Subcategoria> subcategorias = subcategoriaRepository.findAll();
        List<SubcategoriaDTO> dtos = new ArrayList<>();

        for (Subcategoria s : subcategorias) {
            SubcategoriaDTO dto = convertirADTO(s);
            dtos.add(dto);
        }
        return dtos;
    }

    public SubcategoriaDTO getSubcategoriasById(int id) {
        Subcategoria subcategoria = subcategoriaRepository.findById(id).orElse(null);

        if (subcategoria == null)
            return null;

        return convertirADTO(subcategoria);
    }

    public Subcategoria saveSubcategoria(Subcategoria subcategoria) {
        return subcategoriaRepository.save(subcategoria);
    }

    public void deleteSubcategoria(int id) {
        subcategoriaRepository.deleteById(id);
    }


    private SubcategoriaDTO convertirADTO(Subcategoria subcategoria) {
        SubcategoriaDTO dto = new SubcategoriaDTO();

        dto.setId(subcategoria.getId());
        dto.setNombre(subcategoria.getNombre());
        dto.setCategoria(new CategoriaDTO(subcategoria.getCategoria()));

        return dto;
    }
}
