package com.company.interfaces;

import com.company.Coche;

public class InterfacesMain {

  public static void main(String[] args) {

    // Aquí estamos aplicando polimorfismo pero sobre interfaces
    CocheService service1 = new CocheServiceClassicImplementacion();
    CocheService service2 = new CocheServiceSportImplementation();

    Coche coche1 = service1.crearCocheDemo();
    Coche coche2 = service2.crearCocheDemo();
  }


}
