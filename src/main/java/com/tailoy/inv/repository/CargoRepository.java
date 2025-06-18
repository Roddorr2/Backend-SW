package com.tailoy.inv.repository;

import com.tailoy.inv.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Integer> {
}
