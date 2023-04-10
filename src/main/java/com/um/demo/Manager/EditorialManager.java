package com.um.demo.Manager;

import java.util.List;

import com.um.demo.model.Editorial;

public interface EditorialManager {
    
    Editorial guardarEditorial(Editorial editorial);

    List<Editorial> buscarPorNombre(String nombre);

    Editorial buscarPorId(Long id);

    void borrarEditorial(Long id);
}
