package com.um.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.um.demo.model.Autor;

public interface AutorDao extends JpaRepository<Autor,Long>{
    
}
