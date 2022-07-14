
package practicanº5poo;

public class Entrenador extends SeleccionFutbol{
    private Integer idFederacion;

    public Entrenador(Integer idFederacion, Integer id, String nombre, String apellido, Integer edad) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }//TODO -- construtor

    public Integer getIdFederacion() {
        return idFederacion;
    }
    
    @Override
    public void entrenamiento() {
        System.out.println( nombre+" "+apellido+" -> Dirige un entrenamiento" );   
    }//TODO -- entrenamiento
    public void planificarEntrenamiento(){
        System.out.println("Lunes:Piernas\nMartes:Cancha\nMiercoles:Ejercicios anaerobicos\nJueves:Ejercicio arobico\nViernes:Partido");
    }
    @Override
    public void partidoFutbol(){
        System.out.println(nombre+" "+apellido+" -> Dirige un partido");
    }

    @Override
    public String toString() {
        return super.toString()+"ID Federacion: "+idFederacion; 
    }
    
}//TODO -- class
