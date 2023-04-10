package com.um.demo.ManagerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.um.demo.Dao.GeneroDao;
import com.um.demo.Manager.GeneroManager;
import com.um.demo.model.Genero;

@Service("Generomanager")
public class GeneroManagerImpl implements GeneroManager{

    @Autowired
    GeneroDao generoDao;

    @Override
    public Genero guardaGenero(Genero genero) {
        Genero salida = null;
        if(genero.getNombre() != ""){
            salida = generoDao.save(genero);
        }
        return salida;
    }

    @Override
    public List<Genero> buscarPorNombre(String nombre) {
        List<Genero> salida = generoDao.findByNombre(nombre);
        return salida;
    }

    @Override
    public Genero buscarPorId(Long id) {
        return generoDao.findById(id).orElseThrow();    
    }

    @Override
    public void borrarGenero(Long id) {
        generoDao.deleteById(id);
    }
    
}
