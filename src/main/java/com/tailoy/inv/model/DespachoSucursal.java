package com.tailoy.inv.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class DespachoSucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int estadoOperacion;
    private LocalDateTime fecha;
    @ManyToOne
    @JoinColumn(name = "sucursal_id")
    private Sucursal sucursal;
    @OneToMany(mappedBy = "despachoSucursal", cascade = CascadeType.ALL)
    private Set<DespachoSucursalDetalle> despachoSucursalDetalles;

    public DespachoSucursal() {

    }

    public DespachoSucursal(int id, int estadoOperacion, LocalDateTime fecha, Sucursal sucursal, Set<DespachoSucursalDetalle> despachoSucursalDetalles) {
        this.id = id;
        this.estadoOperacion = estadoOperacion;
        this.fecha = fecha;
        this.sucursal = sucursal;
        this.despachoSucursalDetalles = despachoSucursalDetalles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstadoOperacion() {
        return estadoOperacion;
    }

    public void setEstadoOperacion(int estadoOperacion) {
        this.estadoOperacion = estadoOperacion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Set<DespachoSucursalDetalle> getDespachoSucursalDetalles() {
        return despachoSucursalDetalles;
    }

    public void setDespachoSucursalDetalles(Set<DespachoSucursalDetalle> despachoSucursalDetalles) {
        this.despachoSucursalDetalles = despachoSucursalDetalles;
    }
}
