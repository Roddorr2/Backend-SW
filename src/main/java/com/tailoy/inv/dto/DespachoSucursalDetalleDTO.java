package com.tailoy.inv.dto;

public class DespachoSucursalDetalleDTO {
    private int id;
    private int cantidad;
    private double precioUnitario;
    private String observaciones;
    private DespachoSucursalDTO despachoSucursal;
    private ProductoDTO producto;

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

    public DespachoSucursalDTO getDespachoSucursal() {
        return despachoSucursal;
    }

    public void setDespachoSucursal(DespachoSucursalDTO despachoSucursal) {
        this.despachoSucursal = despachoSucursal;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }
}
