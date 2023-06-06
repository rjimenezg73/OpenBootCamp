package com.openbootcamp.demo.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.stereotype.Component;

// Debemos configurar éste controlador diciendo a Spring que ésta clase es un componente
// También debemos indicar qué es lo que va a procesar---- Barrita (path)
// Los controladores deben contener métodos
@Component
@Path("/")
public class BootcampersController {

   @GET  // Implementando el método GET
   public String hola(){

      return "Hola";
   }

}
