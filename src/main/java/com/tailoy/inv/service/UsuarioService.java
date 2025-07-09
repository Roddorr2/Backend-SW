package com.tailoy.inv.service;

import com.tailoy.inv.dto.CargoDTO;
import com.tailoy.inv.dto.UsuarioDTO;
import com.tailoy.inv.model.Cargo;
import com.tailoy.inv.model.Usuario;
import com.tailoy.inv.repository.CargoRepository;
import com.tailoy.inv.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final CargoRepository cargoRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository, CargoRepository cargoRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.cargoRepository = cargoRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public List<UsuarioDTO> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        List<UsuarioDTO> dtos = new ArrayList<>();

        for (Usuario u : usuarios) {
            UsuarioDTO dto = convertirADTO(u);
            dtos.add(dto);
        }
        return dtos;
    }

    public UsuarioDTO getUsuariosById(int id) {
        Usuario Usuario = usuarioRepository.findById(id).orElse(null);

        if (Usuario == null)
            return null;

        return convertirADTO(Usuario);
    }

    public Usuario insertarUsuario(UsuarioDTO dto) {
        Cargo cargo = cargoRepository.findById(dto.getCargo().getId())
                .orElseThrow(() -> new EntityNotFoundException("Cargo no encontrado"));

        Usuario usuario = new Usuario();
        usuario.setNombre(dto.getNombre());
        usuario.setCorreo(dto.getCorreo());
        usuario.setContrasena(passwordEncoder.encode(dto.getContrasena()));
        usuario.setCargo(cargo);

        return usuarioRepository.save(usuario);
    }

    public Usuario actualizarUsuario(UsuarioDTO dto, int id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuario no encontrado"));

        Cargo cargo = cargoRepository.findById(dto.getCargo().getId())
                .orElseThrow(() -> new EntityNotFoundException("Cargo no encontrado"));

        usuario.setNombre(dto.getNombre());
        usuario.setCorreo(dto.getCorreo());
        usuario.setContrasena(passwordEncoder.encode(dto.getContrasena()));
        usuario.setCargo(cargo);
        return usuario;
    }

    public void deleteUsuario(int id) {
        usuarioRepository.deleteById(id);
    }


    private UsuarioDTO convertirADTO(Usuario usuario) {
        UsuarioDTO dto = new UsuarioDTO();

        dto.setId(usuario.getId());
        dto.setNombre(usuario.getNombre());
        dto.setCargo(new CargoDTO(usuario.getCargo()));
        dto.setCorreo(usuario.getCorreo());
        dto.setContrasena(usuario.getContrasena());

        return dto;
    }
}
