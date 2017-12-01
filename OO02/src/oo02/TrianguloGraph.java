/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo02;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;


public class TrianguloGraph extends JPanel {
	private List<Triangulo> Triangulo;
	
	public TrianguloGraph(){
		Triangulo = new ArrayList<Triangulo>();
	}
	
	public void addTriangulo(Triangulo c){
		Triangulo.add(c);
		repaint();
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponents(g);
		for(Triangulo q: Triangulo){
			q.Dibujar(g);
		}
	}
	

}