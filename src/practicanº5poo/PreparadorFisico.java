/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicanº5poo;

/**
 *
 * @author Usuario
 */
public class PreparadorFisico extends SeleccionFutbol{
    private String experienciaEquipos;
    private Integer codigoProfesional;

    public PreparadorFisico(String experienciaEquipos, Integer codigoProfesional, Integer id, String nombre, String apellido, Integer edad) {
        super(id, nombre, apellido, edad);
        this.experienciaEquipos = experienciaEquipos;
        this.codigoProfesional = codigoProfesional;
    }
    public void planPreparacion() {
        System.out.println( "Resistencia : aeróbica y anareóbica.\n" +
                        "Fuerza: De resistencia, explosiva y máxima.\n" +
                        "Coordinación: técnica de carrera.\n" +
                        "Flexibilidad.\n" +
                        "Ejercicios Preventivos." );
    }
    @Override
    public void entrenamiento(){
        System.out.println( nombre+ " " +apellido+ " -> prepara al equipo antes del entrenamiento" );
    }

    @Override
    public String toString() {
        return super.toString()+ "\nExperiencia equipos: " +experienciaEquipos+ "\nCodigo progresional: " +codigoProfesional; 
    }
}
