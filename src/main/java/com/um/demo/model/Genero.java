package com.um.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "genero")
public class Genero {
    @Id
    private Long Id;
    private String nombre;
}
