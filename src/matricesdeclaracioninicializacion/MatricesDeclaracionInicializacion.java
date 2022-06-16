/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matricesdeclaracioninicializacion;

/**
 *
 * @author Usuario
 */
public class MatricesDeclaracionInicializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int fila;
        int col;
        int a[][]=new int[4][3];
        int b[][]={{1,2,3},{4,5,6},{2,8}};
        int c[][]={{4,2,5},{1,7,9}};
        int c1[][]={{2,3},{7},{8,5,6}};
        System.out.println("Datos iniciales del arreglo A");
        for (fila = 0;  fila< a.length;fila ++) {
            for (col = 0; col < a[fila].length; col++) {
                System.out.print(a[fila][col]+"\t");
            }
            System.out.println();
        }
        System.out.println("Datos iniciales del arreglo B");
        for (fila = 0;  fila< b.length;fila ++) {
            for (col = 0; col < b[fila].length; col++) {
                System.out.print(b[fila][col]+"\t");
            }
            System.out.println();
        }
        System.out.println(" Elemento b[2][2]="+b[2][1]);
        System.out.println("Datos iniciales del arreglo C");
        for (fila = 0;  fila< c.length;fila ++) {
            for (col = 0; col < c[fila].length; col++) {
                System.out.print(c[fila][col]+"\t");
            }
            System.out.println();
        }
        System.out.println("Datos iniciales del arreglo C1");
        for (fila = 0;  fila< c1.length;fila ++) {
            for (col = 0; col < c1[fila].length; col++) {
                System.out.print(c1[fila][col]+"\t");
            }
            System.out.println();
        }
    }
    
}
