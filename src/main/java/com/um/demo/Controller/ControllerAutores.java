package com.um.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.um.demo.Dao.AutorDao;
import com.um.demo.Manager.AutorManager;
import com.um.demo.model.Autor;

@Controller
public class ControllerAutores {

    @Autowired
    AutorDao autorDao;

    @Autowired
    AutorManager autorManager;

    @GetMapping("/autores")
    public ModelAndView showAutores(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("autor", autorDao.findAll());
        modelAndView.setViewName("Autores/Autores");
        return modelAndView;
    }

    @GetMapping("/autores/guardar")
    public ModelAndView guardar(){
        ModelAndView modelAndView = new ModelAndView();
        Autor autor = new Autor();
        modelAndView.addObject("guardar", autor);
        modelAndView.setViewName("Autores/Nuevo");
        return modelAndView;
    }

    @PostMapping("/autores/guardar")
    public ModelAndView guardarAutor(Autor autor){
		autorManager.guardarAutor(autor);
		return new ModelAndView("redirect:/autores") ;
    }

    @GetMapping("/autores/{id}")
    public ModelAndView borrarAutor(@PathVariable("id") Long id){
        autorManager.borrarAutor(id);
        return new ModelAndView("redirect:/autores");
    }

    @GetMapping("/autores/editar/{id}")
    public ModelAndView editar(@PathVariable("id") Long id){
        ModelAndView modelAndView = new ModelAndView();
        Autor autor = autorManager.buscarPorId(id);
        modelAndView.addObject("autor", autor);
        modelAndView.setViewName("Autores/Edit");
        return modelAndView;
    }

    @PostMapping("/autores/editar/{id}")
    public ModelAndView editarAutor(@PathVariable("id") Long id,  Autor autor){
        Autor salida = autorDao.getReferenceById(id);
        salida.setId(id);
        salida.setNombre(autor.getNombre());
        autorManager.guardarAutor(autor);
        return new ModelAndView("redirect:/autores") ;
    }
}
