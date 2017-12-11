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
 
 private int x;
 private int y;
 private int y2;
 private int y3;
 private int x2;
 private int x3;
 private Color color;
 
 public Triangulo(int x,int x2,int x3 ,int y,int y2,int y3,Color color){
  this.x2=x2;
  this.x3=x3;
  this.x=x;
  this.y=y;
  this.y2=y2;
  this.y3=y3;
  this.color=color;
 }
 
 public void Dibujar(Graphics g){
    g.setColor(color);
    int[] x = new int[]{this.x,this.x2,this.x3};
    int[] y = new int[]{this.y, this.y2, this.y3};
    g.fillPolygon (x, y, x.length);    
  }
}

 
    

