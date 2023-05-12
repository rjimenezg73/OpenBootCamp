package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayMain {
  public static void main(String[] args) {
    int[] notas = {8, 10, 5, 9, 8, 7, 5, 6};

    for(int i = 0; i < notas.length; i++){
      System.out.println(notas[i]);
    }

    System.out.println("-------------");

    for (int item:notas) {
      System.out.println(item);
    }

  }
}
