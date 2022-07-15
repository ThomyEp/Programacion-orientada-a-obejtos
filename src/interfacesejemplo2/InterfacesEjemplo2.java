/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacesejemplo2;

/**
 *
 * @author alumnos
 */
public class InterfacesEjemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro c = new Carro();
        c.avanzar();
        c.detenerse();
        Bicicleta b = new Bicicleta();
        b.avanzar();
        b.detenerse();
        b.sentarse();
        
    }
    
}
