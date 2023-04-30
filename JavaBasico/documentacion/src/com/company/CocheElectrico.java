package com.company;

/**
 * Para estudiar la Herencia, es decir, de una clase base se heredarán todas sus características agregando
 * solo a la nueva clase características o métodos especiales. Esto se realiza con la palabra especial
 * extends
 */

public class CocheElectrico extends Coche{

  String motorElectrico;

  // Usando el concepto de sobrecarga de funciones es que podemos usar varias funciones o constructoress
  // con el mismo nombre pero distintos parámetros o tipos de datos que éstas devuelven
  public CocheElectrico(){

  }

  public CocheElectrico(String motorElectrico){
    this.motorElectrico = motorElectrico;
  }

  public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico){
    super(color, fabricante, modelo, peso, largo);    // El método super nos permite invocar a un constructor de la clase superior
    this.motorElectrico = motorElectrico;
  }

  @Override
  public String toString() {
    return "CocheElectrico{" +
            "motorElectrico='" + motorElectrico + '\'' +
            ", color='" + color + '\'' +
            ", fabricante='" + fabricante + '\'' +
            ", Modelo='" + Modelo + '\'' +
            ", peso=" + peso +
            ", largo=" + largo +
            ", velocidad=" + velocidad +
            '}';
  }
}
