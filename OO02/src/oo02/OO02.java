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
	private static TrianguloGraph panelGrafico2;
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
                  setLayout(null);
                  crearImagen.setBounds(10,10,10,30);
                  
		  
            
			crearImagen.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
                                    if (e.getSource()==crearImagen) {
					int dx = 50;
					int dy = 50;
					int x = (int)(panelGrafico.getWidth() * Math.random());
					int y = (int)(panelGrafico.getWidth() * Math.random());
                                        Color color=colors[(int)(Math.random()*colors.length)];
					Circulo q = new Circulo(x,y,dx,dy,color); 
					panelGrafico.addCuadrado(q);}
                                }
                                
                                });
				panelGrafico2= new TrianguloGraph();
                                JButton crearImagen2 = new JButton("Agregar triangulo");
                                         crearImagen2.setBounds(100,150,100,30);
                                         crearImagen2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int dx = 50;
					int dy = 50;
					int x = (int)(panelGrafico.getWidth() * Math.random());
					int y = (int)(panelGrafico.getWidth() * Math.random());
                                        Color color=colors[(int)(Math.random()*colors.length)];
					Triangulo q = new Triangulo(x,y,dx,dy,color); 
					panelGrafico2.addTriangulo(q);
                                }
                                         
                                                 
                               });
		  
	 
			add(panelGrafico);
			add(crearImagen,BorderLayout.NORTH);
	}
	
	
	  public static void main(String[] args) {
		  JFrame ventana = new OO02();
		  ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  ventana.setSize(700,700);
		  ventana.setVisible(true);
}
}
