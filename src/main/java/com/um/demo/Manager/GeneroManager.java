package com.um.demo.Manager;

import java.util.List;

import com.um.demo.model.Genero;

public interface GeneroManager {
    
    Genero guardaGenero(Genero genero);

    List<Genero> buscarPorNombre(String nombre);

    Genero buscarPorId(Long id);

    void borrarGenero(Long id);
}
