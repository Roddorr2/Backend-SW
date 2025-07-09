package com.tailoy.inv.repository;

import com.tailoy.inv.model.DespachoSucursalDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespachoSucursalDetalleRepository extends JpaRepository<DespachoSucursalDetalle, Integer> {
}
