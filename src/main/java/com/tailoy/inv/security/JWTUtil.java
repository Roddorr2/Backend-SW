package com.tailoy.inv.security;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JWTUtil {
    private static final String SECRET = "clave_super_segura_para_jwt_con_mas_de_32_bytes_1234567890";
    private final Key key = Keys.hmacShaKeyFor(SECRET.getBytes());

    public String generateToken(String correo) {
        Map<String, Object> claims = new HashMap<>();

        return Jwts.builder()
                .setSubject(correo)
                .addClaims(claims)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    public String getCorreo(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public boolean isTokenValid(String token) {
      try {
          Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
          return true;
      } catch (JwtException | IllegalArgumentException e) {
          return false;
      }
    }
}
