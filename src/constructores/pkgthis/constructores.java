/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructores.pkgthis;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class constructores {
    private int dia;
    private int mes;
    private int año;
    //Metodo cosntructor por default
    public void Constructores(){ 
        this.dia=20;
        this.mes=05;
        this.año=2022;
    }
     public void mostrarFcha(){
        System.out.print(dia+"/"+mes+"/"+año);
    }
//Metodo constructor por source
    public constructores(int dia, int mes, int año) {
        Scanner ingreso=new Scanner(System.in);
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        System.out.println("Ingrese el dia:"+dia);
        dia=ingreso.nextInt();
        System.out.println("Ingrese el mes:"+mes);
        mes=ingreso.nextInt();
        System.out.println("Ingrese el año"+año);
        año=ingreso.nextInt();
    }
     
}
