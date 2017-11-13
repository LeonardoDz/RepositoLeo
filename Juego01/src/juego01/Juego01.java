/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego01;
import java.awt.*;
import java.util.ArrayList;
import ventanas.*;
/**
 *
 * @author Diego
 */
public class Juego01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Ventana juego = new Ventana("Juego 01",Color.BLACK);
        ArrayList ArrgloDeObjetos = new ArrayList();
        Posicion pos = new Posicion(250,250);
        //no estoy usando la clase posicion para hacerlo mas rapido 
        ArrayList Colorsito=new ArrayList(8);
        Colorsito.add(Color.red);
        Colorsito.add(Color.blue);
        Colorsito.add(Color.yellow);
        Colorsito.add(Color.white);
        Colorsito.add(Color.green);
        Colorsito.add(Color.orange);
        Colorsito.add(Color.gray);
        Colorsito.add(Color.pink);
        GraphNave[] nave = new GraphNave[20];
     
        
        for(int z=0;z < nave.length;z++){
            int aleatorio = (int)(Math.random()*650);
            int ramdom = (int)(Math.random()*50);
            int y = (int)(Math.random()*Colorsito.size());
            nave[z]= new GraphNave((float)aleatorio,(float)ramdom,(float)aleatorio,(float)aleatorio, (Color) Colorsito.get(y));
        }
        ArrgloDeObjetos.add(nave[0]);
        ArrgloDeObjetos.add(nave[1]);
        ArrgloDeObjetos.add(nave[2]);
        ArrgloDeObjetos.add(nave[4]);
        ArrgloDeObjetos.add(nave[5]);
        ArrgloDeObjetos.add(nave[6]);
        ArrgloDeObjetos.add(nave[7]);
        ArrgloDeObjetos.add(nave[8]);
        ArrgloDeObjetos.add(nave[9]);
        ArrgloDeObjetos.add(nave[10]);
        ArrgloDeObjetos.add(nave[11]);
        ArrgloDeObjetos.add(nave[12]);
        ArrgloDeObjetos.add(nave[13]);
        ArrgloDeObjetos.add(nave[14]);
        ArrgloDeObjetos.add(nave[15]);
        ArrgloDeObjetos.add(nave[16]);
        ArrgloDeObjetos.add(nave[17]);
        ArrgloDeObjetos.add(nave[18]);
        ArrgloDeObjetos.add(nave[19]);
        Figuras figurasJuego = new Figuras(ArrgloDeObjetos);
       GraphBala bala = new GraphBala(pos,10,Color.red);
        ArrgloDeObjetos.add(bala);
      TanqueControlado tanque=new TanqueControlado ((float)350,(float)362,(float)380,(float)300,Color.red) ;
      ArrgloDeObjetos.add(tanque);
      juego.add(figurasJuego);
       juego.setSize(700,400);
       juego.setVisible(true);
        
    }
    
}
