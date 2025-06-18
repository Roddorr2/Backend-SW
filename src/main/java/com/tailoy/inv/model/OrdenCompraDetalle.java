package com.tailoy.inv.model;

import jakarta.persistence.*;

@Entity
public class OrdenCompraDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "orden_compra_id", referencedColumnName = "id")
    private OrdenCompra ordenCompra;
    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "id")
    private Producto producto;
    private int cantidad;
    private double precioUnitario;
    private String observaciones;

    public OrdenCompraDetalle() {

    }

    public OrdenCompraDetalle(int id, OrdenCompra ordenCompra, Producto producto, int cantidad, double precioUnitario, String observaciones) {
        this.id = id;
        this.ordenCompra = ordenCompra;
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrdenCompra getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenCompra ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
