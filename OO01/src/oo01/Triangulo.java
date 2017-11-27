/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo01;

/**
 *
 * @author Win7
 */
public class Triangulo {
    int CLados;
    int LadosMedidas[];
    float Perimetro;
    float Altura;
    float CalculoAltura;
    float CalculoAlturaBaseB;
    float CalculoAlturaBaseA;
    float CalculoAlturaB;
    float CalculoAlturaC;
    public Triangulo(){
    CLados = 3;
    LadosMedidas = new int[3];
    LadosMedidas[0] = 14;
    LadosMedidas[1] = 14;
    LadosMedidas[2] = 14;
    CalculoAltura=(int) Math.pow(LadosMedidas[0], 2);
    CalculoAlturaBaseA=LadosMedidas[1] /2;
    CalculoAlturaBaseB=(int) Math.pow(CalculoAlturaBaseA, 2);
    CalculoAlturaB=CalculoAltura - CalculoAlturaBaseB;
    CalculoAlturaC=(float) Math.sqrt(CalculoAlturaB);
Perimetro=LadosMedidas[1]*3;
    }
    
   
    
       
       
}