package com.openbootcamp.demo.models;

// Un modelo contiene la información de los objetos sobre los que se va a trabajar
// A ésta parte de implementar el modelo se le conoce copo
// POJO ---> Plain Old Java Object
public class Bootcamper {
   private String nombre;

   // Cómo voy a generar un constructor con un parámetro entonces Java NO me va a generar un constructor vacío
   // Siendo que lo requiero me toca hacerlo a mano aunque ese constructor realmente no haga nada
   public Bootcamper(){

   }

   public Bootcamper(String nombre){
      this.nombre = nombre;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
}
