package com.company;

public class TryCatchMain {
  public static void main(String[] args) {
    try{
      int resultado = 5/0;
    } catch (Exception e){
      System.out.println("Ha ocurrido un error!...");
      e.printStackTrace();
    } finally {
      System.out.println("Cierre de recursos");
    }

    System.out.println("Fin del programa");
  }
}
