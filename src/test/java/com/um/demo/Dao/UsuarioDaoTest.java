package com.um.demo.Dao;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.um.demo.model.Usuario;
@DataJpaTest
public class UsuarioDaoTest {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private UsuarioDao usuarioDao;

    @Test
    void testFindByNombre() {
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Carlos");
        usuario.setEmail("email");
        usuario.setPassword("123");
        usuario.setActivo(true);
        testEntityManager.persist(usuario);
        testEntityManager.flush();

        Usuario a = usuarioDao.findByEmail("email");
        Assertions.assertThat(a.getNombre()).isEqualTo("Carlos");
    }
}
