/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iteratorclase;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class IteratorClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str;
        //Creacion Hashtable
        Hashtable<String, String> hastable = new   Hashtable<>();
        //Ingreso de dtos
        hastable.put("1707796536", "Hugo Galvez");
        hastable.put("0945678994", "Mayte Pazmiño");
        hastable.put("0289456798", "Yadira Zambrano");
        hastable.put("1510178963", "Genesis Armas");
        hastable.put("0578965430", "Pepe Hurtado");
        System.out.println("Contenido Hasstable:");
        Set<String> keys = hastable.keySet();
        //Creaar iterator
        Iterator<String> itr = keys.iterator();
        //Desplegar las claves y valores
        while (itr.hasNext()) {            
            //Obtener clave
            str = itr.next();
            System.out.println("Clave: "+str+" y valor: "+hastable.get(str));
        }
        //Creacion con un vector
        Vector v = new Vector();
        for (int i = 1; i <= 10; i++) {
            v.add(new String("Mensaje " +i));
        }
        //Elementos del vector recorridos por el iterator
        System.out.println("Elementos del vector recorridos por el iterator");
        String mensaje;
        Iterator itr2 = v.iterator();
         while (itr2.hasNext()) {            
            mensaje =(String) itr2.next();
            System.out.println(mensaje);
        }
        //elementos del vector recorridos removido el iterador
        itr2.remove();
        System.out.println("Elementos despues de remover iterator");
        itr2 = v.iterator();
        while (itr2.hasNext()) {            
            mensaje =(String) itr2.next();
            System.out.println(mensaje);
        }
        //Creacion ArrayList
        ArrayList<String> ar  =  new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ar.add("Mensae "+i);
        }
        //Recorrido de  iterator con un ArrayList 
        System.out.println("Elementos del array recorridos por Iterator:");
        Iterator<String> iterator = ar.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Recorrido removiendo iterator con un ArrayList 
        iterator.remove();
        System.out.println("Elementos después de remover Iterator:");
        iterator = ar.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    
}
