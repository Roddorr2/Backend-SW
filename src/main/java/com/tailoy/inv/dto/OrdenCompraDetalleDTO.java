package com.tailoy.inv.dto;

import com.tailoy.inv.model.OrdenCompraDetalle;

public class OrdenCompraDetalleDTO {
    private int id;
    private OrdenCompraDTO ordenCompra;
    private ProductoDTO producto;
    private int cantidad;
    private double precioUnitario;
    private String observaciones;
    
    public OrdenCompraDetalleDTO() {
    	
    }
    
    public OrdenCompraDetalleDTO(OrdenCompraDetalle ordenCompraDetalle) {
    	this.id = ordenCompraDetalle.getId();
    	this.ordenCompra = new OrdenCompraDTO(ordenCompraDetalle.getOrdenCompra());
    	this.producto = new ProductoDTO(ordenCompraDetalle.getProducto());
    	this.cantidad = ordenCompraDetalle.getCantidad();
    	this.precioUnitario = ordenCompraDetalle.getPrecioUnitario();
    	this.observaciones = ordenCompraDetalle.getObservaciones();
    }

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
