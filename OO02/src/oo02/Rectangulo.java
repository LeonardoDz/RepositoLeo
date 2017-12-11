/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo02;

import java.awt.Color;
import java.awt.Graphics;


public class Rectangulo {
 private int x;
 private int x2;
 private int x3;
 private int x4;
 private Color color;

public Rectangulo (int x,int x2,int x3 ,int x4,Color color){
  this.x2=x2;
  this.x3=x3;
  this.x=x;
  this.x4=x4;
  
  this.color=color;
 }
public void Dibujar(Graphics g){
    g.setColor(color);
    g.fillRect(x, x2, x3, x4);
}
}