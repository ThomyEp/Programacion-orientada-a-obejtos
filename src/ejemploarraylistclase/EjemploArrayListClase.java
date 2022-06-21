/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploarraylistclase;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EjemploArrayListClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
         ArrayList<Estudiante> es=new ArrayList<>();
         Estudiante e1=new Estudiante("Richard", 1);
         es.add(e1);
         Estudiante e2=new Estudiante("Belen", 2);
         es.add(e2);
         Estudiante e3=new Estudiante("Poleth", 3);
         es.add(e3);
         Estudiante e4=new Estudiante("Jennifer", 4);
         es.add(e4);
         Estudiante e5=new Estudiante("Daniel", 5);
         es.add(e5);
         Estudiante e6=new Estudiante("Thomy", 6);
         es.add(e6);
         System.out.println("");
         System.out.println("-----Mostrar datos lista-----");
         for (int i = 0; i < es.size(); i++) {
             System.out.print("Estuidante " +(i+1)+ ": " +es.get(i).getNombre()+" " );
             System.out.println("\t-Nivel: " +es.get(i).getNivel()+" " );
        }
         e3.setNombre("Azul");
         e3.setNivel(9);
         es.set(2,e3);
         System.out.println("-----Mostrar datos lista modificada-----");
         for (int i = 0; i < es.size(); i++) {
             System.out.print("Estuidante " +(i+1)+ ": " +es.get(i).getNombre()+" " );
             System.out.println("\t-Nivel: " +es.get(i).getNivel()+" " );
        }
    }
    
}
