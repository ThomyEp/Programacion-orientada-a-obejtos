/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Exepciones {
     public Scanner sc=new Scanner(System.in);
     public int posicion;
     //Exepcion para controlar posicion de un vector si no existe
    public void exep1(){
        String nombres[]={"Maria","Flor","Petra","Andrea","Sol"};
         
        try {
            System.out.println("nombres[]={\"Maria\",\"Flor\",\"Petra\",\"Andrea\",\"Sol\"}");
            System.out.println("nombres[]={\"   0\"  ,\" 1\"   ,\" 2\"   ,\" 3\"   ,\"4\"}");
            System.out.print("A que posicion desea acceder?:");
            posicion=sc.nextInt();
            System.out.println("la posicion "+posicion+" contiene el nombre: "+nombres[posicion]);  
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("La posicion no existe");
           
        }
        finally {
            System.out.println("Manejo de excepciones");
        }
        
    }
    //Exepecion para solo ingresar numeros entero mayor que cero
    public void exep2(){
        int num;
        do {
             try{
                 System.out.print("Introduce un número entero > 0: ");                                            
                 num = sc.nextInt();
                 System.out.println("Número introducido: " + num);
          }catch(InputMismatchException e){
                 sc.nextLine();
                 num = 0;
                 System.out.println("Debe introducir un número entero " + e.toString());                          
          }
            finally {
            System.out.println("Manejo de excepciones");
            }
        } while (num<=0);
    }
}
