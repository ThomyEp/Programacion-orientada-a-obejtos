/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metododatebasicos;

import java.util.Date;

/**
 *
 * @author alumnos
 */
public class MetodoDateBasicos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date fecha=new Date();
        Date fecha1=new Date(0);
        String fecha11=fecha1.toString();
        System.out.println("La fecha 1 es: "+fecha11);
        Date fecha2=new Date(1964,04,20);
        String fechaActual=fecha.toString();
        System.out.println("La fecha actual es: "+fechaActual);
        boolean af=fecha1.after(fecha2);
        System.out.println("El valor de df es: "+af);
        System.out.println("Fecha 2: "+fecha2.getYear()
        +"/"+fecha2.getMonth()+"/"+fecha2.getDay());
    }
    
}
