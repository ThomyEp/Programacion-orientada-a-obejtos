/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

/**
 *
 * @author alumnos
 */
public class Practica3 {
       //1
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //2        
        String a="Universidad UTE";
        String x="Universidad UTE";
        //3        
        System.out.println(a);
        System.out.println("");
        System.out.println("Retornamos el caracter 5");
        char b=a.charAt(5);
        System.out.println(b);
        //4
        System.out.println("Comparamos la cantidad decaracteres de las dos cadenas");
        int c=a.compareTo(x);
        System.out.println(c);
        //5
        System.out.println("Concadenamos la cadena a con la y");
        String y=" Es la mejor del mundo";
        String d=a.concat(y);
        System.out.println(d);
        //6
        System.out.println("Verificamos si el caracter UTE existe en la cadena");
        boolean e=a.contains("UTE");
        System.out.println(e);
        //7
        System.out.println("Retornamos la posiscion v dela cadena");
        int f=a.indexOf("v");
        System.out.println(f);
        //8
        System.out.println("Verdadero si la cadena es vacia falso si la cadena contiene almenos 1 caracter");
        boolean g=a.isEmpty();
        System.out.println(g);
        //9
        System.out.println("El tamaño de la cadena es");
        int h=a.length();
        System.out.println(h);
        //10
        System.out.println("La cadena en mayusculas");
        String i=a.toUpperCase();
        System.out.println(i);
        //11
        System.out.println("Subcadena a partir de la posicion 12");
        String j=a.substring(12);
        System.out.println(j);
    }
    
}
