package com.temas;

public class SmartDevice {
  String marca;
  String modelo;
  double precio;
  Boolean usb;
  Boolean wifi;

  public SmartDevice(){

  }

  public SmartDevice(String marca, String modelo, double precio, Boolean usb, Boolean wifi){
    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
    this.usb = usb;
    this.wifi = wifi;
  }

  public String getMarca(){
    return  this.marca;
  }

  public double getPrecio(){
    return this.precio;
  }

  @Override
  public String toString() {
    return "SmartDevice{" +
            "marca='" + marca + '\'' +
            ", modelo='" + modelo + '\'' +
            ", precio=" + precio +
            ", usb=" + usb +
            ", wifi=" + wifi +
            '}';
  }
}
