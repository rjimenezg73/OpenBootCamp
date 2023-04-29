package com.company;

public class IfElse {
  public static void main(String[] args) {
    // boolean check = 5 < 10;
    int number1 = 5;
    int number2 = 10;

    if(number1 < number2 && number2 % number1 == 0/*check*/){
      System.out.println("Verdadero");
    }else{
      System.out.println("Falso");
    }
  }
}
