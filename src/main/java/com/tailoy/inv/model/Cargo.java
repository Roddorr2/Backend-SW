package com.tailoy.inv.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    @OneToMany(mappedBy = "cargo", cascade = CascadeType.ALL)
    private Set<Usuario> usuarios;

    public Cargo() {

    }

    public Cargo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Cargo(int id, String nombre, Set<Usuario> usuarios) {
        this.id = id;
        this.nombre = nombre;
        this.usuarios = usuarios;
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

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
