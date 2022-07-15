/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfacesejemplo2;

/**
 *
 * @author alumnos
 */
public class Bicicleta implements Rueda, Silla {
    
    public Bicicleta() {
        
    }
    @Override
    public void avanzar() {
        System.out.println( "La bicicleta avanza" );
    }//TODO -- avanzar
    @Override
    public void detenerse() {
        System.out.println( "La bicicleta se detiene" );
    }
    @Override
    public void sentarse() {
        System.out.println( "Sentarse en la bicicleta" );
    }
}
