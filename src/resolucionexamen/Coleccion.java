/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resolucionexamen;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class Coleccion { //nutribela
    Vector<Integer> arreglo = new Vector<>();
    
    public Coleccion(Vector arreglo){
        this.arreglo = arreglo;
    }

    public Vector getArreglo() {
        return arreglo;
    }

    public void setVector(Vector arreglo) {
        this.arreglo = arreglo;
    }
    
             
    public void imprimirColeccion(Vector arreglo){
        System.out.print( "{" );
        for (Object v: arreglo) {
            System.out.print( v+" , " );
        }
        System.out.println( "}\n" );
    }//fin metodo imprimirColeccion
    
   
}//fin clase coleccion 
