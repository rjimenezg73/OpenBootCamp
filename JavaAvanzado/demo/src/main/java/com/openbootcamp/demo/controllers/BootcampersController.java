package com.openbootcamp.demo.controllers;

import com.openbootcamp.demo.models.Bootcamper;
import com.openbootcamp.demo.services.BootcamperService;
import jakarta.ws.rs.*;
import org.apache.coyote.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

import static org.apache.coyote.Response.*;

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
      this.bootcamperService.add(new Bootcamper("uno", Math.random()));
      this.bootcamperService.add(new Bootcamper("dos", Math.random()));
      this.bootcamperService.add(new Bootcamper("tres", Math.random()));
      this.bootcamperService.add(new Bootcamper("cuatro", Math.random()));
      this.bootcamperService.add(new Bootcamper("cinco", Math.random()));
   }

   @GET
   @Path("/bootcampers")
   @Produces("application/json")    // Especificamos que tipo de salida deseamos
   public List<Bootcamper> listarTodos(){
      return bootcamperService.getAll();
   }

   @POST
   @Path("/bootcampers")
   @Produces("application/json")
   @Consumes("application/json")
   public Response meterBootcamper(Bootcamper bootcamper){
      this.bootcamperService.add(bootcamper);

      return Response.created(
              URI.create("/bootcampers/" + bootcamper.getNombre())
      ).build();
   }


}
