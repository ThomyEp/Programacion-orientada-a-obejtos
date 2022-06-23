package talleriteratorhashtable;
import java.util.Hashtable;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;
public class TallerIteratorHashTable {
   public static void main(String[] args) {
        // TODO code application logic here
       Scanner info=new Scanner(System.in);
       Hashtable<String, String> tabla = new Hashtable<>();
       String str;
       String ci;
       String nom;
       int cant;
       System.out.print("Ingrese la cantidad de datos que desea ingresar: ");
       cant=info.nextInt();
       for (int i = 0; i < cant; i++) {
           System.out.print("Ingrese el nombre de la persona "+(i+1)+" : ");
           nom=info.next();
           System.out.print("Ingrese el numero de cedula "+(i+1)+" : ");
           ci=info.next();
           tabla.put(nom, ci);
       }
           System.out.println("Contenido de Hashtable:");
            Set<String> keys = tabla.keySet();
            Iterator<String> itr = keys.iterator();
        //imprimir nombre y cedula
        System.out.println("Nombre \t\t Cedula");
        while (itr.hasNext()) { 
       //Obtener la cedula
        str= itr.next();
            System.out.println(str+"\t\t "+tabla.get(str));
         } 
        System.out.print("Ingrese el Nombre del dato que desea buscar: ");
        String x;
        x=info.next();
        if (tabla.containsKey(x)) {
            System.out.print(x+ " Si existe en la tabla ");
       }else{
            System.out.println(x+" No existe");
        }
        System.out.println(x+" y su cedula: "+tabla.get(x));
        itr.remove();
        System.out.println("Elementos después de remover Iterator:");
        itr = keys.iterator();
        System.out.println("Nombre \t\t Cedula");
        while(itr.hasNext()){
          str= itr.next(); 
          System.out.println(str+"\t\t "+tabla.get(str));
        }
    }
  
    
}
