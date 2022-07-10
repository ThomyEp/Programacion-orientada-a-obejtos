
package tallerpolimorfismo;

public class Deportivo extends Vehiculo{
    public int cilindraje;

    public Deportivo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(matricula, marca, modelo, color, tarifa, disponible);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }
    @Override
    public String getAtributos(){
        return String.valueOf(this.cilindraje=4);
    }
      
}
