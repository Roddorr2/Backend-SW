package com.tailoy.inv.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Subcategoria> subcategorias;

    public Categoria() {

    }

    public Categoria(int id, String nombre, Set<Subcategoria> subcategorias) {
        this.id = id;
        this.nombre = nombre;
        this.subcategorias = subcategorias;
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

    public Set<Subcategoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(Set<Subcategoria> subcategorias) {
        this.subcategorias = subcategorias;
    }
}
