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
        String oracion="que tal como esta"; 
        for (int i = 0; i < oracion.length()-1; i++) {
            cont1++;
        }
        for (int i = 0; i < oracion.length()-1; i++) {
            if ((oracion.charAt(i)=='a')||(oracion.charAt(i)=='e')||(oracion.charAt(i)=='i')||(oracion.charAt(i)=='o')||(oracion.charAt(i)=='u')) {
                cont2++;
            }
            
        }
        System.out.println("La oracion -> "+oracion+" contiene :"+cont2+" vocales");
    }
}
