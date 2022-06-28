/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaintroduccion;

/**
 *
 * @author Usuario
 */
public class Punto { //clase principal punto
    public int x;
    public int y;
    
public Punto(int x, int y){ //constructor 
    this.x = x;
    this.y = y;
}//fin metodo constructor
public void mensaje(){
    System.out.println( "Punto es una sub clase " );
}//fin metodo mensaje
}//fin clase principal punto

