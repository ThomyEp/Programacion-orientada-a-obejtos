/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnos;

/**
 *
 * @author alumnos
 */
public class Estudiante {
    int codigo;
    String nombre;
    String apellido;
    String materia;
    float promedio;
    boolean matriculado;
    //Metodos construtores       

    public Estudiante() {
        this.promedio=5;
        this.matriculado=false;
    }

    public Estudiante(int codigo, String nombre, String apellido, String materia, float promedio, boolean matriculado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.promedio = promedio;
        this.matriculado = matriculado;
    }
    //Metodos getters - consultores
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMateria() {
        return materia;
    }

    public float getPromedio() {
        return promedio;
    }

    public boolean isMatriculado() {
        return matriculado;
    }
    //Metodos setters - modificadores
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }
    //Metodos analizadores
    public void mostrarDatos(){
        System.out.println("codigo="+codigo+"\tnombre="+nombre+"\tapellido="+apellido+"\tmateria="+materia+"\tpromedio="+promedio+"\tmatriculado="+matriculado);
    }
    //Metodo toString
    @Override
    public String toString(){
        return "codigo="+this.codigo+" nombre="+this.nombre;
    }
}
