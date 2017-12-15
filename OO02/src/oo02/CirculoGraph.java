package oo02;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


public class CirculoGraph extends JPanel {
	private List<Circulo> circulos;
	private List<Triangulo> Triangulo;
        private List<Rectangulo> Rectangulo;
        
	public CirculoGraph(){
		circulos = new ArrayList<Circulo>();
                Triangulo = new ArrayList<Triangulo>();
                Rectangulo= new ArrayList<Rectangulo>();
	}
	
	public void addCirculo(Circulo c){
		circulos.add(c);
		repaint();
               
		
	}
	public void addTriangulo(Triangulo g){
            Triangulo.add(g);
		repaint();
        }
        public void addRectangulo(Rectangulo z){
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
            circulos .remove(circulos.size() - 1);
            
        }
 public void deletetriangulo(){
            Triangulo .remove(Triangulo.size() - 1);
            
        }
 public void deleteRectangulo(){
            Rectangulo .remove(Rectangulo.size() - 1);
            
        }

}
