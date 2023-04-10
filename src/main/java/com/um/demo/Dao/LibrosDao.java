package com.um.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.um.demo.model.Libros;

public interface LibrosDao extends JpaRepository<Libros,Long>{
    List<Libros> findByTitulo(String titulo);
}
