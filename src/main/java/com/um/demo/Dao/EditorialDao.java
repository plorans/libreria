package com.um.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.um.demo.model.Editorial;

public interface EditorialDao extends JpaRepository<Editorial,Long>{
    
}
