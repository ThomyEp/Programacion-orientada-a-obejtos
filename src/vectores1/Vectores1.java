/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vectores1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MetodosDeOrdenamiento ov=new MetodosDeOrdenamiento();
        MetodosDeBusqueda be=new MetodosDeBusqueda();
        Scanner valor=new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese el numero de elementos del vector:");
        int p = valor.nextInt();
        int[] a= new int [p];
        System.out.println("Ingrese los valores del arreglo");
        for(int i =0; i <p; i++){
            a[i]= valor.nextInt();
        }
        System.out.println("Vector ingresado");
        ov.imprime(a);
        //Metodo de ordenamiento Shellsort
        System.out.println("Vector ordenado medoto shellsort");
        ov.ordenamientoShellSort(a);
        ov.imprime(a);
         //Metodo de ordenamiento Seleccion
        System.out.println("Vector ordenado medoto seleccion");
        ov.ordenamientoSeleccion(a);
        ov.imprime(a);
         //Metodo de ordenamiento Insercion
        System.out.println("Vector ordenado medoto insercion");
        ov.ordenamientoInsercion(a);
        ov.imprime(a);
         //Metodo de ordenamiento Burbuja1
        System.out.println("Vector ordenado medoto burbuja1");
        ov.ordenamientoBurbuja1(a);
        ov.imprime(a);
         //Metodo de ordenamiento Burbuja2
        System.out.println("Vector ordenado medoto burbuja2");
        ov.ordenamientoBurbuja2(a);
        ov.imprime(a);
         //Metodo de ordenamiento Quicksort
        System.out.println("Vector ordenado medoto quicksort");
        ov.ordenamientoQuick(a,0,a.length-1);
        ov.imprime(a);
        //Metodo de busqueda
        System.out.print("Ingrese el numero que desea buscar:");
        int buscar=sc.nextInt();
        int indice=be.busquedaBinaria(a,buscar);
        System.out.println("Se debe ordenar el vector para la busqueda binaria");
         //Metodo de ordenamiento Radix
        System.out.println("Vector ordenado metodo radix");
        ov.ordenamientoRadix(a);
        if(indice!=-1){
            System.out.println("Elemento:"+buscar+" encontrado en la posicion "+indice);
        }else{
            System.out.println("Elemento:"+buscar+"no encontrado");
        }
        System.out.println("Vector ordenado metodo Merge sort");
        int inicio = 0;
        int fin = a.length-1;
        ov.ordenamientoMerge(a, inicio, fin);
        ov.imprime(a);
    }
}
