package com.um.demo.ManagerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.um.demo.Dao.LibrosDao;
import com.um.demo.Manager.LibrosManager;
import com.um.demo.model.Libros;

@Service("LibrosManager")
public class LibrosManagerImpl implements LibrosManager{

    @Autowired
    LibrosDao librosDao;

    @Override
    public Libros guardaLibros(Libros libros) {
        Libros salida = null;
        if(libros.getTitulo() != null){
            salida = librosDao.save(libros);
        }
        return salida;
    }

    @Override
    public List<Libros> buscarPorTitulo(String titulo) {
        List<Libros> salida = librosDao.findByTitulo(titulo);
        return salida;
    }

    @Override
    public Libros buscarPorId(Long id) {
        return librosDao.findById(id).orElseThrow();
    }

    @Override
    public void borrarLibro(Long id) {
        librosDao.deleteById(id);
    }
    
}
