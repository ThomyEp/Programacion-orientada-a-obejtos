/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizconmetodos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MatrizConMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c[][]={{4,2,5},{1,7,9}};
        int c1[][]={{2,3},{7},{8,5,6}};
        System.out.println("Datos iniciales del arreglo C");
        imprimirMatriz(c);
        System.out.println("Datos iniciales del arreglo C1");
        imprimirMatriz(c1);
        System.out.println("Arreglo c modificado");
        modificarMatriz(c);
        imprimirMatriz(c);
        System.out.println("Arreglo c1 modificado");
        modificarMatriz(c1);
        imprimirMatriz(c1);
         System.out.println("el valor anterior es:"+c[1][1]);
        int a=cambioElemento(c[1][1]);
        System.out.println("el valor cambiado es:"+a);
        System.out.println("Imprimir while");
        imprimirMatrizWhile(c);
        System.out.println("Matriz simetrica");
        matrizSimetrica();
    }
    public static void imprimirMatriz(int arreglo[][]){
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j]+"\t");
            }
            System.out.println();
        }
    }
    public static void modificarMatriz(int arreglo[][]){
         for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
               arreglo[i][j]*=2;
            }
        }
    }
    public static void imprimirMatrizWhile(int arreglo[][]){
        int i=0;
        int j=0;
        while (i<arreglo.length) {            
            for (j = 0; j < arreglo[i].length; j++) {
                System.out.print(arreglo[i][j]+"\t");
            }
            System.out.println();
             i++;
        }
         
    }
    public static int cambioElemento(int x){
          return   x+=10;
    }
    public static void matrizSimetrica(){
        Scanner sc=new Scanner(System.in);
        int v[][]=new int[3][3];
         for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                if (i<=j) {
                    System.out.print("Ingrese datos:"+i+" "+j);
                    v[i][j]=sc.nextInt();
                }
                v[j][i]=v[i][j];
            }
        }
         imprimirMatriz(v);
    }
}
