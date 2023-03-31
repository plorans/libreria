package com.um.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.um.demo.Manager.RoleManager;
import com.um.demo.Manager.UsuarioManager;
import com.um.demo.model.Usuario;

@Controller
public class ControllerRegistrar {
	
	@Autowired
	private UsuarioManager usuarioManager;

    @Autowired
    private RoleManager roleManager;

	@RequestMapping(value={"/registrar"}, method = RequestMethod.GET)
	public ModelAndView registro(){
		ModelAndView modelAndView = new ModelAndView();
		Usuario usuario = new Usuario();
		modelAndView.addObject("usuario", usuario);
		modelAndView.setViewName("registrar");
		return modelAndView;
	}
	
	@RequestMapping(value = "/registrar", method = RequestMethod.POST)
	public ModelAndView registrarUsuario(Usuario usuario) {
		ModelAndView modelAndView = new ModelAndView();	
        usuario.setActivo(true);
        usuario.setRole(roleManager.darRol());
		usuarioManager.guardarUsuario(usuario);
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
}