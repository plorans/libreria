package com.um.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "inventario")
public class Inventario {
    @Id
    private Long Id;
    @Column(name = "libro_id")
    private int libroId;
    @Column(name = "sucursal_id")
    private String sucursalId;
    private int existencia;
}
