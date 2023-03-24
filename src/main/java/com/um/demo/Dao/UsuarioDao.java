package com.um.demo.Dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.um.demo.model.Usuario;
@Repository
public interface UsuarioDao extends JpaRepository<Usuario,Long>{

    Usuario findByEmail(String email);

    List<Usuario> findAll();

    List<Usuario> findByNombre(String nombre);

}
