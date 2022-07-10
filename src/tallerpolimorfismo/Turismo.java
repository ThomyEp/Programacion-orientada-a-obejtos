
package tallerpolimorfismo;


public class Turismo extends Vehiculo{
    public int puertas;
    public boolean marchaAuto;

    public Turismo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(matricula, marca, modelo, color, tarifa, disponible);
        this.puertas = puertas;
        this.marchaAuto = true;
    }

    public int getPuertas() {
        return puertas;
    }

    public boolean isMarchaAuto() {
        return marchaAuto;
    }
    @Override
    public String getAtributos(){
        this.puertas=5;
        this.marchaAuto=true;
        
        return ("PUERTAS: "+String.valueOf(this.puertas)+"\nMARCHA AUTOMATICA: "+String.valueOf(this.marchaAuto));
    }
}

