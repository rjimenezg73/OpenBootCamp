package com.company;

// Las listas dináámicas son muy parecidas a los arrays pero nos permiten
// agregar y eliminar elementos dinámicamente.

import java.util.ArrayList;
import java.util.List;

public class ListMain {

  public static void main(String[] args) {

    // List es una interfaz, por lo tanto requerimos una implementación
    List<String> nombres = new ArrayList<>();

    nombres.add("Juan Pérez");
    nombres.add("Peter Pan");
    nombres.add("Pedrito Pica Cu");
    nombres.add("Semillita");

    System.out.println(nombres);

    for (String nom: nombres) {
      System.out.println(nom);
    }

    List<Coche> coches = new ArrayList<>();
    coches.add(new Coche());
    System.out.println(coches);

    for (Coche c:coches
         ) {
      System.out.println(c);
    }
  }

}
