package oo02;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


public class CirculoGraph extends JPanel {
	private List<Circulo> circulos;
	private List<Triangulo> Triangulo;
        private List<Rectangulo> Rectangulo;
        //forma 1 = circulo
         //forma 2 = triangulo
        private int forma;
	public CirculoGraph(){
		circulos = new ArrayList<Circulo>();
                Triangulo = new ArrayList<Triangulo>();
                Rectangulo= new ArrayList<Rectangulo>();
	}
	
	public void addCirculo(Circulo c ){
            forma = 1;
		circulos.add(c);
		repaint();}
               
		
	
	public void addTriangulo(Triangulo g){
            forma = 2;
            Triangulo.add(g);
		repaint();
        }
        public void addRectangulo(Rectangulo z){
            forma = 3;
            Rectangulo.add(z);
		repaint();
        }
	protected void paintComponent(Graphics g){
		super.paintComponents(g);
		for(Circulo q: circulos){
			q.Dibujar(g);
		}
		for(Triangulo u: Triangulo){
			u.Dibujar(g);
	}
                for(Rectangulo z: Rectangulo){
			z.Dibujar(g);
	}
        }
        public void deletecirculo(){
            if (circulos.size()> 0){
            circulos .remove(circulos.size() - 1);
            }
        }
     public void deletetriangulo(){
     if (Triangulo.size()> 0){
            Triangulo .remove(Triangulo.size() - 1);
     }
        }
 public void deleteRectangulo(){
            if (Rectangulo.size()> 0){
            Rectangulo .remove(Rectangulo.size() - 1);
            
            }
        }
public void deleteultimo(){
            if (forma == 3){
           Rectangulo .remove(Rectangulo.size() - 1);}
            else if (forma == 2){
                Triangulo .remove(Triangulo.size() - 1);}
            else if (forma == 1 ){
            circulos .remove(circulos.size() - 1);
}
}
}
