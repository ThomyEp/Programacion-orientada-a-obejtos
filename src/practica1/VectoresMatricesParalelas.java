/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class VectoresMatricesParalelas {
    private Scanner ingreso;
    private String[] paises;
    private double [][] temperaturas;
    private double[] promediotrim;
    //private double [][] pomediomensual;
    
    public void ingresarDatos(){
        ingreso=new Scanner(System.in);
        paises=new String[4];
        temperaturas= new double [4][3];
        for (int i = 0; i <paises.length; i++) {
            System.out.print("Ingrese el nombre del pais "+(i+1)+":");
            paises[i]=ingreso.next();
            for (int j = 0; j < temperaturas[j].length; j++) {
                System.out.print("Ingrese la temperatura: ");
                temperaturas[i][j]=ingreso.nextInt();
                
            }
        }
    }
    public void imprimirDatos(){
        System.out.println("Temperaturas");
        System.out.println("Paises \tMes 1\tMes 2\tMes 3");
        for (int i = 0; i < paises.length; i++) {
            System.out.print("\n"+paises[i]);
            for (int j = 0; j < temperaturas[i].length; j++) {
                System.out.print("\t"+temperaturas[i][j]);
            }
        }
    }
    public void promPaises (){
        promediotrim=new double[4];
        for (int i = 0; i < temperaturas.length; i++) {
            double suma=0;
            for (int j = 0; j < temperaturas[j].length; j++) {
                suma+=temperaturas[i][j];
            }
            promediotrim[i]=suma/temperaturas[i].length;
        }
    }
    public void imprimirProm(){
        System.out.println("El promedio de la temperatura de cada pais:");
                for (int i = 0; i < promediotrim.length; i++) {
                    System.out.println(paises[i]+"\t"+promediotrim[i]);
            }
    }
    public void pomMeses(){
       // pomediomensual =new double[4][3];
        for (int j = 0; j < temperaturas[j].length; j++) {
            double suma =0;
            for(int i=0; i<temperaturas.length; i++){
                suma=suma+temperaturas[i][j];
            }
            System.out.print("\t"+suma/4); 
        }
        System.out.println("");
    }
    public void mayorTempTri(){
        double mayor=0;
        String pa=paises[0];
        for (int i = 0; i <promediotrim.length; i++) {
            if (promediotrim[i]>mayor) {
                mayor=promediotrim[i];
                pa=paises[i];
            }
        }
        System.out.println("El paies con la temperatura media trimestral mayor es "+pa+" con: "+mayor);
    }
}
