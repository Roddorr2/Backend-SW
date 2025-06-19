package com.tailoy.inv.service;

import com.tailoy.inv.dto.CargoDTO;
import com.tailoy.inv.dto.UsuarioDTO;
import com.tailoy.inv.model.Usuario;
import com.tailoy.inv.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
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

    public Usuario saveUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
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
