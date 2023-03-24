package com.um.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "libros")
public class Libros {
    @Id
    private Long Id;
    private String isbn;
    private String titulo;
    private int autorId;
    private int editorialId;
    private int año;
    private String precio;
    private int generoId;
    private String idioma;
}
