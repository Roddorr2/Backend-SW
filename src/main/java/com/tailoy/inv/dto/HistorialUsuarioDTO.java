package com.tailoy.inv.dto;

public class HistorialUsuarioDTO {
    private int historialId;
    private String descripcion;
    private int tipoAccion;
    private String usuarioNombre;
    private String usuarioCorreo;

    public HistorialUsuarioDTO(int historialId, String descripcion, int tipoAccion, String usuarioNombre, String usuarioCorreo) {
        this.historialId = historialId;
        this.descripcion = descripcion;
        this.tipoAccion = tipoAccion;
        this.usuarioNombre = usuarioNombre;
        this.usuarioCorreo = usuarioCorreo;
    }

    public int getHistorialId() { return historialId; }
    public void setHistorialId(int historialId) { this.historialId = historialId; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getTipoAccion() { return tipoAccion; }
    public void setTipoAccion(int tipoAccion) { this.tipoAccion = tipoAccion; }

    public String getUsuarioNombre() { return usuarioNombre; }
    public void setUsuarioNombre(String usuarioNombre) { this.usuarioNombre = usuarioNombre; }

    public String getUsuarioCorreo() { return usuarioCorreo; }
    public void setUsuarioCorreo(String usuarioCorreo) { this.usuarioCorreo = usuarioCorreo; }

}
