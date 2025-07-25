package com.tailoy.inv.dto;

import com.tailoy.inv.model.Producto;

public class ProductoDTO {
    private int id;
    private int codigo;
    private String nombre;
    private String marca;
    private String descripcion;
    private int stock;
    private double precioUnitario;
    private String unidadMedida;
    private SubcategoriaDTO subcategoria;

    public ProductoDTO() {
    	
    }

    public ProductoDTO(Producto producto) {
        this.id = producto.getId();
        this.codigo = producto.getCodigo();
        this.nombre = producto.getNombre();
        this.marca = producto.getMarca();
        this.descripcion = producto.getDescripcion();
        this.subcategoria = new SubcategoriaDTO(producto.getSubcategoria());
        this.stock = producto.getStock();
        this.precioUnitario = producto.getPrecioUnitario();
        this.unidadMedida = producto.getUnidadMedida();
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

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

	public SubcategoriaDTO getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(SubcategoriaDTO subcategoria) {
        this.subcategoria = subcategoria;
    }

}
