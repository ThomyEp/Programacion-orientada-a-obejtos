
package practicanº5poo;


public class Futbolista extends SeleccionFutbol {
    private Integer dorsal;
    private String demarcacion;

    public Futbolista(Integer dorsal, String demarcacion, Integer id, String nombre, String apellido, Integer edad) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }//TODO -- constructor

    public Integer getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    public void entrevista() {
        System.out.println( nombre+" "+apellido+" -> Da una entrevista" );  
    }//TODO -- entrevista
    @Override
    public void entrenamiento() {
        System.out.println( nombre+" "+apellido+" -> Participa un entrenamiento" );
    }//TODO -- entrenamiento
    @Override
    public void partidoFutbol(){
        System.out.println(nombre+" "+apellido+" -> Juega un partido");
    }
    @Override
    public String toString() {
        return super.toString()+ "\nDorsal: " +dorsal+ "\nDemarcacion: " +demarcacion; 
    }//TODO -- toString  
}//TODO -- class Futbolista
