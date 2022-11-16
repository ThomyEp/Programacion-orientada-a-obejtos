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
public class MetodosDeOrdenamiento {
    public  void ordenamientoBurbuja1(int []v){
        for (int i=0;i<v.length;i++){
            for (int j=i+1; j<v.length;j++){
                if(v[i]>v[j]){ //forma ascendente >0
                    int tmp;
                    tmp=v[i];
                    v[i]=v[j];
                    v[j]=tmp;
                    
                }
            }
        }
    }
    //Metodo Burbuja2
    public  void ordenamientoBurbuja2(int []v){
        for (int i=0;i<v.length;i++){
            for (int j=i+1; j<v.length-1;j++){
                if(v[j]>v[j+1]){ //forma ascendente >0
                    int tmp;
                    tmp=v[j];
                    v[j]=v[j+1];
                    v[j+1]=tmp;
                    
                }
            }
        }
    }
    //Metodo QuickShort
    public void ordenamientoQuick(int[] v, int izq, int der) {
         int temp;
        int inicio=izq;
        int fin=der;
        int pivote=v[izq];
        while(inicio<fin){
            while((v[inicio]<=pivote) && (inicio<fin)){
                inicio++;
            }
             while(v[fin]>pivote){
                fin--;
            }
             if (inicio<fin) {
                temp=v[inicio];
                v[inicio]=v[fin];
                v[fin]=temp;       
            }
        }
         v[izq]=v[fin];
         v[fin]=pivote;   
        if (izq<fin-1) {
             ordenamientoQuick(v,izq,fin-1);
             }
        if (fin+1<der) {
            ordenamientoQuick(v, fin+1, der);
        }
    }
    //Metodo de Insercion
    public void ordenamientoInsercion(int [] v){
        for (int i = 0; i < v.length; i++) {
            int temp=v[i];
            int j;
            for ( j = i-1; j >=0 && v[j]>temp; j--) {
                v[j+1]=v[j];
            }
             v[j+1]=temp;
        }
    }
    //Metodo de Seleccion
    public void ordenamientoSeleccion(int a[]){
           int i ;
           int j;
           int menor;
           int pos;
           int temp;
            for(i=0; i<a.length-1; i++){
                  menor = a[i];
                  pos = i;
                 for(j=i+1; j<a.length; j++){
                     if (a[j]<menor) {
                         menor = a[j];
                         pos = j;
                     }
                }  
            if (pos != i) {
             temp = a[i];
             a[i] = a[pos];
             a[pos] = temp;
            }      
         }
     }
    //Metodo Shellsort
    public void ordenamientoShellSort(int A[]){
        int salto, aux, i;
        boolean cambios;
  
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < A.length; i++)   // se da una pasada
                {
                    if (A[i - salto] > A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
     }
    //Metodo Radix
    public void ordenamientoRadix(int a[]){
         int x;
         int i; 
         int j;
         for(x=Integer.SIZE-1;x>=0;x--){
           int aux[]=new int[a.length];
           j=0;
             for (i=0;i<a.length;i++) {
                 boolean mover=a[i] << x >=0;
                 if (x==0 ? !mover:mover) {
                     aux[j]=a[i];
                     j++;
                 }else{
                     a[i-j]=a[i];
                 }
             }
             for (i=j;i<aux.length;i++) {
                 aux[i]=a[i-j];     
             }
             a=aux;
         }
         imprime(a);
     }
    
    public int[] ordenamientoMerge(int a[], int primero, int ultimo){
        int cen;
        if (primero<ultimo ) {
            cen = (primero+ultimo)/2;
            ordenamientoMerge(a, primero, cen);
            ordenamientoMerge(a, cen+1, ultimo);
            mezclando(a, primero, cen, ultimo);
        }//fin if
        return a;
        
    }//fin ordenamiento merge
    public void mezclando(int []a, int izda, int ned,int dcha){
      int tmp [] = new int[a.length];
      int x;
      int y;
      int z;
      x = z = izda;
      y = ned +1;
           while (x<=ned && y<=dcha) {
               if (a[x] <= a[y]) {
                   tmp[z++]=a[x++];
               }else{
                   tmp[z++] = a[y++];
        }
 
        }//fin while
        while (x<= ned) {            
            tmp[z++] = a[x++];
        }
        while (y<= dcha) {            
            tmp[z++] = a[y++];
        }
        System.arraycopy(tmp,izda, a,izda, dcha-izda+1);
    }
    //imprimir vector
    public void imprime(int a[]){
       for(int i=0; i<a.length; i++){
        System.out.println(a[i]+"\t");
        }
    } 
}
