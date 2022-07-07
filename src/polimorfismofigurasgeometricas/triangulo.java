/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismofigurasgeometricas;

/**
 *
 * @author alumnos
 */
public class triangulo extends figurasGeometricas {
    private double valor2;
    public triangulo(double valor1, double valor2) { //metodo constructor
        super(valor1);
        this.valor2 = valor2;
    }//fin metodo constructor
    public double getValor2() { //getter valor2
        return valor2;
    }//fin metodo getValor2
    public void setValor2(double valor2) { //setter valor2
        this.valor2 = valor2;
    }//fin metodo setValor2
    @Override
    public double getArea() { //metodo obtener area de un triangulo
        return (this.valor1 * this.valor2) / 2;
    }//fin metodo getArea
    @Override
    public double getPerimetro() { //toma le valor de la instanciacion
        return this.valor1 + ((Math.pow(this.valor1, 2) + Math.pow(this.valor2, 2)));
    }//fin metodo getPerimetro
}//fin clase triangulo extnds figurasgeometricas
