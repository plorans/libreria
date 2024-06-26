package com.um.demo.ManagerImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.um.demo.Dao.UsuarioDao;
import com.um.demo.Manager.RoleManager;
import com.um.demo.Manager.UsuarioManager;
import com.um.demo.model.Usuario;
@Service("UsuarioManager")
public class UsuarioManagerImpl implements UsuarioManager{
    
    @Autowired
    UsuarioDao usuarioDao;

    @Autowired
    RoleManager roleManager;

    @Override
    public Usuario guardarUsuario(Usuario usuario){
        Usuario salida = new Usuario();
        salida.setActivo(true);
        salida.setRole(roleManager.darRol());
        salida = usuarioDao.save(usuario);
        return salida;
    }

    @Override
    public Usuario buscarPorId(Long id){
        return usuarioDao.findById(id).orElseThrow();
    }

    @Override
    public Usuario desactivarUsuario(Long id){
        Usuario salida = usuarioDao.getReferenceById(id);
        salida.setActivo(false);
        return salida;
    }
}
