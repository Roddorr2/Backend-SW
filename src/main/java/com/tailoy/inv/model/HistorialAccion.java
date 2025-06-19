package com.tailoy.inv.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
public class HistorialAccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDateTime fecha;
    private int tipoAccion;
    private String descripcion;
    private int modulo;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public HistorialAccion() {

    }

    public HistorialAccion(int id, LocalDateTime fecha, int tipoAccion, String descripcion, int modulo, Usuario usuario) {
        this.id = id;
        this.fecha = fecha;
        this.tipoAccion = tipoAccion;
        this.descripcion = descripcion;
        this.modulo = modulo;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(int tipoAccion) {
        this.tipoAccion = tipoAccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getModulo() {
        return modulo;
    }

    public void setModulo(int modulo) {
        this.modulo = modulo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
