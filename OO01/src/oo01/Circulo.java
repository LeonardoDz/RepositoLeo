/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo01;

/**
 *
 * @author Diego
 */
public class Circulo {   
    private int cantLados;
    private float pi;
    private char letra;
    private boolean recto;
    private int radios[]; //extiendo Circulo a Ovalo
    private int X;
    private float Circurferencia;
    //metodo constructor
    public Circulo(){
    cantLados = 0;
    pi = 3.14f;
    recto = false;
    radios = new int[2]; //tamaño del arreglo es 3 elementos
    radios[0] =5;
    radios[1] = 5;
    }
  public int  getX( ){
    return this.X;
  }
  public int  getcantLados( ){
    return this.cantLados;
  }
  public float  getpi( ){
    return this.pi;
  }
  public char  getletra( ){
    return this.letra;
  }
  public boolean  getrecto( ){
    return this.recto;
  }
  public int  getradios( ){
    return this.radios[0];
    
  }
  public int  getradios2( ){
    return this.radios[1];
  }
  public float  getCircurferencia( ){
    return (int) Math.pow(this.radios[0], 2)*(this.pi);
  }
  public void setradios(int radios[]){
      this.radios=radios;
  }
}

