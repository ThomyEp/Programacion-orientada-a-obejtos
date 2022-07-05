/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaextendssuper;

/**
 *
 * @author alumnos
 */
public class Profesor extends Persona {
    private int edad;
    
    public Profesor(int edad, int id, String nombre, String apellido, String correo){
        super(id, nombre, apellido, correo);
        this.edad = edad;
    }//fin metodo construstor profesor
    public void mostrarDatos(){ //Metodo mostrar datos
        System.out.println( "Nombres del profesor: " +nombre );
        System.out.println( "Apellido del profesor: " +apellido );
        System.out.println( "Edad del profesar: " +edad );
        System.out.println( "Id del profesor:" +id );
        System.out.println( "Correo del profesor: " +correo );
    }//fin metodo mostrarDatos
}//fin clase profesor
