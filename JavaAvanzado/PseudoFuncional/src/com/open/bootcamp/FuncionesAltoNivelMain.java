package com.open.bootcamp;
import com.open.bootcamp.FuncionesAltoNivel;

import java.util.ArrayList;
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

   }
}
