/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismofigurasgeometricas;

/**
 *
 * @author alumnos
 */
public class PolimorfismoFigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        figurasGeometricas figura;
        figura = new circulo(5);
        System.out.println( "-----Circulo-----" );
        System.out.println( figura.getClass() );
        System.out.println( "Area: " +figura.getArea());
        System.out.println( "Perimetro" +figura.getPerimetro() );
        
        figura = new cuadrado(5);
        System.out.println( "-----Cuadrado-----" );
        System.out.println( figura.getClass() );
         System.out.println( "Area: " +figura.getArea());
        System.out.println( "Perimetro: " +figura.getPerimetro() );
        
        figura = new triangulo(5, 2);
        System.out.println( "-----Triangulo-----" );
        System.out.println( figura.getClass() );
         System.out.println( "Area:" +figura.getArea());
        System.out.println( "Perimetro:" +figura.getPerimetro() );
        
        figura = new rectangulo(3, 6);
        System.out.println( "-----Rectangulo-----" );
        System.out.println( figura.getClass() );
        System.out.println( "Area: " +figura.getArea());
        System.out.println( "Perimetro: " +figura.getPerimetro() );
        
        figura = new cubo(4);
        System.out.println( "-----Cubo-----" );
        System.out.println( figura.getClass() );
        System.out.println( "Area: " +figura.getArea() );
        System.out.println( "Perimetro: " +figura.getPerimetro() );
    }
    
}
