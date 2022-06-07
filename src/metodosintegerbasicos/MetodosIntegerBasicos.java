/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosintegerbasicos;

/**
 *
 * @author alumnos
 */
public class MetodosIntegerBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer dato=new Integer("10");
        Integer dato1=new Integer(10);
        System.out.println("El int es: "+dato.intValue());
        System.out.println("El float es: "+dato.floatValue());
        //Compara dos integer
        System.out.println(dato.compareTo(dato1));
        //Verificar si dos integer son iguales
        System.out.println(dato.equals(dato1));
        //Rangos de un integer
        System.out.println("Rango mayor: "+Integer.MAX_VALUE);
        System.out.println("Rango menor: "+Integer.MIN_VALUE);
        //Numero de bits usados
        System.out.println("Numero de bits: "+Integer.SIZE);
        //Tipo de dato
        System.out.println("Tipo de dato: "+Integer.TYPE);
    }
    
}
