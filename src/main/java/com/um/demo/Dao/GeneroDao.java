package com.um.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.um.demo.model.Genero;

public interface GeneroDao extends JpaRepository<Genero,Long>{
    List<Genero> findByNombre(String nombre);
}
