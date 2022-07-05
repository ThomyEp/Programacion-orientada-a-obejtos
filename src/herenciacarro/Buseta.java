/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciacarro;

/**
 *
 * @author alumnos
 */
public class Buseta extends Carro{
    int tamaño;
    public Buseta(){
        System.out.println( "-----Buseta-----" );
        this.modelo = "Ford";
        this.color = "azul";
       
    }
    public void confor(){
        System.out.println( "Comodidad, transporte con " +numeroPuertas+ " puertas" );
    }
    public int getTamaño(){
        return this.tamaño;
    }
    public void setTamaño(int tamaño){
        this.tamaño = tamaño;
    }
     
}//fin clase buseta
