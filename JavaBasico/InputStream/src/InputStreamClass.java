import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamClass {
  public static void main(String[] args) {
    String rutaFichero = "C:\\DesarrolloWeb\\OpenBootCamp\\JavaBasico\\documentacion\\src\\com\\company\\Coche.java\\";

    try{
      InputStream fichero = new FileInputStream(rutaFichero);
      System.out.println("OK");
      // Lo leyó perfectamente, pero para ver su contenido se necesita invocar uno de sus métodos
      try{
        byte []datos = fichero.readAllBytes();
        for (byte dat: datos) {
          System.out.print((char)dat);
        }
      }catch(IOException e){
        System.out.println("No puedo leer el fichero: " + e.getMessage());
      }
    }catch(FileNotFoundException e){
      System.out.println("Oye, que el programa da error..." + e.getMessage());
    }





  }
}
