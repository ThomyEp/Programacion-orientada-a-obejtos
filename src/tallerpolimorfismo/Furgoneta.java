
package tallerpolimorfismo;

public class Furgoneta extends Vehiculo{
    public int carga;
    public int volumen;

    public Furgoneta(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(matricula, marca, modelo, color, tarifa, disponible);
        this.carga = carga;
        this.volumen = volumen;
    }

    public int getCarga() {
        return carga;
    }

    public int getVolumen() {
        return volumen;
    }
    @Override
    public String getAtributos(){
    return ((String.valueOf(this.carga=16)+String.valueOf(this.volumen=729)));    
    }

    
}
