package com.company;

public class WhileLoop {
  public static void main(String[] args) {
    // boolean check = true;
    int count = 0;
    while(count < 9){
      count++;

      /*if(count % 2 == 0)
        continue;   // Salta el valor 6 y continua con la siguiente iteración
        */
      if(count == 6)
        break;  // Rompe el flujo de ejecución saliendo del bucle

      System.out.println(count + " Hola Mundo");
    }
  }
}
