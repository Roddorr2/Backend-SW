package com.tailoy.inv.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String correo;
    private String contrasena;
    @ManyToOne
    @JoinColumn(name = "cargo_id", referencedColumnName = "id")
    private Cargo cargo;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Set<HistorialAccion> historialAcciones;

    public Usuario() {

    }

    public Usuario(int id, String nombre, String correo, String contrasena, Cargo cargo, Set<HistorialAccion> historialAcciones) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.cargo = cargo;
        this.historialAcciones = historialAcciones;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Set<HistorialAccion> getHistorialAcciones() {
        return historialAcciones;
    }

    public void setHistorialAcciones(Set<HistorialAccion> historialAcciones) {
        this.historialAcciones = historialAcciones;
    }
}
