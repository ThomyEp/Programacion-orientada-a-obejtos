/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareastring;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class TareaString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont1=0;
        int cont2=0;
        String oracion="MURCIELAGO murcielago  elocuencia OCURRENCIA"; 
        for (int i = 0; i < oracion.length(); i++) {
           cont1++; 
        }
         System.out.println(cont1);
        for (int i = 0; i < oracion.length(); i++) {
            if ((oracion.charAt(i)=='a')||(oracion.charAt(i)=='e')||(oracion.charAt(i)=='i')||(oracion.charAt(i)=='o')||(oracion.charAt(i)=='u')||(oracion.charAt(i)=='A')
                  ||(oracion.charAt(i)=='E')||(oracion.charAt(i)=='I')||(oracion.charAt(i)=='O')||(oracion.charAt(i)=='U')) {
                cont2++;
            }
        }
        System.out.println("La oracion -> "+oracion+" contiene :"+cont2+" vocales");
    }
}
