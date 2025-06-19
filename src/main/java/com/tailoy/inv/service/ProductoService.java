package com.tailoy.inv.service;

import com.tailoy.inv.dto.ProdSubCatDTO;
import com.tailoy.inv.dto.ProductoDTO;
import com.tailoy.inv.dto.SubcategoriaDTO;
import com.tailoy.inv.model.Producto;
import com.tailoy.inv.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public List<ProductoDTO> getAllProductos() {
        List<Producto> productos = productoRepository.findAll();
        List<ProductoDTO> dtos = new ArrayList<>();

        for (Producto p : productos) {
            ProductoDTO dto = convertirADTO(p);
            dtos.add(dto);
        }
        return dtos;
    }

    public ProductoDTO getProductosById(int id) {
        Producto Producto = productoRepository.findById(id).orElse(null);

        if (Producto == null)
            return null;

        return convertirADTO(Producto);
    }

    public Producto saveProducto(Producto Producto) {
        return productoRepository.save(Producto);
    }

    public void deleteProducto(int id) {
        productoRepository.deleteById(id);
    }

    public List<ProdSubCatDTO> getProductosConSubCatJPQL() {
        return productoRepository.obtenerProductosConSubcatCatJPQL();
    }

    public List<Map<String, Object>> getProductosConSubCatSQL() {
        return productoRepository.obtenerProductosConSubcatCatNative();
    }

    private ProductoDTO convertirADTO(Producto producto) {
        ProductoDTO dto = new ProductoDTO();

        dto.setId(producto.getId());
        dto.setNombre(producto.getNombre());
        dto.setCodigo(producto.getCodigo());
        dto.setMarca(producto.getMarca());
        dto.setStock(producto.getStock());
        dto.setPrecioUnitario(producto.getPrecioUnitario());
        dto.setUnidadMedida(producto.getUnidadMedida());
        dto.setDescripcion(producto.getDescripcion());
        dto.setSubcategoria(new SubcategoriaDTO(producto.getSubcategoria()));

        return dto;
    }
}
