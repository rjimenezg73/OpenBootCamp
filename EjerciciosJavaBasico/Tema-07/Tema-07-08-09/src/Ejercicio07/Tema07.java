package Ejercicio07;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;


public class Tema07 {

  public static String reverse(String texto){
    String cad = "";

    for (int i = texto.length()-1; i >= 0; i--){
      cad = cad + texto.charAt(i);
    }
    return cad;
  }

  public static double divideByZero(int a, int b){
    double resultado = 0;
    try{
      resultado = a/b;
      System.out.println(resultado);

    } catch (Exception e){
      System.out.println("Ha ocurrido un errory por tanto no se puede ejecutar !...");
      e.printStackTrace();
    }
    return resultado;
  }


  public static void main(String[] args) {
    String cadena = "hola mundo";
    String cadInv = reverse(cadena);

    System.out.println(cadInv);

    String[] arrayString = {"Texto1","Texto2","Texto3","Texto4","Texto5"};
    for(int i = 0; i < arrayString.length; i++){
      System.out.println(arrayString[i]);
    }

    int[][] arrayBiEnteros = {{1,2,3},{4,5,6},{7,8,9}};
    // Row, Col
    for(int i = 0; i < arrayBiEnteros.length; i++){
      for(int j=0; j<arrayBiEnteros.length; j++){
        System.out.println("i,j = " + i + "," + j + " Valor: " + arrayBiEnteros[i][j]);
      }
    }

    List<String> nombres = new ArrayList<>();

    nombres.add("Juan Pérez");
    nombres.add("Peter Pan");
    nombres.add("Pedrito Pica Cu");
    nombres.add("Piolín Jiménez");
    nombres.add("Juanita Banana");

    nombres.remove(1);
    nombres.remove(2);
    for (String nom:nombres) {
      System.out.println(nom);
    }

    //  el problema de utilizar un Vector
    //  con la capacidad por defecto si tuviésemos 1000 elementos
    //  para ser añadidos al mismo sería: MAS QUE UN PROBLEMA ES UNA VENTAJA YA QUE
    //  AL CRECER DE MANERA DINÁMICA NO OCUPAMOS ESPACIO INESESARIO EN MEMORIA

    // EL PUNTO 5 NO ME ES CLARO

    List<Integer> enteros = new ArrayList<>();

    for(int i = 1; i < 11; i++){
      enteros.add(i);
    }

    // Elimina elementos pares
    for(int i=0; i<enteros.size();i++){
      if(enteros.get(i) % 2 == 0){
        enteros.remove(i);
      }
    }

    for (Integer num:enteros) {
      System.out.println(num);
    }

    int dividendo = 5;
    int divisor = 0;
    double res = divideByZero(dividendo, divisor);

    // 8 y 9 no me quedan claros
  }

}
