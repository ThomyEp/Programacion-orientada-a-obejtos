/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciacarro;

/**
 *
 * @author alumnos
 */
public class Carro {
    String modelo;
    String matricula;
    String color;
    boolean encendido;
    int numeroPuertas;
    public Carro(){
        this.encendido = false;
        //this.color = "Blanco";
        this.numeroPuertas = 4;
    } //fin metodo constructor
    public void apagarCarro(){
        System.out.println( "El carro esta pagado" );
    }//fin metodo apagarCarro
    public void prenderCarro(){
        System.out.println( "El carro esta encendido" );
    }//fin metodo prenderCarro
}//fin clase carro
