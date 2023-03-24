package com.um.demo.model;

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
    private int libroId;
    private int sucursalId;
    private int existencia;

}
