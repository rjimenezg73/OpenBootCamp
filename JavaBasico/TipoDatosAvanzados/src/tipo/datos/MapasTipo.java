/**
 * Un mapa recibe muchos nombres, los más comúnes son mapas y arrays asociativos
 * Un mapa es una especie de diccionario, donde tengo una clave y un valor
 * El valor, puede ser un mapa, un int, un BifDecimal, un Array, etc.
 *
 * La forma más primitiva del mapa es el HashMap
 * HashMap<Clave, Valor> IdentificadorVar = new HashMap<>();
 *
 * Los HashMap tienen una peculiaridad, y es que no pueden tener la clave duplicada
 */
package tipo.datos;

import java.util.HashMap;
import java.util.Map;

public class MapasTipo {
  public static void main(String[] args) {

    HashMap<String, Integer> mapa = new HashMap<>();

    mapa.put("clave1", 10);   // En concepto array["clave1"] = 10;
    mapa.put("clave2", 20);
    mapa.put("clave3", 30);
    mapa.put("clave4", 40);
    mapa.put("clave5", 50);

    System.out.println(mapa);

    // Para imprimir un valor determinado
    System.out.println(mapa.get("clave3"));

    // Eliminar un elemento del mapa
    mapa.remove("clave3");
    System.out.println(mapa);

    // Para iterar sobre un HashMap entero
    for(Map.Entry elemento : mapa.entrySet()){  // Map.Entry es un tipo de dato, entrySet() me devuelve cada uno de los elementos y se asigna a elemento
      System.out.println("Elemento clave es: " + elemento.getKey());
      System.out.println("Elemento valor es: " + elemento.getValue());
    }



  }
}
