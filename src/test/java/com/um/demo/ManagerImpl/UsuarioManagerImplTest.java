package com.um.demo.ManagerImpl;

import javax.transaction.Transactional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.um.demo.Dao.UsuarioDao;
import com.um.demo.Manager.UsuarioManager;
import com.um.demo.model.Usuario;

@SpringBootTest
public class UsuarioManagerImplTest {

    @Autowired
    private UsuarioManager usuarioManager;

    @MockBean
    private UsuarioDao usuarioDao;


    @Test
    @Transactional
    void testGuardarUsuario() {
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("carlos");
        usuario.setEmail("1@a.1");
        usuario.setPassword("123");
        usuario.setActivo(true); 
        usuarioDao.saveAndFlush(usuario);

        Mockito.when(usuarioDao.save(usuario)).thenReturn(usuario);
        
        usuarioManager.guardarUsuario(usuario); 

        Mockito.when(usuarioDao.findById(1L).orElseThrow()).thenReturn(usuario);

        Usuario prueba = usuarioManager.buscarPorId(1L);
        Assertions.assertThat(prueba).isNull();
        

    }
}
