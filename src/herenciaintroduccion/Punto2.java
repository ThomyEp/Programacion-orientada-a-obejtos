/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaintroduccion;

/**
 *
 * @author Usuario
 */
public class Punto2 extends Punto{
    public int z;
    public Punto2( int x, int y, int z ){ //constructor
      super( x, y );
      this.z = z;
    }//fin metodo constructor
    public void mensaje1(){
        System.out.println( "Punto2 es una sub clase" );
    }
}//fin clase punto2
