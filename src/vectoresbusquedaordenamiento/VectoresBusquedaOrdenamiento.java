/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectoresbusquedaordenamiento;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VectoresBusquedaOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int notas[] = new int[5]; 
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE LAS NOTAS");
        for(int i=0;i<notas.length;i++) {  
	System.out.print("Ingrese nota "+(i+1)+" :");
	notas[i] = sc.nextInt(); // ingresa al arreglo 
	}
        System.out.println("LAS NOTAS INGRESADAS");
        for(int i=0;i<notas.length;i++) {
	System.out.println("La nota "+(i+1)+" es :"+ notas[i]);
        }
        System.out.println("LAS NOTAS ORDENADAS ASCENDENTE");
        ordenarA(notas);
        for(int i=0;i<notas.length;i++) {
	System.out.println("La nota "+(i+1)+" es :"+ notas[i]);
        }
        busquedaLineal(notas);
        System.out.println("LAS NOTAS ORDENADAS DESCENDENTE");
        ordenarD(notas);
        for(int i=0;i<notas.length;i++) {
	System.out.println("La nota "+(i+1)+" es :"+ notas[i]);
        }
        
    }
    public static void ordenarA(int notas[]){
            for(int i=0;i<(notas.length)-1;i++)
            {
            for(int j=i+1;j<notas.length;j++)
                  if(notas[i]>=notas[j])
            {
                int c=notas[i];
                notas[i]=notas[j];
                notas[j]=c;
            }
        }
    }
    public static void ordenarD(int notas[]){
            for(int i=0;i<(notas.length)-1;i++)
            {
            for(int j=i+1;j<notas.length;j++)
                  if(notas[i]<=notas[j])
            {
                int c=notas[i];
                notas[i]=notas[j];
                notas[j]=c;
            }
        }
    }
    public static void busquedaLineal(int v[]){
        int ban=0;
        int pos=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese la nota a buscar:");
        int valorb=sc.nextInt();
        for (int i = 0; i < v.length; i++) {
            if (v[i]==valorb) {
                ban=1;
                pos=i;
            } 
        }
        if (ban==1) {
            System.out.println("la nota "+valorb+" se encontro en la posicion "+pos);
        }else{
            System.out.println("No se encontro la nota "+valorb);
        }
    }
    
}
