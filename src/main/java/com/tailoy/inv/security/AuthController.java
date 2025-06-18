package com.tailoy.inv.security;

import com.tailoy.inv.model.Usuario;
import com.tailoy.inv.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final JWTUtil jwtUtil;
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder encoder;

    public AuthController(JWTUtil jwtUtil, UsuarioRepository usuarioRepository, PasswordEncoder encoder) {
        this.jwtUtil = jwtUtil;
        this.usuarioRepository = usuarioRepository;
        this.encoder = encoder;
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {
        Usuario usuario = usuarioRepository.findById(request.getId()).orElse(null);
        if (usuario != null && encoder.matches(request.getContrasena(), usuario.getContrasena())) {
            String token = jwtUtil.generateToken(usuario.getCorreo());
            return new AuthResponse(token);
        }
        throw new RuntimeException("Credenciales inválidas.");
    }

    @PostMapping("/register")
    public String register(@RequestBody Usuario usuario) {
        usuario.setContrasena(encoder.encode(usuario.getContrasena()));
        usuarioRepository.save(usuario);
        return "Usuario registrado.";
    }
}
