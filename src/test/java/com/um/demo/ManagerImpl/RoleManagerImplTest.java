package com.um.demo.ManagerImpl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.um.demo.Dao.RoleDao;
import com.um.demo.Manager.RoleManager;
import com.um.demo.model.Role;

@SpringBootTest
public class RoleManagerImplTest {

    @Autowired
    RoleManager roleManager;

    @MockBean
    RoleDao roleDao;


    @Test
    void testDarRol() {
        Role prueba = new Role();
        prueba.setId(1L);
        prueba.setNombre("admin");

        Mockito.when(roleDao.getReferenceById(1L)).thenReturn(prueba);

        String salida = roleManager.darRol();

        Assertions.assertThat(salida).isEqualTo("-admin-");



    }
}
