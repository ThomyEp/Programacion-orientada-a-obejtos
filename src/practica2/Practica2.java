/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        try {
                System.out.print("Ingrese el largo del rectangulo: ");
                int largo=sc.nextInt();
                System.out.print("Ingrese el ancho del rectangulo: ");
                int ancho=sc.nextInt();
                 if (largo!=ancho) {
                       
                System.out.println("Datos ingresados\nLargo= "+largo+"\nAncho= "+ancho);
                Rectangulo rc=new Rectangulo(largo,ancho);
                rc.areaRectangulo();
                rc.perimetroRectangulo();
                System.out.println("Ingrese los nuevos datos para el rectangulo");
                System.out.print("Ingrese el nuevo largo del rectangulo: ");
                largo=sc.nextInt();
                System.out.print("Ingrese el nuevo ancho del rectangulo: ");
                ancho=sc.nextInt();
                rc.setAncho(ancho);
                rc.setLargo(largo);
    
                System.out.println("Nuevo ancho: "+rc.getAncho());
                System.out.println("Nuevo largo: "+rc.getLargo());
                rc.areaRectangulo();
                rc.perimetroRectangulo();
                } 
                else{
                System.out.println("Los datos "+largo+" y "+ancho+" ingresados corresponden a un cuadrado");
                    }
                 }
                
                catch (InputMismatchException e) {
                    System.out.println("Debe ingresar numeros enteros");
                }       
                
                 finally{
                     System.out.println("Gracias por usar el porgrama");
                }
            }
        }


     
   
    

