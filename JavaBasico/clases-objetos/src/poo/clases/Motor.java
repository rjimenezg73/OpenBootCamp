package poo.clases;

public class Motor {
  String modelo;
  int caballos;
  double parNm;  // Newtons - metros
  int numCilindros;

  public Motor(){

  }

  public Motor(String modelo, int caballos, double parNm, int numCilindros) {
    this.modelo = modelo;
    this.caballos = caballos;
    this.parNm = parNm;
    this.numCilindros = numCilindros;
  }
}
