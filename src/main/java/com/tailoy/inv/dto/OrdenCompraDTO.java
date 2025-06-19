package com.tailoy.inv.dto;

import java.time.LocalDateTime;

import com.tailoy.inv.model.OrdenCompra;

public class OrdenCompraDTO {
    private int id;
    private ProveedorDTO proveedor;
    private LocalDateTime fecha;
    private int estadoOperacion;
    
    public OrdenCompraDTO() {
    	
    }
    
    public OrdenCompraDTO(OrdenCompra orden) {
        this.id = orden.getId();
        this.proveedor = new ProveedorDTO(orden.getProveedor());
        this.fecha = orden.getFecha();
        this.estadoOperacion = orden.getEstadoOperacion();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProveedorDTO getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorDTO proveedor) {
        this.proveedor = proveedor;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public int getEstadoOperacion() {
        return estadoOperacion;
    }

    public void setEstadoOperacion(int estadoOperacion) {
        this.estadoOperacion = estadoOperacion;
    }
}
