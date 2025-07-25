package com.tailoy.inv.repository;

import com.tailoy.inv.model.DespachoSucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespachoSucursalRepository extends JpaRepository<DespachoSucursal, Integer> {
}
