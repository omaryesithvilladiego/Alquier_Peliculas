package com.example.Alquier_Peliculas.servicios;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Alquier_Peliculas.models.Pelicula;
import com.example.Alquier_Peliculas.models.PeliculasRepository;

@Service
@RequiredArgsConstructor
public class Peliculaimpl implements PeliculaServicio 


{
    @Autowired
    private PeliculasRepository peliRepo;

    


    public Peliculaimpl(PeliculasRepository peliRepo) {
        this.peliRepo = peliRepo;
    }


    @Override
    public List<Pelicula> listarPeliculaPorComedia() {
        return (List<Pelicula>) peliRepo.consultarUsuarioPoComedia("comedia");
    }

    @Override
    public List<Pelicula> listarporTerror() {
        return (List<Pelicula>) peliRepo.consultarUsuarioPoComedia("terror");
    }


    @Override
    public Pelicula guardarPelicula(Pelicula pelicula)
    
    {
        return peliRepo.save(pelicula);

    }



    
}
