package tipo.datos;
import  java.util.ArrayList;


/*
Los ArrayList tienen cosas muy en común con los vector.
¿Cómo aumenta ArrayList dinámicamente su capacidad a diferencia de vector que lo hacia al doble?

CapacidadVector = CapacidadVector * 2
CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5) , es decir, aumenta un 50%

Los ArrayList no son sincronizados mientras que un vector si
Cuando se haga programación concurrente usaremos vectores y
cuando usemos programación secuencial usaremos ArrayList

Ambos derivan de la misma clase padre abstractList
 */
public class ArrayListTipo {
  public static void main(String[] args) {

    // Declaración de un ArrayList
    // ArrayList<TipoDeDato> NombreVar = new ArrayList<>();

    ArrayList<String> lista = new ArrayList<String>();

    lista.add("ElementoA");
    lista.add("ElementoB");
    lista.add("ElementoC");
    lista.add("ElementoD");
    lista.add("ElementoE");
    lista.add("ElementoF");
    lista.add("ElementoG");
    System.out.println("Contenido: " + lista);

    // lista.remove(1); /* Elimina el elemento del indice indicado*/
    lista.remove("ElementoB");  // Si no se escribe correctamente devuelve F y no elimina nada
    System.out.println("Contenido: " + lista);

    // Recorrer un ArrayList
    for(String nom: lista){
      System.out.println(nom);
    }

    // Otra forma de recorrido que también se puede usar con los vectores
    for(int i = 0; i < lista.size(); i++){
      System.out.println(lista.get(i));
    }

    // Para convertir un ArrayList a un Array se realiza;
    String array[] = new String[lista.size()];
    for(int i = 0; i < lista.size(); i++){
      array[i] = lista.get(i);
    }
    System.out.println("ArrayList: " + lista);
    System.out.println("Array: ");
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }

  }
}
