package com.temas;

public class EjTema02 {
  public static void main(String[] args) {
    CalculaTotal(200.00);
  }

  private static void CalculaTotal(double precio) {
    double iva = 0.10; // Aplica para México

    System.out.println("El precio del artículo es: $ " + precio);
    System.out.println("IVA a pagar: $ " + (precio * iva) );
    System.out.println("Total a pagar: $ " + (precio + precio * iva));

  }
}
