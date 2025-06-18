package com.tailoy.inv.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class MovimientoAlmacen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int tipoAlmacen;
    @OneToMany(mappedBy = "movimientoAlmacen", cascade = CascadeType.ALL)
    private Set<MovimientoAlmacenDetalle> movimientoAlmacenDetalles;

    public MovimientoAlmacen() {

    }


    public MovimientoAlmacen(int id, int tipoAlmacen, Set<MovimientoAlmacenDetalle> movimientoAlmacenDetalles) {
        this.id = id;
        this.tipoAlmacen = tipoAlmacen;
        this.movimientoAlmacenDetalles = movimientoAlmacenDetalles;
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

    public Set<MovimientoAlmacenDetalle> getMovimientoAlmacenDetalles() {
        return movimientoAlmacenDetalles;
    }

    public void setMovimientoAlmacenDetalles(Set<MovimientoAlmacenDetalle> movimientoAlmacenDetalles) {
        this.movimientoAlmacenDetalles = movimientoAlmacenDetalles;
    }
}
