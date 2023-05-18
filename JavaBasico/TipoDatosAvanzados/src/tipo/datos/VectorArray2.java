package tipo.datos;

import java.util.Vector;

public class VectorArray2 {
  public static void main(String[] args) {
    // Los vectores son como los arrays solo que no les damos valor inicial
    // es decir, se ajustan automáticamente a los tipos de datos que estemos usando.
    // Un vector se puede considerar como un array dinámico. Los vectores tienen dos
    // propiedades mágicas: 1. El tamaño y 2. La capacidad



    Vector<Integer> vector = new Vector();

    // Los vectores no almacenan datos al igual que los arrays, éstos lo hacen por medio de métodos
    vector.add(21);
    vector.add(15);
    vector.add(4);

    System.out.println("Datos del vector: " + vector);

    // Existe un método para eliminar elementos en base a su índice
    vector.remove(1);
    System.out.println("Datos del vector: " + vector);

    // Tamaño y capacidad de un vector
    System.out.println("Vector tamaño: " + vector.size() + ", vector capacidad: " + vector.capacity());

  }
}
