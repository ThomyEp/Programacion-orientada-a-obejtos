/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectoresdeclaracioninicializacion;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class VectoresDeclaracionInicializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int Longitud_arreglo=10;// tamaño vectore definido
        int vectorA[]=new int[4];//declarar un vector de 4 posiciones
        int vectorB[]=new int[10];
        int j=0;
        Scanner sc=new Scanner(System.in);//Ingreso datos por teclado al vectorB
        int vectorC[]={32,27,64,18,95,90,70,60,77,39}; //inicializar un vector
        int vectorD[]=new int [Longitud_arreglo];
        vectorA[1]=23;
        vectorA[0]=45;
        vectorA[3]=213;
        vectorA[2]=95;
        try{
         vectorA[4]=34;
         float vectorE[]=new float[-20];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Eror de indice en un vector fuera de rango");
            System.out.println(e);
        }
        catch(NegativeArraySizeException e){
            System.out.println("Vector con indice negativo");
            System.out.println(e);
        }
        finally{
            System.out.println("Imprimir vector");
            imprimirVector(vectorA);
        }
        System.out.println("EL vector en la posicion 0 es "+vectorA[0]);
        for (int i = 0; i < vectorA.length; i++) {
            System.out.println("vectorB["+i+"]="+vectorA[i] );
        }
        System.out.println("Indice\tValor");
        for (int i = 0; i < vectorC.length; i++) {
            System.out.println(i+"\t"+vectorC[i]);
        }
        //Calcula el valor para cada elemento del arreglo
        for (int i = 0; i < vectorD.length; i++) {
            vectorD[i]=2+2*i;
        }
        //encabezado de columnas
        System.out.println("Indice"+"\t"+" Valor");
        //Imprime el valor de cada elemento
        for (int i = 0; i < vectorD.length; i++) {
            System.out.println(i+"\t"+vectorD[i]);
        }
        //Lee e ingresa datos al arreglo
        System.out.println("Ingrese nota");
        while (j<10) {            
            System.out.print("Ingrese nota "+(j+1)+":");
            vectorB[j]=sc.nextInt(); 
            j++;
        }
        //Muestra notas del arreglo
        j=0;
        System.out.println("Los datos ingresados");
        while (j<10) {            
            System.out.println("La nota "+(j+1)+" es:"+vectorB[j]);
            j++;
        }
        
    }
    public static void imprimirVector(int []v){
            for (int i = 0; i <v.length; i++) {
                System.out.println("vectorA["+i+"]="+v[i]+" ");
            }
    }
}


