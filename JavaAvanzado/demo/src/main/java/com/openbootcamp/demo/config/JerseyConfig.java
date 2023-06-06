package com.openbootcamp.demo.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@ApplicationPath("/")   // Indica que nuestra aplicación se ejecuta despues del :8080
@Component              // Se define ésta clase como un componente
public class JerseyConfig extends ResourceConfig { // Debemos indicar que esta clase hereda de ResourceConfig
   // Ahora creamos dentro de la configuración de Jersey un constructor
   public JerseyConfig(){

      this.packages("com.openbootcamp.demo.controllers"); // Indicamos donde estarán nuestros controladores
      // Un controlador es una clase de java que podemos llamar como deseamos
      // para éste caso llamaremos BootcampersController
   }
}
