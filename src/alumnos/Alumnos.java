/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnos;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e1=new Estudiante();
        e1.mostrarDatos();
        e1.toString();
        Estudiante e2=new Estudiante(10, "Thomy","Peñaloza", "POO", 10, true);
        e2.mostrarDatos();
        System.out.println("Metodo to String");
        String x=e2.toString();
        System.out.println(x);
        e2.mostrarDatos();
        System.out.println("");
        System.out.println("Uso de setters");
        e2.setPromedio(8);
        e2.setMatriculado(false);
        e2.mostrarDatos();
        Scanner ing=new Scanner(System.in);
        System.out.print("Ingrese codigo: ");
        int cod=ing.nextInt();
        System.out.print("Ingrese el nombre:");
        String nom=ing.next();
        System.out.print("Ingrese apellido:");
        String ape=ing.next();
        System.out.print("Ingrese materia:");
        String mat=ing.next();
        System.out.print("Ingrese promedio:");
        float prom=ing.nextFloat();
        System.out.print("Matriculado True o false:");
        boolean siNo=ing.nextBoolean();
        Estudiante e3=new Estudiante(cod,nom,ape,mat,prom,siNo);
        System.out.println("Alumno nuevo");
        e3.mostrarDatos();
        System.out.println(e3.toString());
    } 
}
