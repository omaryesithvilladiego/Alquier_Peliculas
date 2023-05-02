package com.example.Alquier_Peliculas.models;


import javax.transaction.Transactional;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculasRepository extends CrudRepository<Pelicula, Long>
{

    @Transactional

    @Query (value = "select p.Idpelicula,p.imagen, p.nombre, p.genero, p.año, p.unidades, p.precio from pelicula p where p.genero= :genero", nativeQuery = true)
    public List<Pelicula> consultarUsuarioPoComedia(@Param("genero") String genero);

    

    
   

    
}
