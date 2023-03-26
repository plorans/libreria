package com.um.demo.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.um.demo.Dao.UsuarioDao;



@Controller
public class ControllerInicio{
	
	@RequestMapping(value={"/inicio"}, method = RequestMethod.GET)
	public ModelAndView inicio() {
		ModelAndView modelAndView = new ModelAndView();
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Collection<? extends GrantedAuthority> grantedAuthorities = auth.getAuthorities();
		
		String role 	= "";
		
		for (GrantedAuthority grantedAuthority : grantedAuthorities){
			role = role +"-"+grantedAuthority.getAuthority();
		}
		
		modelAndView.addObject("role", role);
		return modelAndView;
		
	}
}