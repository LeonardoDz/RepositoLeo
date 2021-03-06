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
					int x = (int)(Math.random() * 600) + 1;
					int y = (int) (Math.random() * 530) + 80;
                                        Color color=colors[(int)(Math.random()*colors.length)];
					Circulo q = new Circulo(x,y,dx,dy,color); 
                                        
					panelGrafico.addCirculo(q);
                                        
                                    }      repaint();
                                }
                                
                                });
                        
                                JButton crearImagen2 = new JButton("Agregar triangulo");
                                         crearImagen2.setBounds(480,0,180,30);
                                         crearImagen2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int x = (int)(Math.random() * 600) + 1;
                                        int x2=x+10;
                                        int x3=x2+10;
					int y = (int) (Math.random() * 530) + 120;
					int y2=y-40;
                                        int y3=y2+40;
                                        Color color=colors[(int)(Math.random()*colors.length)];
					Triangulo q = new Triangulo(x,x2,x3,y,y2,y3,color); 
					panelGrafico.addTriangulo(q);
                                }
                                         
                                                 
                               });
                                  JButton crearImagen3 = new JButton("Agregar Rectangulo");
                                         crearImagen3.setBounds(240,0,180,30);
                                         crearImagen3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					int x = (int) (Math.random() * 600) + 1;
                                        int x2=(int) (Math.random() * 550) + 80;
                                        int x3=50;
					int x4 =25;
                                        Color color=colors[(int)(Math.random()*colors.length)];
					Rectangulo q = new Rectangulo(x,x2,x3,x4,color); 
					panelGrafico.addRectangulo(q);
                                }
                                         
                                                 
                               });       
                                         JButton borrarimagen1 = new JButton("Borrar ultimo circulo");
                                         borrarimagen1.setBounds(10,40,180,30);
                                         borrarimagen1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
                                   panelGrafico.deletecirculo();
                                
                                   repaint();
                                }
                                         
                                                 
                               }); 
                                                   JButton borrarimagen2 = new JButton("Borrar ultimo Triangulo");
                                         borrarimagen2.setBounds(480,40,180,30);
                                         borrarimagen2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					panelGrafico.deletetriangulo();
                                        repaint();
                                }
                                         
                                                 
                               }); 
                                         JButton borrarimagen3 = new JButton("Borrar ultimo rectangulo");
                                         borrarimagen3.setBounds(240,40,180,30);
                                         borrarimagen3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					panelGrafico.deleteRectangulo();
                                        repaint();
                                }
                                         });  
                                            JButton borrarultima = new JButton("Borrar ultima figura");
                                         borrarultima.setBounds(240,60,180,30);
                                         borrarultima.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					panelGrafico.deleteultimo();
                                        repaint();
                                }
                                         
                                                 
                                    
                               }); 
                        add(borrarimagen1);  
                        add(borrarimagen2);
                        add(borrarimagen3);
                        add(borrarultima);
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
