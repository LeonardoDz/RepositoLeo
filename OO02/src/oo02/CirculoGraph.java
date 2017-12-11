package oo02;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;


public class CirculoGraph extends JPanel {
	private List<Circulo> circulos;
	private List<Triangulo> Triangulo;
	public CirculoGraph(){
		circulos = new ArrayList<Circulo>();
                Triangulo = new ArrayList<Triangulo>();
	}
	
	public void addCirculo(Circulo c){
		circulos.add(c);
		repaint();
               
		
	}
	public void addTriangulo(Triangulo g){
            Triangulo.add(g);
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
        }

}
