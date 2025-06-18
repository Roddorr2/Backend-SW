package com.tailoy.inv.security;

import com.tailoy.inv.repository.UsuarioRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class JWTFilter extends GenericFilter {
    private final JWTUtil jwtUtil;
    private final UsuarioRepository usuarioRepository;

    public JWTFilter(JWTUtil jwtUtil, UsuarioRepository usuarioRepository) {
        this.jwtUtil = jwtUtil;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String header = req.getHeader("Authorization");

        if (header != null && header.startsWith("Bearer ")) {
            String token = header.replace("Bearer ", "");
            if (jwtUtil.isTokenValid(token)) {
                String correo = jwtUtil.getCorreo(token);

                var auth = new UsernamePasswordAuthenticationToken(correo, null);
                SecurityContextHolder.getContext().setAuthentication(auth);
            }
        }
        chain.doFilter(request, response);
    }
}
