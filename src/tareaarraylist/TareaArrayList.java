/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class TareaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> lista=new ArrayList<>();
        int j=0;
        int num;
        int cont=0;
        int suma=0;
        float Media;
        int numeros;
        System.out.println("---------Ingresar numeros a la ArrayList---------");
        do {
            System.out.print( "Ingrese el " +(j+1)+ " numero: " );
            num=sc.nextInt();
            if (num!=-99) {
                lista.add(num);  //Ingreso numeros a la ArrayList
                cont+=1; // cuanta numero ingresados en la lista exepto si es -99
                suma+=num;
            }else{
                System.out.println( " El numero " +num+ " no estara en la lista ");
            }
            j++;
        } while (num!=-99);
        //Imprimir la ArrayList
        System.out.println( "---------ArrayList ingresada---------" );
        for (int i = 0; i < lista.size(); i++) {
            numeros=lista.get(i);
            System.out.println( "numero " +(i+1)+":" +numeros );
        }
        System.out.println( " La cantidad de numeros ingresados es: " +cont);
        System.out.println( " La suma de los numeros ingresados en la lista es: " +suma );
        Media=suma/cont; // sacamos media aritmetica usando la suma elementos de la lista y el cont: numero de datos de la lista
        System.out.println( " la media de la lista es: " +Media );
    }

}
