/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo02;

import java.awt.Color;
import java.awt.Graphics;


import java.awt.Graphics;

public class Triangulo {
 
 int alto=0;
 int base=0;
 int x=0;
 int y=0;
 private Color color;
 public Triangulo(int x, int y, int a,int b,Color color){
  alto=a;
  base=b;
  this.color=color;
 }
 
 public void pintar(Graphics g){
     g.setColor(color);
  if(base!=0 && alto!=0){
   g.drawLine(x, y, x+(base/2), y+alto);
   g.drawLine(x+(base/2), y+alto, x-(base/2), y+alto);
   g.drawLine(x,y,x-(base/2), y+alto);
  }
 }

 public int getAlto() {
  return alto;
 }

 public void setAlto(int alto) {
  this.alto = alto;
 }

 public int getBase() {
  return base;
 }

 public void setBase(int base) {
  this.base = base;
 }

 public int getX() {
  return x;
 }

 public void setX(int x) {
  this.x = x;
 }

 public int getY() {
  return y;
 }

 public void setY(int y) {
  this.y = y;
 }

    void Dibujar(Graphics g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

