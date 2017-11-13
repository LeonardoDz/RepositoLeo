/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Diego
 */
public class GraphBala extends Bala implements Dibujo{
    
    Color color;
    
    public GraphBala(Posicion pos, float radio, Color Balacolor){
        super(pos, radio);
    this.color = Balacolor;
    }
    
    
    @Override
    public void Dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillOval((int)this.getX(), (int)this.getY(), (int)this.getRadio(), (int)this.getRadio());
    }
    
}
