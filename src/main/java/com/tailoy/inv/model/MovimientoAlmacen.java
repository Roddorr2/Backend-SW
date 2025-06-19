package com.tailoy.inv.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class MovimientoAlmacen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int tipoAlmacen;
    @OneToMany(mappedBy = "movimientoAlmacen", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<MovimientoAlmacenDetalle> movimientoAlmacenDetalles;
    private int cantidad;

    public MovimientoAlmacen() {

    }

    public MovimientoAlmacen(int id, int tipoAlmacen, Set<MovimientoAlmacenDetalle> movimientoAlmacenDetalles, int cantidad) {
        this.id = id;
        this.tipoAlmacen = tipoAlmacen;
        this.movimientoAlmacenDetalles = movimientoAlmacenDetalles;
        this.cantidad = cantidad;
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


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
    
    
}
