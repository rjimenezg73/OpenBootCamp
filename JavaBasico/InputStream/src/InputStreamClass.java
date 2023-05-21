import java.io.*;

public class InputStreamClass {
  public static void main(String[] args) {
    String rutaFichero = "C:\\DesarrolloWeb\\OpenBootCamp\\JavaBasico\\documentacion\\src\\com\\company\\Coche.java\\";

    try{
      InputStream fichero = new FileInputStream(rutaFichero);
      BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
      System.out.println("OK");
      // Lo leyó perfectamente, pero para ver su contenido se necesita invocar uno de sus métodos
      try{
        int dato = ficheroBuffer.read();
        while(dato != -1){  // -1 = EOF
          System.out.print((char)dato);
          dato = ficheroBuffer.read();
        }
      }catch(IOException e){
        System.out.println("No puedo leer el fichero: " + e.getMessage());
      }
    }catch(FileNotFoundException e){
      System.out.println("Oye, que el programa da error..." + e.getMessage());
    }





  }
}
