package com.tailoy.inv.dto;

import com.tailoy.inv.model.Categoria;

public class CategoriaDTO {
    private int id;
    private String nombre;
    
    public CategoriaDTO() {
    	
    }
    
    public CategoriaDTO(Categoria categoria) {
    	this.id = categoria.getId();
    	this.nombre = categoria.getNombre();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
