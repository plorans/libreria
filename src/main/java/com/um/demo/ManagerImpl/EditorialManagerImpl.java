package com.um.demo.ManagerImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.um.demo.Dao.EditorialDao;
import com.um.demo.Manager.EditorialManager;
import com.um.demo.model.Editorial;

@Service("EditorialManager")
public class EditorialManagerImpl implements EditorialManager{

    @Autowired
    EditorialDao editorialDao;

    @Override
    public Editorial guardarEditorial(Editorial editorial) {
        Editorial salida = null;
        if(editorial.getNombre() != ""){
            salida = editorialDao.save(editorial);
        }
        return salida;
    }

    @Override
    public List<Editorial> buscarPorNombre(String nombre) {
        List<Editorial> salida = editorialDao.findByNombre(nombre);
        return salida;
    }

    @Override
    public Editorial buscarPorId(Long id) {
        return editorialDao.findById(id).orElseThrow();
    }

    @Override
    public void borrarEditorial(Long id) {
        editorialDao.deleteById(id);
    }
    
}
