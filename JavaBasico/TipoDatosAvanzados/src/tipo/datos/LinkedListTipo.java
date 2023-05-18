/*
Una LinkedList se declara igual que un ArrayList
Ambos son listas, se declaran exactamente igual, ambos tienen los mismos métodos,
ambas tienen las mismas propiedades, ambas operan de la misma forma.
Entonces, ¿Cuando vamos a utilizar una LinkedList y cuando un ArrayList?

A pesar de todas las similitudes existen tres diferencias grandes:
1. Un ArrayList utiliza un Array de forma subyacente,
2. Una LinkedList no utiliza un array, utiliza una estructura de datos que se llama listas
    doblemente enlazadas.
3. Por lo anterior, el Array es más rápido para buscar y almacenar datos, sin embargo, la LinkedList es
    más rápida cuando queremos modificar datos(no almacenar ni buscar, sino modificars)
*/
package tipo.datos;

import java.util.LinkedList;

public class LinkedListTipo {
  public static void main(String[] args) {

    LinkedList<String> listaEnlazada = new LinkedList<String>();


  }
}
