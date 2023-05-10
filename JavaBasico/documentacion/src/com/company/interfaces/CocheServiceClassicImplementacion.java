package com.company.interfaces;

import com.company.Coche;
import com.company.CocheElectrico;
import com.company.interfaces.CocheService;

/**
 * Esta clase es para realizar la implementacion de la interface creada ( CocheService )
 */
public class CocheServiceClassicImplementacion implements CocheService {

  @Override
  public Coche crearCocheDemo() {
    System.out.println("Creando coche clásico...");
    return new CocheElectrico();
  }
}
