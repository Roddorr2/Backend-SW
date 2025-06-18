package com.tailoy.inv.dto;

public class UsuarioDTO {
    private int id;
    private String nombre;
    private String correo;
    private String contrasena;
    private CargoDTO cargo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public CargoDTO getCargo() {
        return cargo;
    }

    public void setCargo(CargoDTO cargo) {
        this.cargo = cargo;
    }
}
