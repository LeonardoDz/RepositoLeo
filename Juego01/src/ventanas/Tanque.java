/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author 17
 */
public class Tanque extends Posicion{
    private float ancho;
    private float alto;
    
    public Tanque(){
        super(); // entra en el contructor sin parametros
        this.ancho = 15;
        this.alto = 30;
    }
    
    public Tanque(float posx, float posy,float x,float y){
        super(posx,posy); // entra en el contructor sin parametros
        this.ancho = 15;
        this.alto = 30;
    }
    
    public float getAncho(){
        return this.ancho;
    }
    public float getAlto(){
        return this.alto;
    }
    public void setAncho(float ancho){
        this.ancho = ancho;
    }
    public void setAlto(float alto){
        this.alto = alto;
    }
    
}
