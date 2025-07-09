package com.tailoy.inv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tailoy.inv.model.Proveedor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
}
