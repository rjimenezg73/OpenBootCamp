package tipo.datos;

import java.sql.Array;

public class VectorArray {
  public static void main(String[] args) {
    int arrayUno[] = new int[5];  // Definiendo la longitud del arreglo para 5 posiciones (0...4)
    arrayUno[0] = 1;
    arrayUno[1] = 2;
    arrayUno[2] = 3;
    arrayUno[3] = 4;
    arrayUno[4] = 5;
    // Más eficiente si sabemos el contenido del array es hacerlo de la siguiente manera
    // int arrayUno[] = {1, 2, 3, 4, 5};
    // La desventaja de los arrays es que si hemos definido su longitud no podemos agrandar o disminuir
    // su tamaño
    // Los arrays no solamente son unidimensionales, pueden tener las dimensiones que deseemos.

    for (int i: arrayUno) {
      System.out.println(i);
    }
  }
}
