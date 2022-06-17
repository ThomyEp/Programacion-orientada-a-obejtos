/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglovectorclasejava;

import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class ArregloVectorClaseJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<String> v=new Vector<String>();
        v.add("Pablo");
        v.add("Mayte");
        v.add("Victor");
        v.add("Hugo");
        int a=v.capacity();
        System.out.println("La capacidad del vector es: "+a);
        System.out.println("Datos del vector original");
        for (int i = 0; i <v.size(); i++) {
            System.out.println(v.get(i));
        }
        System.out.println("IMPRIMIR FORMA 2");
        for (String s: v){
            System.out.println(s);
        }
        v.remove(0);
        System.out.println("Datos del vector modificado");
        v.add(1,"Olivia");
        v.addElement("Genesis");
        for (int i = 0; i <v.size(); i++) {
            System.out.println(v.get(i));
        }
        if (v.contains("Olivia")) {
            System.out.println("Si existe el dato");
        }
        System.out.println("Primer elemeto: "+v.firstElement());
        System.out.println("Ultimo elemento: "+v.lastElement());
    }
    
}
