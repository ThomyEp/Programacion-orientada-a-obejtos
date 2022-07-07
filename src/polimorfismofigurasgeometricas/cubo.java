/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismofigurasgeometricas;

/**
 *
 * @author alumnos
 */
public class cubo extends cuadrado {
    
    public cubo(double valor1) { //constructor
        super(valor1); //herencia indirecta
    }//fin metodo constructor
    @Override
    public  double getArea() { //metodo obtener area de un cubo
        return Math.pow(this.valor1, 3);
    }//fin metodo getArea
    @Override
    public double getPerimetro() {
        return 12*this.valor1;
    }
}//fin clase cubo extends figurasgeometricas
