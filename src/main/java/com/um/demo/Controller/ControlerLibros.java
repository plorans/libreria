package com.um.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class ControlerLibros {
    
    @GetMapping("/libros")
    public ModelAndView libros(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Libros");
        return  modelAndView;
    }

}
