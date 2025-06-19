package com.tailoy.inv.repository;

import com.tailoy.inv.dto.ProdSubCatDTO;
import com.tailoy.inv.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    @Query("""
    SELECT new com.tailoy.inv.dto.ProdSubCatDTO(
        p.codigo,
        p.nombre,
        p.precioUnitario,
        p.stock,
        p.marca,
        s.nombre,
        c.nombre
    )
    FROM Producto p
    JOIN p.subcategoria s
    JOIN s.categoria c
    ORDER BY p.nombre ASC
    """)
    List<ProdSubCatDTO> obtenerProductosConSubcatCatJPQL();

    @Query(value = """
    SELECT 
        p.codigo AS codigo,
        p.nombre AS nombre,
        p.precio_unitario AS precioUnitario,
        p.stock AS stock,
        p.marca AS marca,
        s.nombre AS subcategoria,
        c.nombre AS categoria
    FROM producto p
    INNER JOIN subcategoria s ON p.subcategoria_id = s.id
    INNER JOIN categoria c ON s.categoria_id = c.id
    ORDER BY p.nombre ASC
    """, nativeQuery = true)
    List<Map<String, Object>> obtenerProductosConSubcatCatNative();
}
