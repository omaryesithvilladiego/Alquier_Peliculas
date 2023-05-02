package com.example.Alquier_Peliculas.servicios;

import java.util.List;

import com.example.Alquier_Peliculas.models.Pelicula;

public interface PeliculaServicio {

    Pelicula guardarPelicula(Pelicula peliculas);
    List<Pelicula> listarPeliculaPorComedia();
    List<Pelicula> listarporTerror();
    List<Pelicula> listarporSuspenso();
    List<Pelicula> listarporAccion();
    List<Pelicula> listarporRomance();
    List<Pelicula> listarporAventura();
    List<Pelicula> listarporDrama();
}
