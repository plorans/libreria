package com.um.demo.ManagerImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.um.demo.Dao.RoleDao;
import com.um.demo.Manager.RoleManager;
import com.um.demo.model.Role;

@Service("RoleManager")
public class RoleManagerImpl implements RoleManager {

    @Autowired
    RoleDao roleDao;
    
    @Override
    public String darRol(){
        Role role = roleDao.getReferenceById(1L);
        String salida = "-";
        salida += role.getNombre().toString() + "-";
        return salida;
    }
}
