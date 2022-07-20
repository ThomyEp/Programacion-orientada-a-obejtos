
package practicanº5poo;
public class PracticaNº5Poo {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---------------Futbolista---------------");
        //Integer dorsal, String demarcacion, Integer id, String nombre, String apellido, Integer edad
        Futbolista equipo = new Futbolista(11, "delantero", 12345,"Lionel", "Messi", 22);
        System.out.println(equipo.getClass());
        System.out.println(equipo.toString());
        System.out.println("Actividades del jugador: "+equipo.getNombre()+" "+equipo.getApellido());
        equipo.concentrarse();
        equipo.viajar();
        equipo.partidoFutbol();
        equipo.entrenamiento();
        equipo.entrevista();//metodo especifico de la clase futbolista
        System.out.println("\n---------------Entrenador---------------");
        //Integer idFederacion, Integer id, String nombre, String apellido, Integer edad
        Entrenador entre= new Entrenador(1234, 1723127443, "Victor","Moran" ,45 );
        System.out.println(entre.getClass());
        System.out.println(entre.toString());
        System.out.println("Actividades del Entrenador: "+entre.getNombre()+" "+entre.getApellido());
        entre.concentrarse();
        entre.viajar();
        entre.partidoFutbol();
        entre.entrenamiento();
        entre.planificarEntrenamiento();//metodo especifico de la clase entrenador
        System.out.println("\n---------------Masajista---------------");
        //String titulacion, Integer aniosExperencia, Integer id, String nombre, String apellido, Integer edad
        Masajista masaje= new Masajista("Quiropractica",10 , 1002254215, "SUSANA", "ORIA", 32);
        System.out.println(masaje.getClass());
        System.out.println(masaje.toString());
        System.out.println("Actividades del Masajista: "+masaje.getNombre()+" "+masaje.getApellido());
        masaje.concentrarse();
        masaje.viajar();
        masaje.partidoFutbol();
        masaje.entrenamiento();
        masaje.darMasajes();
        System.out.println("\n---------------Preparador fisico---------------");
         PreparadorFisico preparador= new PreparadorFisico("Madrid, Barcelona", 1243564, 523446, "Roberto", "Gonzales", 47);
        System.out.println(preparador.getClass());
        System.out.println(preparador.toString());
        System.out.println("Actividades del preparador fisico: "+preparador.getNombre()+" "+preparador.getApellido());
        preparador.concentrarse();
        preparador.viajar();
        preparador.partidoFutbol();
        preparador.entrenamiento();
        preparador.planPreparacion();
        
    } 
}
