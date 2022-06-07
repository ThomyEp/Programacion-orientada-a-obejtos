/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosstringbasicos;

/**
 *
 * @author alumnos
 */
public class MetodosStringBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena="Hola Mundo";
        String cadena1=" Programacion orientada a objetos";
        String cadena2=new String("Hola Mundo");
        char caracter;
        System.out.println("La cadena tiene"+cadena.length()+"carcteres");
        for (int i = 0; i < cadena.length(); i++) {
            caracter=cadena.charAt(i);
            System.out.println("El caracter es la posicion "+i+" es:"+caracter);
        }
        System.out.println(cadena1);
        //Concatenar 2 cadenas
        System.out.println(cadena.concat(cadena1));
        //Mostrar una subcadena
        System.out.println(cadena1.substring(5,15));
        //Cambiar la cadena a mayuscula
        System.out.println(cadena1.toUpperCase());
        //Cambiar la cadena a minuscula
        System.out.println(cadena1.toLowerCase());
        //Muestra la posicion del primer caracter o
        System.out.println(cadena1.indexOf('o'));
        //Comparar dos cadenas
        System.out.println(cadena.compareTo(cadena2));
    }
    
    
}
