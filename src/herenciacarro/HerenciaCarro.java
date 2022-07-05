/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciacarro;

/**
 *
 * @author alumnos
 */
public class HerenciaCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Automovil c = new Automovil();
        System.out.println( "Modelo " +c.modelo+ " colo: " +c.color );
        c.apagarCarro();
        c.prenderCarro();
        c.setVelocidad(200);
        c.turbo();
        System.out.println( c.getVelocidad()+ "Km/h");
        Buseta b = new Buseta();
        System.out.println( "Modelo: " +b.modelo+ " colo: " +b.color );
        b.apagarCarro();
        b.prenderCarro();
        b.confor();
    }//fin main
   
    

}//fin clase principal
