package com.tailoy.inv.repository;

import com.tailoy.inv.model.MovimientoInventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoInventarioRepository extends JpaRepository<MovimientoInventario, Integer> {
}
