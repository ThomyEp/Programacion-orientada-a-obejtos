/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodomathbasicos;

/**
 *
 * @author alumnos
 */
public class MetodoMathBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double dato=25;
        double raizCuadrada=Math.sqrt(dato);
        System.out.println("La raiz cuadrada del: "+dato+" es: "+raizCuadrada);
        double raizCubica=Math.cbrt(dato);
        System.out.println("La raiz cubica del: "+dato+" es: "+raizCubica);
        double base=5; double exponente=4;
        double potencia=Math.pow(base,exponente);
        System.out.println("LA potencia de "+base+" ^ "+exponente+" es: "+potencia);
        System.out.println("PI= "+Math.PI);
        System.out.println("EXPON= "+Math.E);
        double seno;
        double coseno;
        for (int i = 0; i < 360; i+=90) {
            seno=Math.round(Math.sin(i*Math.PI/180));
            System.out.println("El seno de "+i+" usando PI/180 es: "+seno);
            seno=Math.round(Math.sin(Math.toRadians(i)));
            System.out.println("El seno de "+i+" usando toRadians es: "+seno);
            coseno=Math.round(Math.cos(i*Math.PI/180));
            System.out.println("El coseno de "+i+" usando PI/180 es: "+coseno);
            coseno=Math.round(Math.cos(Math.toRadians(i)));
            System.out.println("El coseno de "+i+" usando toRadians es: "+coseno);
        }
        System.out.println("Numeros aleatorios");
        for (int i = 0; i < 10; i++) {
            System.out.println("El randomico "+i+" es: "+Math.random());
           
            
        }
        System.out.println("Raiz cuadrada");
        for (int i = 0; i < 10; i++) {
             System.out.println("La raiz cuadrada de "+i+" es: "+Math.sqrt(i));
        }
        System.out.println("Numeros elevados al cuadrado");
        for (int i = 0; i < 10; i++) {
            System.out.println("El cuadrado de "+i+" es: "+Math.pow(i, 2));    
        }
    }
    
}
