package com.tailoy.inv.service;

import com.tailoy.inv.dto.CargoDTO;
import com.tailoy.inv.model.Cargo;
import com.tailoy.inv.repository.CargoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CargoService {
    private final CargoRepository cargoRepository;

    public CargoService(CargoRepository cargoRepository) {
        this.cargoRepository = cargoRepository;
    }

    public List<CargoDTO> getAllCargos() {
        List<Cargo> cargos = cargoRepository.findAll();
        List<CargoDTO> dtos = new ArrayList<>();

        for (Cargo c : cargos) {
            CargoDTO dto = convertirADTO(c);
            dtos.add(dto);
        }
        return dtos;
    }

    public Cargo saveCargo(Cargo cargo) {
        return cargoRepository.save(cargo);
    }

    public void deleteCargo(int id) {
        cargoRepository.deleteById(id);
    }

    private CargoDTO convertirADTO(Cargo cargo) {
        CargoDTO dto = new CargoDTO();

        dto.setId(cargo.getId());
        dto.setNombre(cargo.getNombre());

        return dto;
    }



}
