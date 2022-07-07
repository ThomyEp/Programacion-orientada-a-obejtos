/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismofigurasgeometricas;

/**
 *
 * @author alumnos
 */
public class circulo extends figurasGeometricas{
    public circulo(double valor1){
        super(valor1);
    }//fin constructor
    @Override
    public double getArea() { //metodo obtener area circulo
        return Math.PI*this.valor1;
    }//fin metodo getArea
    @Override
    public double getPerimetro() { //metodo obtener perimetro circulo
        return Math.PI*this.valor1;
    }//fin metodo getPerimetro
}//fin clase circulo extends figurasgeometricas
