package com.tailoy.inv.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int codigo;
    private String nombre;
    private String marca;
    private String descripcion;
    private int stock;
    private double precioUnitario;
    private String unidadMedida;
    private boolean estado;
    @ManyToOne
    @JoinColumn(name = "subcategoria_id", referencedColumnName = "id")
    private Subcategoria subcategoria;
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<OrdenCompraDetalle> ordenCompraDetalles;
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<DespachoSucursalDetalle> despachoSucursalDetalles;
    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<MovimientoInventario> movimientoInventarios;


    public Producto() {
    }

    public Producto(int id, int codigo, String nombre, String marca, String descripcion, int stock, double precioUnitario, String unidadMedida, boolean estado, Subcategoria subcategoria, Set<OrdenCompraDetalle> ordenCompraDetalles, Set<DespachoSucursalDetalle> despachoSucursalDetalles, Set<MovimientoInventario> movimientoInventarios) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precioUnitario = precioUnitario;
        this.unidadMedida = unidadMedida;
        this.subcategoria = subcategoria;
        this.ordenCompraDetalles = ordenCompraDetalles;
        this.despachoSucursalDetalles = despachoSucursalDetalles;
        this.movimientoInventarios = movimientoInventarios;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Subcategoria getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(Subcategoria subcategoria) {
        this.subcategoria = subcategoria;
    }

    public Set<OrdenCompraDetalle> getOrdenCompraDetalles() {
        return ordenCompraDetalles;
    }

    public void setOrdenCompraDetalles(Set<OrdenCompraDetalle> ordenCompraDetalles) {
        this.ordenCompraDetalles = ordenCompraDetalles;
    }

    public Set<DespachoSucursalDetalle> getDespachoSucursalDetalles() {
        return despachoSucursalDetalles;
    }

    public void setDespachoSucursalDetalles(Set<DespachoSucursalDetalle> despachoSucursalDetalles) {
        this.despachoSucursalDetalles = despachoSucursalDetalles;
    }

    public Set<MovimientoInventario> getMovimientoInventarios() {
        return movimientoInventarios;
    }

    public void setMovimientoInventarios(Set<MovimientoInventario> movimientoInventarios) {
        this.movimientoInventarios = movimientoInventarios;
    }
}
