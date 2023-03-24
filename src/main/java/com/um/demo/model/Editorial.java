package com.um.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "editorial")
public class Editorial {
    @Id
    private Long Id;
    private String nombre;
}
