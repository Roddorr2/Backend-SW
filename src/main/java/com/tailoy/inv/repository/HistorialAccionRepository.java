package com.tailoy.inv.repository;

import com.tailoy.inv.dto.HistorialUsuarioDTO;
import com.tailoy.inv.model.HistorialAccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface HistorialAccionRepository extends JpaRepository<HistorialAccion, Integer> {

    @Query("SELECT new com.tailoy.inv.dto.HistorialUsuarioDTO(h.id, h.descripcion, h.tipoAccion, u.nombre, u.correo) " +
            "FROM HistorialAccion h JOIN h.usuario u")
    List<HistorialUsuarioDTO> fetchHistorialWithUsuarioJPQL();

    @Query(value = "SELECT h.id AS historialId, h.descripcion, h.tipo_accion AS tipoAccion, u.nombre AS usuarioNombre, u.correo AS usuarioCorreo " +
            "FROM historial_accion h JOIN usuario u ON h.usuario_id = u.id",
            nativeQuery = true)
    List<Map<String, Object>> fetchHistorialWithUsuarioNative();
}
