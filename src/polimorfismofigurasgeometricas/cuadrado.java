/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismofigurasgeometricas;

/**
 *
 * @author alumnos
 */
public class cuadrado extends figurasGeometricas {
    public cuadrado(double valor1){
        super(valor1);
    }//fin metodo constructor
    
    @Override
    public double getArea(){ //metodo obtener area cuadrado
        return Math.pow(this.valor1, 2);
    }//fin getArea
    
    @Override
    public double getPerimetro(){ //metodo obtener perimetro cuadrado
        return this.valor1*4;
    }//fin metodo getPerimetro
}//fin clase cuadrado extends figuras geometricas
