package com.openbootcamp.demo.services;

// Los servicios se encargan de comunicar los modelos con los controladores
// Debemos especificar que ésta simple clase es un servivio anteponiendo @Service
// Los servicios son la parte lógica de nuestros sistemas

import com.openbootcamp.demo.models.Bootcamper;
import org.jvnet.hk2.annotations.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcamperService {
   // Hagamos que el BootcamperService contenga una lista de Bootcampers(usuarios)
   private List<Bootcamper> bootcampers = new ArrayList();

   // Implementar un método que nos retorne todos los usuarios
   public List<Bootcamper> getAll(){
      return bootcampers;
   }

   public void add(Bootcamper bootcamper){
      bootcampers.add(bootcamper);
   }

}
