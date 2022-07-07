/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismofigurasgeometricas;

/**
 *
 * @author alumnos
 */
public abstract class figurasGeometricas {
      protected double valor1;
      public figurasGeometricas(double valor1){
          super();
          this.valor1 = valor1;
      }//fin constructor

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }
    public abstract double getArea();
    public abstract double getPerimetro();
    
}//fin clase abstract figurasGeometricas
