
package com.example.Alquier_Peliculas.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Alquier_Peliculas.models.Pelicula;
import com.example.Alquier_Peliculas.servicios.Peliculaimpl;

import org.springframework.ui.Model;


@Controller


@RequestMapping("/")
public class Controlador {

   @Autowired
   private Peliculaimpl peliimple;
    

   @GetMapping("")
   public String MainPage(Model model) {
   model.addAttribute("comedias", peliimple.listarPeliculaPorComedia());
   model.addAttribute("terror", peliimple.listarporTerror());
   model.addAttribute("suspenso", peliimple.listarporSuspenso());
   model.addAttribute("accion", peliimple.listarporAccion());
   model.addAttribute("romance", peliimple.listarporRomance());
   model.addAttribute("aventura", peliimple.listarporAventura());
   model.addAttribute("drama", peliimple.listarporDrama());


   // Recorrer Array
//    var ArrayPelis = peliimple.listarPeliculaPorComedia();
//    for (int i = 0; i < ArrayPelis.size(); i++) {
//       var elemento = ArrayPelis.get(i);
//       System.out.println(elemento);
//   }
   
    return "index";
   }



  
   

   @PostMapping("/")
   public String agregarPelicula(Pelicula peliculas, Model model, @RequestParam("file") MultipartFile imagen) {
      
      if(!imagen.isEmpty()) {
         Path directorioImagen = Paths.get("src//main//resources//static//imagenes");
         String rutaAbsoluta =  directorioImagen.toFile().getAbsolutePath();

         try {
            byte[] bytesImg = imagen.getBytes();
            Path rutaCompleta = Paths.get(rutaAbsoluta + "//" + imagen.getOriginalFilename());
            Files.write(rutaCompleta, bytesImg);

            peliculas.setImagen(imagen.getOriginalFilename());
         } catch (IOException e) {
            e.printStackTrace();
         }
         
      }





      peliimple.guardarPelicula(peliculas);

      return "index";
   }


  
    
}
