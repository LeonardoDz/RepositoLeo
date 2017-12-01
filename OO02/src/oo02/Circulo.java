package oo02;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo {

	private int x;
	private int y;
	private int dx;
	private int dy;
	private Color color;
     

	public Circulo(int x,int y,int dx,int dy,Color color){
		this.x = x;
		this.y = y;
		this.dx = dx;
		this.dy = dy;
                this.color=color;   
                
            
	}
	public void Dibujar(Graphics g){
		g.setColor(color);
		g.fillOval(x, y, dx, dy);
	}
	
}
