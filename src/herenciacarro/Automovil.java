/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciacarro;

/**
 *
 * @author alumnos
 */
public class Automovil extends Carro{
    int velocidad;
    
    public Automovil(){
        System.out.println( "-----Automovil-----" );
        this.modelo = "BMW";
        this.color = "Blanco";
    }//fin metodo contructor
    
    public void turbo(){
        System.out.println( "Viajas a una velocidad fenomenal" );
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }
    
}
