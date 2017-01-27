/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.t01.p3;
import java.util.Scanner;
/**
 *
 * @author normaledezma
 */
public class SPP2NLedezmaMT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //NORMA ALEJANDRA LEDEZMA MARTINEZ (IIS)
        //A01411460
        System.out.println("Calculadora de distancia entre dos puntos");
        //variables
        double x1, y1, x2, y2;//coordenadas
        double d; //distancia
        
        //Objeto para recibir datos
        Scanner tecl = new Scanner (System.in);
        
        //Asignar valores
        System.out.println("Punto 1");
        System.out.println("Introducir coordenada en X1:");
        x1 = tecl.nextDouble();
        System.out.println("Introducir coordenada en Y1:");
        y1 = tecl.nextDouble();
        System.out.println("Punto 2");
        System.out.println("Introducir coordenada en X2:");
        x2 = tecl.nextDouble();
        System.out.println("Introducir coordenada en Y2:");
        y2 = tecl.nextDouble();
        
        //Operaciones
       d= Math.sqrt((Math.pow((x1-x2),2))+ Math.pow((y1-y2),2));
       
       //Resultado
        System.out.println("La distancia entre el punto 1 y el punto 2 es:" + d);
    }
    
}
