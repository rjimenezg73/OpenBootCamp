package com.company;

public class StringMain {
  public static void main(String[] args) {
    // Métodos de la clase String
    /*
        length()
        startsWith()
        endsWith()
        indexOf()
        subString(1,5)
        trim()
        equals()
        compareTo()
     */

    String mensaje = "Hola Mundo";
    System.out.println("La longitud de \'" + mensaje + "\' es de: " + mensaje.length());

    String mensajeMays = mensaje.toUpperCase();
    System.out.println(mensajeMays);

    if(mensajeMays.equals(mensaje)){
      System.out.println("Los textos son iguales");
    }else{
      System.out.println("Los textos no son iguales");
    }




  }
}
