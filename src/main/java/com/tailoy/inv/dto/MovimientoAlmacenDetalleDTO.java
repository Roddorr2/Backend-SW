package com.tailoy.inv.dto;

import com.tailoy.inv.model.MovimientoAlmacenDetalle;

public class MovimientoAlmacenDetalleDTO {
    private int id;
    private MovimientoAlmacenDTO movimientoAlmacen;
    private ProductoDTO producto;

    public MovimientoAlmacenDetalleDTO() {

    }

    public MovimientoAlmacenDetalleDTO(MovimientoAlmacenDetalle movimientoDetalle) {
        this.id = movimientoDetalle.getId();
        this.movimientoAlmacen = new MovimientoAlmacenDTO(movimientoDetalle.getMovimientoAlmacen());
        this.producto = new ProductoDTO(movimientoDetalle.getProducto());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
