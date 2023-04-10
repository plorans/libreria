package com.um.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.um.demo.Dao.InventarioDao;

@Controller
public class ControllerInventario {

    @Autowired
    InventarioDao inventarioDao;

    @GetMapping("/inventario")
    public ModelAndView inventario(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("inventario", inventarioDao.findAll());
        modelAndView.setViewName("Inventario/Inventario");
        return  modelAndView;
    }
}
