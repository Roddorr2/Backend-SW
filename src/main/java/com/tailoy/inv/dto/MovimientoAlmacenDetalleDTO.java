package com.tailoy.inv.dto;

public class MovimientoAlmacenDetalleDTO {
    private int id;
    private int cantidad;
    private MovimientoAlmacenDTO movimientoAlmacen;
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

    public MovimientoAlmacenDTO getMovimientoAlmacen() {
        return movimientoAlmacen;
    }

    public void setMovimientoAlmacen(MovimientoAlmacenDTO movimientoAlmacen) {
        this.movimientoAlmacen = movimientoAlmacen;
    }

    public ProductoDTO getProducto() {
        return producto;
    }

    public void setProducto(ProductoDTO producto) {
        this.producto = producto;
    }
}
