/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

/**
 *
 * @author alumnos
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VectoresMatricesParalelas p=new VectoresMatricesParalelas();
        p.ingresarDatos();
        System.out.println("Datos ingresados");
        p.imprimirDatos();
        System.out.println(" ");
        p.promPaises();
        System.out.println("");
        p.imprimirProm();
        System.out.println("");
        p.pomMeses();
        System.out.println("");
        p.mayorTempTri();
    }
    
}
