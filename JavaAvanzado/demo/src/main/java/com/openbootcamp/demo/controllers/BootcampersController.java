package com.openbootcamp.demo.controllers;

import com.openbootcamp.demo.models.Bootcamper;
import com.openbootcamp.demo.services.BootcamperService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.stereotype.Component;

import java.util.List;

// Debemos configurar éste controlador diciendo a Spring que ésta clase es un componente
// También debemos indicar qué es lo que va a procesar---- Barrita (path)
// Los controladores deben contener métodos
@Component
@Path("/")
public class BootcampersController {
   private BootcamperService bootcamperService;

   /*
   @GET  // Implementando el método GET
   public String hola(){

      return "Hola";
   }
   */

   // Si aumenta el número de servivios aumentará el número de parámetros
   public BootcampersController(BootcamperService bootcamperService){
      this.bootcamperService = bootcamperService;
   }

   @GET
   @Path("/bootcampers")
   public List<Bootcamper> listarTodos(){
      return bootcamperService.getAll();
   }

}
