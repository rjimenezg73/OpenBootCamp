package com.openbootcamp.demo.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.stereotype.Component;

@Component
@Path("/")
public class BootcampersController {

   @GET
   public String hola(){
      return "Hola";
   }

}
