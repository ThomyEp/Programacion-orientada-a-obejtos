/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaexcepciones;

import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class JavaExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
       Exepciones exp=new Exepciones();
       Scanner sc=new Scanner(System.in);
        do {            
            System.out.println("Menu de opciones\n1.Excepcion sobredimencionamiento de vector\n2.Excepcion numeros enteros mayores que cero");
            System.out.print("Escoja un caso:");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    exp.exep1();
                    break;
                case 2:
                    exp.exep2();
                    break;    
                default:
                    System.out.println("Fin del programa");
            }
        } while (op<3); 
    }
    
}
