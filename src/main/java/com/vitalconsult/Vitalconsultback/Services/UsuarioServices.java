package com.vitalconsult.Vitalconsultback.Services;



import com.vitalconsult.Vitalconsultback.Entity.UsuarioRolEntity;
import com.vitalconsult.Vitalconsultback.Entity.UsuariosEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public interface UsuarioServices {

    public UsuariosEntity guardarUsuarioService (UsuariosEntity usuariosEntity, Set<UsuarioRolEntity> usuarioRolEntity) throws Exception;

    public UsuariosEntity obtenerUsuarioService (String username);

    public void eliminarUsuarioService (int idusurios);
    public List<UsuariosEntity> listarUsuarios();

}
