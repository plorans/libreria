package com.um.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.um.demo.model.Role;

public interface RoleDao extends JpaRepository<Role,Long>{
    
}
