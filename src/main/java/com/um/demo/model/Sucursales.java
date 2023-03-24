package com.um.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sucursales")
public class Sucursales {
    @Id
    private Long Id;
    private String nombre;
    private String ubicacion;
    private String telefono;
    private String email;
    
}
