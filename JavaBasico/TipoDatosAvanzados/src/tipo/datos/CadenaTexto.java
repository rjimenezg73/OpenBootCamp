package tipo.datos;

public class CadenaTexto {
  public static void main(String[] args) {
    String cadena = "Mensaje DE TEXTo";

    // Las cadenas de texto o String tiene tanto propiedades como métodos
    // Ejemplo de método
    int cadenaLen = cadena.length();
    System.out.println(cadena);
    System.out.println("La longitud de mi cadena es de: " + cadenaLen);

    String cadenaMinus = cadena.toLowerCase();
    System.out.println("Conversión de la cadena de texto a minúsculas: " + cadenaMinus);

    String cadenaMays = cadena.toUpperCase();
    System.out.println("Conversión de la cadena de texto a mayúsculas: " + cadenaMays);

    // Determinar si una cadena de texto empieza por una palabra
    boolean resultado = cadena.startsWith("Mens");
    System.out.println("Averiguar si una cadena de texto empieza con el texto 'mens': " + resultado);

    char letra = cadena.charAt(5);
    System.out.println(letra);

    

  }
}
