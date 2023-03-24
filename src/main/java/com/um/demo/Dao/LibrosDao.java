package com.um.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.um.demo.model.Libros;

public interface LibrosDao extends JpaRepository<Libros,Long>{
    
}
