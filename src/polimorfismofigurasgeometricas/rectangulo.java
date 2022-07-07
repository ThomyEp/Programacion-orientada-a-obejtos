/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismofigurasgeometricas;

/**
 *
 * @author alumnos
 */
public class rectangulo extends figurasGeometricas {
    protected double valor2; //rectangulo requires vakir 1 y valor 2 para el calculo 
    public rectangulo(double valor1,double valor2) { //metodo constructor
        super(valor1);
        this.valor2 = valor2;
    }//fin metodo constructor
    public void setValor2(double valor2) { //setter valor2
        this.valor2 = valor2;
    }//fin metodo sertValor2
    public double getValor2() { // getter valor2
        return valor2;
    }//fin metodo getValor2
    @Override
    public double getArea() { //metodo para obtener area rectangulo
        return this.valor1*this.valor2;
    }//fin metodo getArea
    @Override
    public double getPerimetro() { //metodo para obtener el petimetro rectangulo
        return (2*this.valor1)+(2*this.valor2);
    }//fin metodo getPerimetro
}//fin clase rectangulo extends figurasgeometricas
