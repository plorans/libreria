package com.um.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.um.demo.Dao.UsuarioDao;
import com.um.demo.Manager.UsuarioManager;
import com.um.demo.model.Usuario;


@RestController
@RequestMapping("/registrar")
public class ControllerRegistrar {

	@Autowired
	private UsuarioManager usuarioManager;

	@GetMapping("/registrar")
	public ModelAndView registro(){
		ModelAndView modelAndView = new ModelAndView();
		Usuario usuario = new Usuario();
		modelAndView.addObject("usuario", usuario);
		modelAndView.setViewName("registrar");
		return modelAndView;
	}
	
	@PostMapping("/registrar")
	public ModelAndView registrarUsuario(Usuario usuario) {
		ModelAndView modelAndView = new ModelAndView();	
		usuarioManager.guardarUsuario(usuario);
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
}