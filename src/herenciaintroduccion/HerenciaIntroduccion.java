/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaintroduccion;

/**
 *
 * @author Usuario
 */
public class HerenciaIntroduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 20;
        int c = 30;
        Punto2 p = new Punto2(a, b, c);
        System.out.println( "Objeto creado" );
        System.out.println( p.x+ " " +p.y+ " " +p.z );
        p.mensaje();
        p.mensaje1();
    }//fin clase main
    
}//fin clase principal herenciaIntroduccion;
