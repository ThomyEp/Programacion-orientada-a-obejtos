/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectorconmetodos;

/**
 *
 * @author Usuario
 */
public class VectorConMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vectorA[]={8,1,5,2,4};
        System.out.println("Efectos de pasar una referencia a un vector completo:\n" +"Los valores del vector original son:" );
        // imprime los elementos originales del arreglo
        System.out.println("---Imprimir vector forma 1---");
        for ( int valor : vectorA) // imrime vector 
        System.out.println(valor );// imprime vector
        System.out.println("---Imprimir vector forma 2---");
        imprimirVector(vectorA);
        System.out.println("Ordenar vecto");
        ordenarVector(vectorA);
        imprimirVector(vectorA);
        modificarVector(vectorA); // pasa la referencia al vector
        System.out.println( "\n\nLos valores del vector modificado son:" );
        // imprime los elementos modificados del arreglo
        for ( int valor : vectorA )
        System.out.println( valor );
        System.out.println( "Efectos de pasar el valor de un elemento del arreglo:\n"+"arreglo[3] antes de modificarElemento: "+vectorA[3] );
        int x=modificarElemento(vectorA[3]); // intento por modificar arreglo[ 3 ]
        vectorA[3]=x;
        System.out.println("arreglo[3] despues de modificarElemento: "+ vectorA[3] ); 
        imprimirVector(vectorA);
        
    }
    public static void modificarVector( int v[] ){
        for ( int i = 0; i < v.length; i++ )
        v[ i ] *= 2;
    }
    public static int modificarElemento(int elemento) {
        return elemento*= 2;
    }
    public static void imprimirVector(int v[]){
        for(int valor: v)
        System.out.println(valor );  
    }
    public static void ordenarVector(int v[]){//ascendente
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length; j++) {
                if (v[i]<=v[j]) {
                    int c=v[i];
                    v[i]=v[j];
                    v[j]=c;
                }
            }
        }
    }
}
