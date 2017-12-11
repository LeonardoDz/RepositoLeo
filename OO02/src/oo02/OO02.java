package oo02;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class OO02 extends JFrame {
	private static CirculoGraph panelGrafico;
	//Modificar la clase Circulo de forma que ademas de la posicion, el color sea distinto en casa instancia.
	//Agregar 2 botones mas que agreguen tanto rectanculos como triangulos.
	//validar que no se dibuje nada fuera de la pantalla.
	//Agregar un boton que elimine el ultimo objeto insertado.
	//Agregar 3 botones que elimines segun corresponda el ultimo objeto insertado.
	
	public OO02(){
            Color[] colors =new Color [3];
                colors[0]=Color.ORANGE;
                colors[1]=Color.red;
                colors[2]=Color.blue;
               
		panelGrafico = new CirculoGraph();
		  JButton crearImagen = new JButton("Agregar Circulo");    
                  crearImagen.setBounds(10,0,180,30);
			crearImagen.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
                                    if (e.getSource()==crearImagen) {
					int dx = 50;
					int dy = 50;
					int x = (int)(panelGrafico.getWidth() * Math.random());
					int y = (int)(panelGrafico.getWidth() * Math.random());
                                        Color color=colors[(int)(Math.random()*colors.length)];
					Circulo q = new Circulo(x,y,dx,dy,color); 
					panelGrafico.addCirculo(q);
                                   
                                    }      
                                }
                                
                                });
                        
                                JButton crearImagen2 = new JButton("Agregar triangulo");
                                         crearImagen2.setBounds(480,0,180,30);
                                         crearImagen2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int x = (int)(panelGrafico.getWidth() * Math.random());
                                        int x2=x+10;
                                        int x3=x2+10;
					int y = (int)(panelGrafico.getWidth() * Math.random());
					int y2=y-80;
                                        int y3=y2+80;
                                        Color color=colors[(int)(Math.random()*colors.length)];
					Triangulo u = new Triangulo(x,x2,x3,y,y2,y3,color); 
					panelGrafico.addTriangulo(u);
                                }
                                         
                                                 
                               });
                                  JButton crearImagen3 = new JButton("Agregar triangulo");
                                         crearImagen3.setBounds(240,0,180,30);
                                         crearImagen3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int x = (int)(panelGrafico.getWidth() * Math.random());
                                        int x2=x+10;
                                        int x3=x2+10;
					int y = (int)(panelGrafico.getWidth() * Math.random());
					int y2=y-80;
                                        int y3=y2+80;
                                        Color color=colors[(int)(Math.random()*colors.length)];
					Triangulo u = new Triangulo(x,x2,x3,y,y2,y3,color); 
					panelGrafico.addTriangulo(u);
                                }
                                         
                                                 
                               });       
		        add(crearImagen);
	                add(crearImagen2);
                        add(crearImagen3);
			add(panelGrafico);
			
	}
	
	
	  public static void main(String[] args) {
		  JFrame ventana = new OO02();
		  ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  ventana.setSize(700,700);
		  ventana.setVisible(true);
}
}
