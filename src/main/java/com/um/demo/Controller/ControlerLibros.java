package com.um.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.um.demo.Dao.LibrosDao;
import com.um.demo.Manager.LibrosManager;
import com.um.demo.model.Libros;

@Controller
public class ControlerLibros {

    @Autowired
    LibrosDao librosDao;

    @Autowired
    LibrosManager librosManager;
    
    @GetMapping("/libros")
    public ModelAndView libros(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("libros", librosDao.findAll());
        modelAndView.setViewName("Libros/Libros");
        return  modelAndView;
    }

    @GetMapping("/libros/guardar")
    public ModelAndView guardar(){
        ModelAndView modelAndView = new ModelAndView();
        Libros libros = new Libros();
        modelAndView.addObject("guardar", libros);
        return modelAndView;
    }

    @PostMapping("/libros/guardar")
    public ModelAndView guardarLibro(Libros libros){
		librosManager.guardaLibros(libros);
		return new ModelAndView("redirect:/libros") ;
    }

    @GetMapping("/libros/{id}")
    public ModelAndView borrarLibros(@PathVariable("id") Long id){
        librosManager.borrarLibro(id);
        return new ModelAndView("redirect:/libros");
    }

}
