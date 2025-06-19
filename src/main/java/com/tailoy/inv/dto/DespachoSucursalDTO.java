package com.tailoy.inv.dto;

import java.time.LocalDateTime;

import com.tailoy.inv.model.DespachoSucursal;

public class DespachoSucursalDTO {
    private int id;
    private int estadoOperacion;
    private LocalDateTime fecha;
    private SucursalDTO sucursal;
    
    public DespachoSucursalDTO() {
    	
    }
    
    public DespachoSucursalDTO(DespachoSucursal despachoSucursal) {
    	this.id = despachoSucursal.getId();
    	this.estadoOperacion = despachoSucursal.getEstadoOperacion();
    	this.fecha = despachoSucursal.getFecha();
    	this.sucursal = new SucursalDTO(despachoSucursal.getSucursal());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstadoOperacion() {
        return estadoOperacion;
    }

    public void setEstadoOperacion(int estadoOperacion) {
        this.estadoOperacion = estadoOperacion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public SucursalDTO getSucursal() {
        return sucursal;
    }

    public void setSucursal(SucursalDTO sucursal) {
        this.sucursal = sucursal;
    }
}
