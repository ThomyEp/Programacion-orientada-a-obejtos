/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arregloarraylistclasejava;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ArregloArrayListClaseJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista=new ArrayList<>();
        ArrayList<String> array=new ArrayList<>();
        lista.add("Hola");
        lista.add("que");
        lista.add("tal");
        lista.add("esta");
        int tam=lista.size();
        for(Object o: lista){
        System.out.println(o);
    }
        System.out.println("El tamano de la lista es: " +tam);
        System.out.println("  ");
        for (int i = 1; i <= 10; i++) {
            array.add("Mensaje " +i);
        }
        System.out.println("Elementos del array:");
        String mensaje;
        for (int i = 0; i < array.size(); i++) {
            mensaje=array.get(i);
            System.out.println(mensaje);
        }
        array.add(5,"Mensaje insertado nuevo");
        System.out.println("Ellmentos del array despues de insertar");
        for (int i = 0; i < array.size(); i++) {
            mensaje=array.get(i);
            System.out.println(mensaje);
        }
        array.remove(0);
        System.out.println("Elementos del array despues de remover");
        for (int i = 0; i < array.size(); i++) {
            mensaje=array.get(i);
            System.out.println(mensaje);
            }
            String x=array.get(6);
            System.out.println(x);
            
             if (array.contains(x)) {
                 System.out.println(x+ "Si existe el elemento en la lista");
            }else{
                 System.out.println(x+ "No existe el elemento en la lista");
             }
        
       
    }
    
}
