package com.um.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.um.demo.model.Autor;

public interface AutorDao extends JpaRepository<Autor,Long>{
    List<Autor> findByNombre(String nombre);
    
    
    //Autor deleteById(Autor autor);

}
