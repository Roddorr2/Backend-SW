package com.tailoy.inv.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.tailoy.inv.dto.UsuarioDTO;
import com.tailoy.inv.model.Usuario;
import com.tailoy.inv.service.UsuarioService;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<UsuarioDTO> getAllUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/{id}")
    public UsuarioDTO getUsuariosById(@PathVariable int id) {
        return usuarioService.getUsuariosById(id);
    }

    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.saveUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario updateUsuario(@PathVariable int id, @RequestBody Usuario usuario) {
        usuario.setId(id);
        return usuarioService.saveUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable int id) {
        usuarioService.deleteUsuario(id);
    }
}