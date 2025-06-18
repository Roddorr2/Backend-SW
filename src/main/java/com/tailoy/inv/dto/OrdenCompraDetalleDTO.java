package com.tailoy.inv.dto;


public class OrdenCompraDetalleDTO {
    private int id;
    private OrdenCompraDTO ordenCompra;
    private ProductoDTO producto;
    private int cantidad;
    private double precioUnitario;
    private String observaciones;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public OrdenCompraDTO getOrdenCompra() {
        return ordenCompra;
    }

    public void setOrdenCompra(OrdenCompraDTO ordenCompra) {
        this.ordenCompra = ordenCompra;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
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
