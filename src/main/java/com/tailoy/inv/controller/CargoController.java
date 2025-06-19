package com.tailoy.inv.controller;

import java.util.List;

import com.tailoy.inv.model.Cargo;
import org.springframework.web.bind.annotation.*;

import com.tailoy.inv.dto.CargoDTO;
import com.tailoy.inv.service.CargoService;

@RestController
public class CargoController {
	private final CargoService cargoService;

	public CargoController(CargoService cargoService) {
		this.cargoService = cargoService;
	}
	
	@GetMapping("/cargos")
	public List<CargoDTO> getAllCargos() {
		return cargoService.getAllCargos();
	}
	
	@GetMapping("/cargos/{id}")
	public CargoDTO getCargoById(@PathVariable int id) {
		return cargoService.getCargosById(id);
	}

	@PostMapping("/cargos")
	public Cargo createCargo(@RequestBody Cargo cargo) {
		return cargoService.saveCargo(cargo);
	}

	@PutMapping("/cargos/{id}")
	public Cargo updateCargo(@PathVariable int id, @RequestBody Cargo cargo) {
		cargo.setId(id);
		return cargoService.saveCargo(cargo);
	}

	@DeleteMapping("/cargos/{id}")
	public void deleteCargo(@PathVariable int id) {
		cargoService.deleteCargo(id);
	}
}
