package com.company;
// Entrada y salida de datos (IO)


import java.util.Scanner;

public class ScannerMain {
  public static void main(String[] args) {
    // Para la introducción de datos nos valemos del método Scanner
    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor introduce un nombre: ");
    String nombre = scanner.nextLine();

    System.out.println("El nombre introducido es: " + nombre);

    System.out.println("Introduce un número: ");
    int numero = scanner.nextInt();
    System.out.println("El número introducido es: " + numero);

  }
}
