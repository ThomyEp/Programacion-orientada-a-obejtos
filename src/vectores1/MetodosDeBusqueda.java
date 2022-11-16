/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores1;

/**
 *
 * @author Usuario
 */
public class MetodosDeBusqueda {
     //Metodo de busqueda lineal
     boolean bandera=false;
      int posicion=0, i;
    public void busquedaLineal(int []v, int elemento){
         
        for ( i = 0; i < v.length; i++) {
            if (v[i]==elemento) {
                 bandera=true;
                 posicion=i;          
            } 
        }
        if(bandera==true){
        System.out.println("El elemento: "+elemento+" se encuentra en la posicion: "+posicion);  
             }
        else{
            System.out.println("El elemento no existe");
        }
    }
    //Metodo de busqueda binaria
    public int busquedaBinaria(int []v,int elemento){ //Busqueda binaria
       int centro;
       int primero=0;
       int ultimo=v.length-1;
       int ValorCentro;
       while(primero<=ultimo){
           centro=(primero+ultimo)/2;
           ValorCentro=v[centro];
           //System.out.println("Comparando a "+elemento+" con "+a[centro]);
           if (elemento==ValorCentro) {
               return centro;               
           }else if (elemento<ValorCentro) {
               ultimo=centro-1;
           }else{
               primero=centro+1;
           }
       }
       return  -1;
    }
}
