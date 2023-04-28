package com.company;

public class Tipos {
  public static void main(String[] args){
    // Tipo de identificador = valor
    // = aquí se usa como asignación, es decir, asigna un valor a un identificador de X tipo

    // Otra forma es declarar el tipo y luego inicializar
    // Tipo de indetificador;
    // Identificador = Valor;

    // Tipos primitivos - No pueden asignarse el valor null
    // Ej.
    // int x = null;  no es correcto

    // Enteros
    byte number1 = 1;     // 1 byte
    short number2 = 2;    // 2 bytes
    int number3 = 3;      // 4 bytes
    long number4 = 4;     // 8 bytes

    // Punto Flotante
    float decimal1 = 4.9f;
    double decimal2 = 9.99d;

    // Caracter
    char caracter1 = 'a';

    // Booleanos
    boolean verdadero = true;
    boolean falso = false;

    // Tipos envoltorios. Son tipos de clase que contienen a los primitivos
    // Empiezan con letra mayúscula

    // Cadenas de texto
    String nombre = "Juan Pérez";

    // Enteros
    Integer numero = null;  // Acá si se permite la asignación de un valor nulo ya que no es tipo de dato primitivo
    Long numero2 = 2L;
    

  }
}
