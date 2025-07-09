package com.tailoy.inv.service;

import com.tailoy.inv.dto.CategoriaDTO;
import com.tailoy.inv.model.Categoria;
import com.tailoy.inv.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<CategoriaDTO> getAllCategorias() {
        List<Categoria> categorias = categoriaRepository.findAll();
        List<CategoriaDTO> dtos = new ArrayList<>();

        for (Categoria c : categorias) {
            CategoriaDTO dto = convertirADTO(c);
            dtos.add(dto);
        }
        return dtos;
    }

    public CategoriaDTO getCategoriasById(int id) {
        Categoria categoria = categoriaRepository.findById(id).orElse(null);

        if (categoria == null)
            return null;

        return convertirADTO(categoria);
    }

    public List<CategoriaDTO> buscarPorNombre(String nombre) {
        return categoriaRepository.findByNombre(nombre);
    }

    public Categoria saveCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public void deleteCategoria(int id) {
        categoriaRepository.deleteById(id);
    }


    private CategoriaDTO convertirADTO(Categoria categoria) {
        CategoriaDTO dto = new CategoriaDTO();

        dto.setId(categoria.getId());
        dto.setNombre(categoria.getNombre());

        return dto;
    }
}
