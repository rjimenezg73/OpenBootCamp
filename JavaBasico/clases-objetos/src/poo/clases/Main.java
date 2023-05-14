package poo.clases;

public class Main {

  public static void main(String[] args) {
    // Para crear un objeto
    // Clase identificador = new MetodoConstructor();

    // Crear un objeto utilizando el constructor vacío
    Vehiculo toyotaPrius = new Vehiculo();

    // Crear un objeto utilizando el constructor con parámetros
    Motor motorGTI = new Motor("GTI", 190, 459.0, 6);
    Vehiculo fordMondeo = new Vehiculo("Ford", "Mondeo", 2.1, 2010, false, 0, motorGTI);
    System.out.println(fordMondeo.facricante);
    System.out.println(fordMondeo.modelo);
    System.out.println(fordMondeo.speed);
    fordMondeo.acelerar(60);
    System.out.println("Velocidad despues de acelerar: " + fordMondeo.speed);


  }

}
