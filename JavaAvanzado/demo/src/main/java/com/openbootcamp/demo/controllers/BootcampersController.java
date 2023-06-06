package com.openbootcamp.demo.controllers;

import com.openbootcamp.demo.models.Bootcamper;
import com.openbootcamp.demo.services.BootcamperService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.springframework.stereotype.Component;

import java.util.List;

// Debemos configurar éste controlador diciendo a Spring que ésta clase es un componente
// También debemos indicar qué es lo que va a procesar---- Barrita (path)
// Los controladores deben contener métodos
@Component
@Path("/")
public class BootcampersController {
   private final BootcamperService bootcamperService;


   // Si aumenta el número de servivios aumentará el número de parámetros
   public BootcampersController(BootcamperService bootcamperService){
      this.bootcamperService = bootcamperService;

      // Lo que sigue no se debe de hacer, solo se hace para visualizar algo en el navegador
      this.bootcamperService.add(new Bootcamper("uno"));
      this.bootcamperService.add(new Bootcamper("dos"));
      this.bootcamperService.add(new Bootcamper("tres"));
      this.bootcamperService.add(new Bootcamper("cuatro"));
      this.bootcamperService.add(new Bootcamper("cinco"));
   }

   @GET
   @Path("/bootcampers")
   @Produces("application/json")    // Especificamos que tipo de salida deseamos
   public List<Bootcamper> listarTodos(){
      return bootcamperService.getAll();
   }

}
