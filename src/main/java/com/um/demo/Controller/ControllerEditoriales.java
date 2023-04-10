package com.um.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.um.demo.Dao.EditorialDao;
import com.um.demo.Manager.EditorialManager;
import com.um.demo.model.Editorial;
import com.um.demo.model.Libros;

@Controller
public class ControllerEditoriales {
    
    @Autowired
    EditorialDao editorialDao;
    
    @Autowired
    EditorialManager editorialManager;

    @GetMapping("/editoriales")
    public ModelAndView editoriales(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("editorial", editorialDao.findAll());
        modelAndView.setViewName("Editoriales/Editoriales");
        return  modelAndView;
    }

    @GetMapping("/editoriales/guardar")
    public ModelAndView guardar(){
        ModelAndView modelAndView = new ModelAndView();
        Editorial editorial = new Editorial();
        modelAndView.addObject("guardar", editorial);
        return modelAndView;
    }

    @PostMapping("/editoriales/guardar")
    public ModelAndView guardarEditorial(Editorial editorial){
		editorialManager.guardarEditorial(editorial);
		return new ModelAndView("redirect:/editoriales") ;
    }

    @GetMapping("/editoriales/{id}")
    public ModelAndView borrarLibros(@PathVariable("id") Long id){
        editorialManager.borrarEditorial(id);
        return new ModelAndView("redirect:/editoriales");
    }

    
    
}
