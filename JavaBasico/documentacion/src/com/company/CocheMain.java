package com.company;

public class CocheMain {
  public static void main(String[] args) {
    String coche = "Alfa Romeo";
    Coche cocheObj = new Coche();
    Coche cocheObj2 = new Coche("rojo","Honda","Civic",1430.40,5.4);

    cocheObj2.acelerar(50);
    System.out.println(cocheObj2);
    cocheObj2.peso = 1350.8;
    cocheObj2.acelerar(30);
    System.out.println(cocheObj2);

    CocheElectrico cocheElectrico = new CocheElectrico();
    cocheElectrico.motorElectrico = "Ejemplo de motor";
    cocheElectrico.color = "Verde";
    cocheElectrico.fabricante = "Honda";
    cocheElectrico.Modelo = "Civic";

    System.out.println(cocheElectrico);

    CocheElectrico cocheElectrico2 = new CocheElectrico("Azul","Alfa", "Romeo", 1250.56, 3.9,"Motor Nueva Generación");
    cocheElectrico2.acelerar(40);
    System.out.println(cocheElectrico2);

  }
}
