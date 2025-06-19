package com.tailoy.inv.dto;

import com.tailoy.inv.model.MovimientoInventario;

import java.time.LocalDateTime;

public class MovimientoInventarioDTO {
    private int id;
    private int cantidad;
    private String nombre;
    private int tipoMovimiento;
    private LocalDateTime fecha;
    private ProductoDTO producto;
    private UsuarioDTO usuario;

    public MovimientoInventarioDTO() {

    }

    public MovimientoInventarioDTO(MovimientoInventario movimientoInventario) {
        this.id = movimientoInventario.getId();
        this.cantidad = movimientoInventario.getCantidad();
        this.nombre = movimientoInventario.getNombre();
        this.tipoMovimiento = movimientoInventario.getTipoMovimiento();
        this.fecha = movimientoInventario.getFecha();
        this.producto = new ProductoDTO(movimientoInventario.getProducto());
        this.usuario = new UsuarioDTO(movimientoInventario.getUsuario());
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

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }
}
