
package tallerpolimorfismo;


public class TallerPolimorfismo {

    
    public static void main(String[] args) {
        // TODO code application logic here
    Vehiculo carro;
    //String matricula, String marca, String modelo, String color, double tarifa, boolean disponible
    carro=new Turismo("1234", "SUZUKI", "S-croos", "Blanco", 25000, true);
        System.out.println(carro.getClass());
        System.out.println("MATRICULA: "+carro.getMatricula());
        System.out.println("MARCA: "+carro.getMarca());
        System.out.println("MODELO: "+carro.getModelo());
        System.out.println("COLOR: "+carro.getColor());
        System.out.println("TARIFA: "+carro.getTarifa());
        System.out.println("DISPONIBILIDAD: "+carro.isDisponible());
        System.out.println(carro.getAtributos());
        System.out.println("\n");
    //String matricula, String marca, String modelo, String color, double tarifa, boolean disponible
    carro=new Deportivo("5678", "TOYOTA", "COROLA", "AZUL", 500000, true);
        System.out.println(carro.getClass());
        System.out.println("MATRICULA: "+carro.getMatricula());
        System.out.println("MARCA: "+carro.getMarca());
        System.out.println("MODELO: "+carro.getModelo());
        System.out.println("COLOR: "+carro.getColor());
        System.out.println("TARIFA: "+carro.getTarifa());
        System.out.println("DISPONIBILIDAD: "+carro.isDisponible());
        System.out.println("CILINDRAJE: "+carro.getAtributos());
        System.out.println("\n");
    //int carga, int volumen, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible    
    carro=new Furgoneta("91011", "HYUNDAI", "H-350", "NEGRA", 35000, true);
        System.out.println(carro.getClass());
        System.out.println("MATRICULA: "+carro.getMatricula());
        System.out.println("MARCA: "+carro.getMarca());
        System.out.println("MODELO: "+carro.getModelo());
        System.out.println("COLOR: "+carro.getColor());
        System.out.println("TARIFA: "+carro.getTarifa());
        System.out.println("DISPONIBILIDAD: "+carro.isDisponible());
        System.out.println("CILINDRAJE: "+carro.getAtributos());
        System.out.println("\n");
    }
    
}
