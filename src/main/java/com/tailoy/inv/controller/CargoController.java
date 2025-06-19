package com.tailoy.inv.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
	
}
