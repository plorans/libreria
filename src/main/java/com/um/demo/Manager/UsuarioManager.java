package com.um.demo.Manager;

import com.um.demo.model.Usuario;

public interface UsuarioManager {

    Usuario guardarUsuario(Usuario usuario);

    Usuario buscarPorId(Long id);

    Usuario desactivarUsuario(Long id);
    
}
