package com.tailoy.inv.repository;

import com.tailoy.inv.model.Subcategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubcategoriaRepository extends JpaRepository<Subcategoria, Integer> {
}
