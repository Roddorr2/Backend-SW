package com.tailoy.inv.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class OrdenCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "proveedor_id", referencedColumnName = "id")
    private Proveedor proveedor;
    private LocalDateTime fecha;
    private int estadoOperacion;
    @OneToMany(mappedBy = "ordenCompra", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<OrdenCompraDetalle> ordenCompraDetalles;

    public OrdenCompra() {

    }

    public OrdenCompra(int id, Proveedor proveedor, LocalDateTime fecha, int estadoOperacion, Set<OrdenCompraDetalle> ordenCompraDetalles) {
        this.id = id;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.estadoOperacion = estadoOperacion;
        this.ordenCompraDetalles = ordenCompraDetalles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getEstadoOperacion() {
        return estadoOperacion;
    }

    public void setEstadoOperacion(int estadoOperacion) {
        this.estadoOperacion = estadoOperacion;
    }

    public Set<OrdenCompraDetalle> getOrdenCompraDetalles() {
        return ordenCompraDetalles;
    }

    public void setOrdenCompraDetalles(Set<OrdenCompraDetalle> ordenCompraDetalles) {
        this.ordenCompraDetalles = ordenCompraDetalles;
    }
}
