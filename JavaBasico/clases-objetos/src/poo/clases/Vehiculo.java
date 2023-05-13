package poo.clases;

public class Vehiculo {
  // 1. Atributos
  // 2. Constructores - Son métodos especiales que permiten construir los objetos a partir de ésta plantilla
  // 3. Métodos - que definen acciones, comportamientos

  /**
   * Atributos
   */
  String facricante;
  String modelo;
  Double cc; // cc - centímetro cúbicos. Double es un tipo de dato envoltorio. La diferencia con los tipos de datos
              // primitivos es que permite que sus valores puedan ser nulos, esto es especialmente beneficioso cuando trabajamos con DB
  int year;
  boolean sport;
  int speed = 0;

  /**
   * Constructores
   */
  public Vehiculo(){
    // Constructor vacío. De no crearse se genera de manera implícita
  }

  // Constructores con sobre carga
  public Vehiculo(String facricante, String modelo, Double cc, int year, boolean sport){
    this.facricante = facricante;
    this.modelo = modelo;
    this.cc = cc;
    this.year = year;
    this.sport = sport;
    this.speed = 0;
  }

  public Vehiculo(String facricante, int year) {
    this.facricante = facricante;
    this.year = year;
  }

  /**
   * Métodos
   */
  public void acelerar(int quantity){
    this.speed = this.speed + quantity;
  }



}
