
package practicanº5poo;
public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private Integer aniosExperencia;

    public Masajista(String titulacion, Integer aniosExperencia, Integer id, String nombre, String apellido, Integer edad) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperencia = aniosExperencia;
    }
    public String getTitulacion() {
        return titulacion;
    }
    public Integer getAniosExperencia() {
        return aniosExperencia;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public void setAniosExperencia(Integer aniosExperencia) {
        this.aniosExperencia = aniosExperencia;
    } 
    @Override
   public void entrenamiento(){
       System.out.println(nombre+" "+apellido+" -> Da asistencia a un entrenamiento");    
   } 
   public void darMasajes(){
       System.out.println(nombre+" "+apellido+" -> Proporciona masajes");
   }
    @Override
    public String toString() {
        return super.toString()+"Titulacion: "+titulacion+"\nAños de experiencia "+aniosExperencia; //
    }        
}
