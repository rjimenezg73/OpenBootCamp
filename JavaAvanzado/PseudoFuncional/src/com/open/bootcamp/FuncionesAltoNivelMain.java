package com.open.bootcamp;
import com.open.bootcamp.FuncionesAltoNivel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FuncionesAltoNivelMain {
   public static void main(String[] args) {
      FuncionesAltoNivel f = new FuncionesAltoNivel();

      f.pruebas();

      ArrayList<String> nombres = new ArrayList<>();
      nombres.add("Hugo");
      nombres.add("Paco");
      nombres.add("Luis");

      Stream<String> valores = nombres.stream().map(x -> x.toUpperCase())
              .filter(x -> x.startsWith("P"));

      //Una Manera más clara de entender y con el mismo resultado de arrib
      //Stream<String> valores = nombres.stream().map((x) -> {
      //   return "Hola, " + x.toUpperCase();
      //});


      valores.forEach(x -> System.out.println(x));


      // ¿Cómo convertir un arreglo de enteros a Stream para poder iterar?
      int []numeros = {1,2,3,4,5,6,7,8,9,10};
      var streamNumeros = Arrays.stream(numeros);
      streamNumeros.forEach(x -> System.out.print(x + ", "));

   }
}
