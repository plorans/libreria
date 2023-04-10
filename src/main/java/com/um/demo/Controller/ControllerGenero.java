package com.um.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.um.demo.Dao.GeneroDao;
import com.um.demo.Manager.GeneroManager;
import com.um.demo.model.Genero;

@Controller
public class ControllerGenero {

    @Autowired
    GeneroDao generoDao;

    @Autowired
    GeneroManager generoManager;

    @GetMapping("/generos")
    public ModelAndView libros(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("generos", generoDao.findAll());
        modelAndView.setViewName("Generos/Generos");
        return  modelAndView;
    }

    @GetMapping("/generos/guardar")
    public ModelAndView guardar(){
        ModelAndView modelAndView = new ModelAndView();
        Genero genero = new Genero();
        modelAndView.addObject("guardar", genero);
        return modelAndView;
    }

    @PostMapping("/generos/guardar")
    public ModelAndView guardarGenero(Genero genero){
		generoManager.guardaGenero(genero);
		return new ModelAndView("redirect:/generos") ;
    }

    @GetMapping("/generos/{id}")
    public ModelAndView borrarLibros(@PathVariable("id") Long id){
        generoManager.borrarGenero(id);
        return new ModelAndView("redirect:/generos");
    }
    
}
