package ventanas;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Diego
 */
public class TanqueControlado extends Tanque implements Dibujo{
    Color color;
    
    public TanqueControlado(float posx, float posy, float tamx, float tamy, Color naveColor){
        super(posx,posy,tamx,tamy);
        this.color = naveColor;
    }
    
    @Override
    public void Dibujar(Graphics g) {
        g.setColor(this.color);
        g.fillRect((int)this.getX(), (int)this.getY(), (int)this.getAncho(), (int)this.getAlto());
    }
    
    
}
