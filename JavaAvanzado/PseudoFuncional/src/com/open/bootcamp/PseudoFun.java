/**
 * Java no puede ser un lenguaje funcional ya que está basado en POO. Lo que si puede hacer es imitar
 * como funcionaría la programación funcional y el mayor ejemplo para ello es por medio de las
 * funciones puras.
 * Las funciones puras son todas aquellas que dado unos parámetros de entrada den un mismo resultado de salida.
 * Además de retornar el mismo resultado debe de cumplir otra serie de requisitos como no puede
 * generar daños o cambios colaterales. Todo aquel cambio que se realiza cuando se invoca a una función
 *
 */
package com.open.bootcamp;


public class PseudoFun {

   private static int contador = 0;

   public static void main(String[] args) {
      int resul = suma(1, 2);
      System.out.println(resul);
      System.out.println("Contador: " + contador);
      resul = sumaImpura(5,6);
      System.out.println(resul);
      System.out.println("Contador: " + contador);
      resul = sumaImpura(5,6);
      System.out.println(resul);
      System.out.println("Contador: " + contador);

   }

   public static int suma(int a, int b){
      return a + b;
   }

   public static int sumaImpura(int a, int b){
      contador++; // Con éste cambio la función deja de ser pura y es impura ya que causa efectos colaterales
      return a + b;
   }
}
