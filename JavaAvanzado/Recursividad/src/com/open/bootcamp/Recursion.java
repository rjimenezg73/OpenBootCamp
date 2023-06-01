package com.open.bootcamp;

/**
 * Una función es recursiva cuando ésta se llama así misma (Se invoca)
 * Cada vez que se haga una función recursiva se debe implementar un punto de control o de salida
 */

public class Recursion {

   public static void main(String[] args) {
      System.out.println(suma(5));
   }

   public static int suma(int n){
      if(n == 1){
         return 1;
      }
      return n + suma(n - 1);
   }

}
