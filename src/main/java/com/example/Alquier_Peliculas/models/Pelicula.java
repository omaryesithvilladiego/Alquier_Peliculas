package com.example.Alquier_Peliculas.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;
import javax.persistence.GenerationType;


@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "pelicula")
public class Pelicula implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include()
    private Long Idpelicula;
    private String Imagen;

    
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "genero")
    private String genero;
    @Column(name = "año")
    private int año;
    @Column(name = "unidades")
    private int unidades;
    @Column(name = "precio")
    private Float precio;

    

    public Pelicula() {

    }

    public Pelicula(Long idpelicula,String imagen, String nombre, String genero, int año, int unidades, Float precio) {
        Idpelicula = idpelicula;
        Imagen = imagen;
        this.nombre = nombre;
        this.genero = genero;
        this.año = año;
        this.unidades = unidades;
        this.precio = precio;
    }



    
    
}
