package com.temas;

public class SmartPhone extends SmartDevice{
  int cargaBateria;
  int almacenamiento;

  public SmartPhone(String marca, String modelo, double precio, Boolean usb, Boolean wifi, int cargaBateria, int almacenamiento){
    super(marca, modelo, precio, usb, wifi);
    this.cargaBateria = cargaBateria;
    this.almacenamiento = almacenamiento;
  }

  public int getCargaBateria(){
    return cargaBateria;
  }

  @Override
  public String toString() {
    return "SmartPhone{" +
            "cargaBateria=" + cargaBateria +
            ", almacenamiento=" + almacenamiento +
            ", marca='" + marca + '\'' +
            ", modelo='" + modelo + '\'' +
            ", precio=" + precio +
            ", usb=" + usb +
            ", wifi=" + wifi +
            '}';
  }
}
