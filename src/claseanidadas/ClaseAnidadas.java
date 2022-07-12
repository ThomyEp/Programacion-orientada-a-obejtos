/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package claseanidadas;

/**
 *
 * @author alumnos
 */
public class ClaseAnidadas {

    /**
     * @param args the command line arguments
     */
     int a = 10;
    static int b = 5;
    static class B {//Clase estatica Interna 
        B(){ //Constructor
            ClaseAnidadas s = new ClaseAnidadas(); // crar objerto s para utlitzar la clase estatica
            System.out.println( s.a);  //compila ok y muestra 10
            System.out.println( b );   //coompila ok y muestra 5
        } //TODO -- constructor
    }//TODO -- class B
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseAnidadas.B ab = new ClaseAnidadas.B(); //Instancia la clase estatica
    }//TODO -- main
    
}//TODO -- Clasenidadas
