package com.temas;

public class SmartMain {
  public static void main(String[] args) {
    SmartDevice smartObj = new SmartDevice("China", "SuperTech", 18.14, true, true);
    String miMarca = smartObj.getMarca();

    System.out.println("Marca: " + miMarca);
    System.out.println("Con Wifi?: " + smartObj.wifi);
    System.out.println(smartObj); // No sé por que me arroja esto?   com.temas.SmartDevice@3feba861
                                  // Solucionado---- Faltaba --> Generate  --> toString()

    SmartPhone phoneObj = new SmartPhone("apple", "Z01",350, false,true,100,64);
    System.out.println(phoneObj);
    System.out.println("Carga de batería: " + phoneObj.cargaBateria);

    SmartWatch watchObj = new SmartWatch("patito", "oneone", 20, true, true, "Android",false);
    System.out.println(watchObj);
  }
}
