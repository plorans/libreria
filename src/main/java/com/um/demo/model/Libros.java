package com.um.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "libros")
public class Libros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String isbn;
    private String titulo;
    @Column(name = "autor_id")
    private int autorId;
    @Column(name = "editorial_id")
    private int editorialId;
    private int ano;
    private String precio;
    @Column(name = "genero_id")
    private int generoId;
    private String idioma;
    private int paginas;
    private Byte img;
}
