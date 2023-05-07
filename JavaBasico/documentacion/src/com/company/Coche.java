package com.company;

public class Coche {

  // Atributos (Características que tiene un coche y varian de un coche a otro)
  String color;
  String fabricante;
  String Modelo;
  Double peso;
  Double largo;
  Integer velocidad = 0;

  // Constructores (Son métodos especiales que nos permiten crear objetos de ésta clase)
  // Si no se agrega ninguno habrá por defecto un constructor vacío.
  // El método constructor tiene el mismo nombre de la clase

  // Un constructor puede ser vacío. De no definirse se crea por default para permitir la instancia de los
  // objetos a utilizar con new
  public Coche(){

  }
  public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
  this.color = color;
  this.fabricante = fabricante;
  this.Modelo = modelo;
  this.peso = peso;
  this.largo = largo;

  }

  // Métodos (Comportamiento de un coche, de la clase)
  public void acelerar(Integer cantidad){
    if(cantidad > 0 && cantidad <= 120){
      this.velocidad += cantidad;
    }
  }

  @Override
  public String toString() {
    return "Coche{" +
            "color='" + color + '\'' +
            ", fabricante='" + fabricante + '\'' +
            ", Modelo='" + Modelo + '\'' +
            ", peso=" + peso +
            ", largo=" + largo +
            ", velocidad=" + velocidad +
            '}';
  }
}
