/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //sc para ingresar datos
        final int tamano = 10; //definir tamaño del vector
        int vecot1[] = new int[tamano]; //declara vector
        ingresarDatos(vecot1); //llama al metodo ingresar datos
        imprimirDatos(vecot1); //llama al metodo imprimir datos
        operaciones(vecot1); //llama al metodo operaciones  
    }
    public static void ingresarDatos(int v[]){ //metodo para ingresar datos
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.print( "Ingrese el numero en la posicion " +(i+1)+ ": " );
            v[i] = sc.nextInt();
        }//fin del for
    }//fin medodo ingresar datos
    public static void imprimirDatos(int v[]){ //metodo para imprimir datos
            for (int i = 0; i < v.length; i++) {
                System.out.println( "vector[" +i+ "]= " +v[i] );   
            }
            System.out.println( );
    }//fin metodo imprimir datos
    public static void operaciones(int v[]){ //metodo diferentes operaciones con el vector
        int suma = 0;
        float promedio;
        int menores = 0;
        for (int i = 0; i < v.length ; i++) {
            suma+= v[i];
        }//fin for
        promedio = suma/10;
        System.out.println( "La suma de los elementos del vector es: " +suma );
        System.out.println( "El promedio del vector es: " +promedio ); 
        for (int i = 0; i < v.length ; i++) {
            if (v[i] < promedio) {
                menores++;
            }//fin if
        }//fin for
        System.out.println( "Exite " +menores+ " numeros menores que el promedio de: " +promedio );
    }//fin metodo operaciones
    
}
