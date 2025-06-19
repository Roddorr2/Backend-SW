package com.tailoy.inv.model;

import jakarta.persistence.*;

@Entity
public class MovimientoAlmacenDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "movimiento_almacen_id", nullable = false)
    private MovimientoAlmacen movimientoAlmacen;
    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    public MovimientoAlmacenDetalle() {
    }

    public MovimientoAlmacenDetalle(int id, MovimientoAlmacen movimientoAlmacen, Producto producto) {
        this.id = id;
        this.movimientoAlmacen = movimientoAlmacen;
        this.producto = producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MovimientoAlmacen getMovimientoAlmacen() {
        return movimientoAlmacen;
    }

    public void setMovimientoAlmacen(MovimientoAlmacen movimientoAlmacen) {
        this.movimientoAlmacen = movimientoAlmacen;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
