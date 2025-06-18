package com.tailoy.inv.dto;

import java.time.LocalDateTime;

public class DespachoSucursalDTO {
    private int id;
    private int estadoOperacion;
    private LocalDateTime fecha;
    private SucursalDTO sucursal;

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
