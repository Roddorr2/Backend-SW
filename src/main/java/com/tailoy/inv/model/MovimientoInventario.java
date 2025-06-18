package com.tailoy.inv.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class MovimientoInventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int cantidad;
    private String nombre;
    private int tipoMovimiento;
    private LocalDateTime fecha;
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public MovimientoInventario() {

    }

    public MovimientoInventario(int id, int cantidad, String nombre, int tipoMovimiento, LocalDateTime fecha, Producto producto, Usuario usuario) {
        this.id = id;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.tipoMovimiento = tipoMovimiento;
        this.fecha = fecha;
        this.producto = producto;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(int tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
