package com.tailoy.inv.dto;

import com.tailoy.inv.model.MovimientoAlmacen;

public class MovimientoAlmacenDTO {
    private int id;
    private int tipoAlmacen;
    private int cantidad;

    public MovimientoAlmacenDTO() {

    }

    public MovimientoAlmacenDTO(MovimientoAlmacen movimientoAlmacen) {
        this.id = movimientoAlmacen.getId();
        this.tipoAlmacen = movimientoAlmacen.getTipoAlmacen();
        this.cantidad = movimientoAlmacen.getCantidad();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipoAlmacen() {
        return tipoAlmacen;
    }

    public void setTipoAlmacen(int tipoAlmacen) {
        this.tipoAlmacen = tipoAlmacen;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
