package com.um.demo.Manager;

import java.util.List;

import com.um.demo.model.Autor;

public interface AutorManager {
    Autor guardarAutor(Autor autor);

    List<Autor> buscarPorNombre(String nombre);

    Autor buscarPorId(Long id);

    void borrarAutor(Long id);
}
