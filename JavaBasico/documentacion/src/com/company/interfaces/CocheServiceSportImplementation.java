package com.company.interfaces;

import com.company.Coche;
import com.company.CocheHibrido;
import com.company.interfaces.CocheService;

public class CocheServiceSportImplementation implements CocheService {

  @Override
  public Coche crearCocheDemo() {
    System.out.println("Creando coche sport...");
    return new CocheHibrido();
  }
}
