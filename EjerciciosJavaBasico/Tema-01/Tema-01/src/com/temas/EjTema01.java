package com.temas;

public class EjTema01 {
  public static void main(String[] args) {

    // Enteros
    byte number1 = 1;     // 1 byte
    short number2 = 2;    // 2 bytes
    int number3 = 3;      // 4 bytes
    long number4 = 4;     // 8 bytes
    System.out.println("*****  Enteros  *****");
    System.out.println("Tipo byte: " + number1);
    System.out.println("Tipo short: " + number2);
    System.out.println("Tipo int: " + number3);
    System.out.println("Tipo long: " + number4);
    System.out.println();


    // Punto Flotante
    float decimal1 = 4.9f;
    double decimal2 = 9.99d;
    System.out.println("*****  Punto Flotante  *****");
    System.out.println("Tipo float: " + decimal1);
    System.out.println("Tipo double: " + decimal2);
    System.out.println();


    // Caracter
    char caracter1 = 'a';
    System.out.println("*****  Caracter  *****");
    System.out.println("Tipo char: " + caracter1);
    System.out.println();

    // Booleanos
    boolean verdadero = true;
    boolean falso = false;
    System.out.println("*****  Booleanos  *****");
    System.out.println("Tipo boolean(T): " + verdadero);
    System.out.println("Tipo boolean(F): " + falso);
    System.out.println();

    // Tipos envoltorios. Son tipos de clase que contienen a los primitivos
    // Empiezan con letra mayúscula
    System.out.println("TIPOS ENVOLTORIOS");

    // Cadenas de texto
    String nombre = "Juan Pérez";
    System.out.println("*****  Cadena de Texto  *****");
    System.out.println("Tipo Stringt: " + nombre);
    System.out.println();

    // Enteros
    Integer numero = null;  // Acá si se permite la asignación de un valor nulo ya que no es tipo de dato primitivo
    Long numero2 = 2L;
    System.out.println("*****  Enteros  *****");
    System.out.println("Tipo Integer: " + numero);
    System.out.println("Tipo Long: " + numero2);
    System.out.println();

  }
}
