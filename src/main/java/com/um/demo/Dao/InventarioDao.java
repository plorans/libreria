package com.um.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.um.demo.model.Inventario;

public interface InventarioDao extends JpaRepository<Inventario,Long>{
    
}
