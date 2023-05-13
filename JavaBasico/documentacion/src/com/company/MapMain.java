package com.company;
// Los Mapas son una estructura de datos que nos permite trabajar con
// pares de clave:valor

import java.util.HashMap;
import java.util.Map;

public class MapMain {
  public static void main(String[] args) {

    Map<String, String> personas = new HashMap<>();

    personas.put("12345", "Nombre1 Apellido1");
    personas.put("54321", "Nombre2 Apellido2");
    personas.put("33344", "Nombre3 Apellido3");

    System.out.println(personas);
    for (String k:personas.keySet()) {
      System.out.println(k);
    }
    for (String v:personas.values()) {
      System.out.println(v);
    }

    for(Map.Entry<String, String> pairVar: personas.entrySet()){
      System.out.println(pairVar.getKey() + " " + pairVar.getValue());
    }
  }
}
