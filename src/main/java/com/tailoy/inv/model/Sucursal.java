package com.tailoy.inv.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ciudad;
    private String direccion;
    private String correo;
    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<DespachoSucursal> despachoSucursales;

    public Sucursal() {

    }

    public Sucursal(int id, String ciudad, String direccion, String correo, Set<DespachoSucursal> despachoSucursales) {
        this.id = id;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.correo = correo;
        this.despachoSucursales = despachoSucursales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Set<DespachoSucursal> getDespachoSucursales() {
        return despachoSucursales;
    }

    public void setDespachoSucursales(Set<DespachoSucursal> despachoSucursales) {
        this.despachoSucursales = despachoSucursales;
    }
}
