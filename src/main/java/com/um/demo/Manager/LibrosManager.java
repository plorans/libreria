package com.um.demo.Manager;

import java.util.List;

import com.um.demo.model.Libros;

public interface LibrosManager {

    Libros guardaLibros(Libros libros);

    List<Libros> buscarPorTitulo(String titulo);

    Libros buscarPorId(Long id);

    void borrarLibro(Long id);
}
