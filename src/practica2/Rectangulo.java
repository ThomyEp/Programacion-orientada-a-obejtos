/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2;

/**
 *
 * @author alumnos
 */
public class Rectangulo {
    private int ancho;
    private int largo;

    public Rectangulo() {
    }

    public Rectangulo(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
   
    public void areaRectangulo(){
        int area;
            area=largo*ancho;
        System.out.println("El area del rectangulo es: "+area);
    }
     public void perimetroRectangulo(){
         int perimetro;
        perimetro=(2*largo)+(2*ancho);
         System.out.println("El perimetro del rectangulo es: "+perimetro);
    }
}
