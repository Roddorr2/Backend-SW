package com.tailoy.inv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tailoy.inv.model.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
}
