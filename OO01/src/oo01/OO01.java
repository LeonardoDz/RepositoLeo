/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo01;

/**
 *
 * @author Diego
 */
public class OO01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args  ) {
        Circulo circulo = new Circulo();
        Circulo circulo2=new Circulo();
        circulo2.setradios(10);
        System.out.print("CIRCULO cantidad de Lados: " + circulo.getcantLados() + "\n");
        System.out.print("CIRCULO circurfencia:"+circulo.getCircurferencia()+"\n");
        System.out.print("CIRCULO circurfencia:"+circulo2.getCircurferencia()+"\n");
        //Imprimir el resto de las propiedades del objeto Circulo.
        
        //Crear una clase Cuadrado, con 6 propiedades
        //Instanciar la clas
        //Imprimir sus propiedades
   
        Cuadrado Cuadrado= new Cuadrado();
        System.out.print("CUADRADO Perimetro:"+Cuadrado.Perimetro+ "\n");
        System.out.print("CUADRADO Cantidad de lados:"+Cuadrado.Lados+"\n");
        //Crear una clase Triangulo, con 6 propiedades
        //Instancia la clase. 
        //La clase triangulo, debe poder construirse pasandole los 6 paramentros. O sea, el contructor de la clase debe poder recibir 6 paramentro.
        Triangulo Triangulo = new Triangulo();
        System.out.print("TRIANGULO Altura:"+Triangulo.CalculoAlturaC+"\n");
        System.out.print("TRIANGULO Perimetro:"+Triangulo.Perimetro+"\n");
        System.out.print("TRIANGULO Catidad de Lados:"+Triangulo.CLados+"\n");
        //Crear los setter y getter en Circulo. (comentar donde se imprimen las propiedades directamente).
        //Crear otra instancia de circulo.
        //Crear un metodo Circunferencia en Circulo, que retorne la Circunferencia del Objeto circulo (dos veces el radio (r) por π).
        //setiar el radio de los circulos en 10 y 20 (Ambos radios en cada circulo).
        }
    }
    

