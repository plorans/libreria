package com.um.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ControllerLogin {
	@RequestMapping(value= {"/","/login"}, method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("Login");
		return modelAndView;
	}
	
	public ModelAndView logout() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("logout");
		return modelAndView;
	}
}
