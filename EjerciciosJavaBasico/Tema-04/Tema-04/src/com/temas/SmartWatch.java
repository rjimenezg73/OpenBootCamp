package com.temas;

public class SmartWatch extends SmartDevice{
  String sistOperativo;
  Boolean resisteAgua;

  public SmartWatch(){

  }

  public SmartWatch(String marca, String modelo, double precio, Boolean usb, Boolean wifi, String sistOperativo, Boolean resisteAgua){
    super(marca, modelo, precio, usb, wifi);
    this.sistOperativo = sistOperativo;
    this.resisteAgua = resisteAgua;
  }

  public String getSistOperativo(){
    return  sistOperativo;
  }

  @Override
  public String toString() {
    return "SmartWatch{" +
            "sistOperativo='" + sistOperativo + '\'' +
            ", resisteAgua=" + resisteAgua +
            ", marca='" + marca + '\'' +
            ", modelo='" + modelo + '\'' +
            ", precio=" + precio +
            ", usb=" + usb +
            ", wifi=" + wifi +
            '}';
  }
}
