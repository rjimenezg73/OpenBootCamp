/**
 * Son funciones que reciben como parámetro otra función
 */
package com.open.bootcamp;

import java.util.function.Function;

public class FuncionesAltoNivel {

   private Function<String, String> toMayus = (x) -> x.toUpperCase();  // Aquí creamos una función de alto nivel
   /**
    *    Represents a function that accepts one argument and produces a result.
    *    Type parameters:
    *             <T> – the type of the input to the function
    *             <R> – the type of the result of the function
    */

   private Function<Integer, Integer> sumador = (x) -> x.sum(x, x);



   public void pruebas(){
      System.out.println(toMayus.apply("Roberto"));
      System.out.println(sumador.apply(5));;
   }


}
