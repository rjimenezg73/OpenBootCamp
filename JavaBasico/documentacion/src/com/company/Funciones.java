package com.company;

public class Funciones {
  public static void main(String[] args) {
    HolaMundo();
    HolaNombre("Roberto");
    SumaDosNumeros(5,8);
  }

  private static void HolaMundo() {
    System.out.println("Hola Mundo!");
  }

  private static void HolaNombre(String name){
    System.out.println("Hola " + name);
  }

  public static void SumaDosNumeros(Integer a, Integer b){
    System.out.println(a + b);
  }
}
