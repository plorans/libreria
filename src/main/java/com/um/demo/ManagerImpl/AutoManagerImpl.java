package com.um.demo.ManagerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.um.demo.Dao.AutorDao;
import com.um.demo.Manager.AutorManager;
import com.um.demo.model.Autor;

@Service("AutorManager")
public class AutoManagerImpl implements AutorManager {

    @Autowired
    AutorDao autorDao;

    @Override
    public Autor guardarAutor(Autor autor) {
        Autor salida = null;
        if(autor.getNombre() != ""){
            salida = autorDao.save(autor);
        }
        return salida;
    }

    @Override
    public List<Autor> buscarPorNombre(String nombre) {
        List<Autor> salida = autorDao.findByNombre(nombre);
        return salida;
    }

    @Override
    public Autor buscarPorId(Long id) {
        return autorDao.findById(id).orElseThrow();
    }

    @Override
    public void borrarAutor(Long id) {
        autorDao.deleteById(id);
    }
    
}
