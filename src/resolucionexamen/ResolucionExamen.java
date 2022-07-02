/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolucionexamen;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class ResolucionExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Vector<Integer> v1 = new Vector<>(5);
         Vector<Integer> v2 = new Vector<>(5);
         //Vector v1
         Coleccion x = new  Coleccion(v1);
          System.out.println( "Llenar vector V1" );
         llenarVector(v1);
         x.imprimirColeccion(v1);
         System.out.println("-----Verificar si hay elementos repetidos en el vector v1-----");
         verificarRepetidos(v1);
         System.out.println( "-----Vector v1 sin numeros repetidos-----" );
         x.imprimirColeccion(v1);
         //Vector v2
         Coleccion y = new  Coleccion(v2);
         System.out.println( "Llenar vector V2" );
         llenarVector(v2);
         y.imprimirColeccion(v2);
         System.out.println("-----Verificar si hay elementos repetidos en el vector v2-----");
         verificarRepetidos(v2);
         System.out.println( "-----Vector v2 sin numeros repetidos-----" );
         y.imprimirColeccion(v2);
         interseccionConjuntos(v1, v2);
         
    }//fin clase main
    public static void llenarVector(Vector x){ //metodo para llenar vectores tipo objeto
       Scanner sc = new Scanner( System.in );
        Integer numero;
        for (int i = 0; i < x.capacity(); i++) {
            System.out.println( "Ingrese el " +i+ " numero: " );
            numero = sc.nextInt();
            x.add(numero);
        }
    }//fin metodo llenarVector
    public static void verificarRepetidos(Vector x){ //metodo para veficar datos repetidos en un vector
        Scanner sc = new Scanner( System.in );
        Integer nuevoDato;
        for (int i = 0; i < x.size()-1; i++) {
            for (int j = i+1; j < x.size(); j++) {
                if ( x.get(i) == x.get(j) ) { //evaluja si en el vector existe elementos iguales
                    System.out.println( "El numero " +x.get(j)+ " se repite por tanto se borrara" );
                    x.remove(j); //remueve el elemento repetido
                    System.out.println( "Ingrese nuevo valor" );
                    System.out.print( "x[" +j+ "]=" );
                    nuevoDato = sc.nextInt();
                    x.add(nuevoDato);
                }
            }
        }
    }//fin metodo verificarRepetidos
    
    private static void interseccionConjuntos(Vector x, Vector y){ // metodo para realizar interseccion de conjuntos
       Vector<Integer> z = new Vector<>(5);
       Coleccion s = new Coleccion(z);
        int f;
        System.out.println( "   -----Vectores ingresado-----  " );
        System.out.println( "-----Vector v1-----" );
        s.imprimirColeccion(x);
        System.out.println( "-----Vector v2-----" );
        s.imprimirColeccion(y);
         
        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j < y.size(); j++) {
                if ( x.get(i) == y.get(j) ) {
                    f = (Integer) x.get(i);
                    z.addElement(f);
                }
            }
        }
    System.out.println( "-----La intersecion de los dos conjuntos------" );
    s.imprimirColeccion(z);   
    }//fin metodo inserteccionConjuntos
}//fin clase principal Coeccion
