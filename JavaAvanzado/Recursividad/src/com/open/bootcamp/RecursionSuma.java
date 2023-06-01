package com.open.bootcamp;

import java.util.stream.IntStream;

/**
 * Una función es recursiva cuando ésta se llama así misma (Se invoca)
 * Cada vez que se haga una función recursiva se debe implementar un punto de control o de salida
 */

public class RecursionSuma {

   public static void main(String[] args) {
      System.out.println("Suma Recursiva: " + suma(5));
      System.out.println("Suma Funcional con IntStream: " + sumaFuncional(5));
   }

   public static int suma(int n){
      if(n == 1){
         return 1;
      }
      return n + suma(n - 1);
   }

   public static int sumaFuncional(int numero){
      return IntStream.rangeClosed(1, 5)
              .reduce(0, (a,b) -> a+b);
   }

}
