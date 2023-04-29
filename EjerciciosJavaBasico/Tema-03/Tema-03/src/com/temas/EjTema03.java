package com.temas;

public class EjTema03 {
  public static void main(String[] args) {
    String[] palabras = {"Pedro", "Páramo","es", "mi", "libro", "favorito"};
    String cadenaTexto;
    cadenaTexto = Concatenar(palabras);
    System.out.println(cadenaTexto);
  }

  private static String Concatenar(String[] texto) {
    String aux = "";
    for(int i = 0; i < texto.length; i++ ){
      aux = aux + texto[i] + " ";
    }
    return aux;
  }
}
