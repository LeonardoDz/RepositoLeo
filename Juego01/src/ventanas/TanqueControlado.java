package ventanas;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Diego
 */
public class TanqueControlado extends Tanque implements Dibujo{
    Color color;
    
    public TanqueControlado(float posx, float posy, float tamx, float tamy, Color naveColor){
        super(posx,posy,tamx,tamy);
        this.color = naveColor;
        ImageIcon Img = new ImageIcon(getClass().getResource("\\Bibliotecas\\Imágenes\\1.png"));
    }
    
    @Override
    public void Dibujar(Graphics g) {
        g.setColor(this.color);
        g.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);
    }
    
    
}
