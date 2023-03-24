package com.um.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.um.demo.Manager.UsuarioManager;
import com.um.demo.model.Usuario;

@RestController
@RequestMapping("/test")
public class ControllerTest {

    @Autowired
    UsuarioManager usuarioManager;

    @PostMapping("/usuario")
	public Usuario postUsuario(Usuario usuario){
		return usuarioManager.guardarUsuario(usuario);
	}
}
