/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javasinexcepcion;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class JavaSinExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1;
        String str2;
        String respuesta;
        int numerador;
        int denominador;
        int cociente;
        Scanner sc=new  Scanner(System.in);
        System.out.print("Ingrese el primer valor:");
        str1=sc.next();
        System.out.print("Ingrese el segundo valor:");
        str2=sc.next();
        //Excepciones
        try {
        numerador=Integer.parseInt(str1);
        denominador=Integer.parseInt(str2);
        cociente=numerador/denominador;
        respuesta=String.valueOf(cociente);
        }
        //Controlar datos tipo string en una operacion
        catch(NumberFormatException ex){ //Metodo excepcion
            respuesta="Se han introducido cartacters no numericos";
        }
        //Divicion entre cero
        catch(ArithmeticException ex){ //Metodo excepcion
            respuesta="Division entre cero";
        }
        finally{
            System.out.println("Manejo de excepciones");
        }
        System.out.println(respuesta);
    }  
}
