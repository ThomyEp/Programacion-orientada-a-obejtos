
package practicanº5poo;

public abstract class SeleccionFutbol {
    protected Integer id;
    protected String nombre;
    protected String apellido;
    protected Integer edad;

    public SeleccionFutbol(Integer id, String nombre, String apellido, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }//TODO -- constructor

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getEdad() {
        return edad;
    }
    public abstract void entrenamiento(); // metodo abstracto entrenamiento 
    public void viajar () { //metodo viajar
        System.out.println( nombre+" "+apellido+" -> Viajar" );
    }//TODO -- viajar
    public void concentrarse() { //metodo concentrarse
        System.out.println( nombre+" "+apellido+" -> Concentrarse" );
    }//TODO -- concentrarse 
    public void partidoFutbol() { //metodo partidoFutbol
        System.out.println( nombre+" "+apellido+" -> Asiste al Partido de Futbol" );
    }//TODO -- partidoFutbol
    @Override
    public String toString() { //metodo to string para imprimir datos
        return "Id=" + id + "\nNombre=" + nombre + "\nApellido=" + apellido + "\nEdad=" + edad;
    }//TODO -- toString
}//TODO -- abstract class SeleccionFutbol
