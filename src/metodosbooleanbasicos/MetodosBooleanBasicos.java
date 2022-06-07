/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodosbooleanbasicos;

/**
 *
 * @author alumnos
 */
public class MetodosBooleanBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       boolean b=true;
       Boolean dato=new Boolean(b);
       String s="true";
       Boolean dato1=new Boolean(s);
       boolean c1=dato1.booleanValue();
       System.out.println("El valor de bolean:" +dato1);
        System.out.println("El valor de boolean: "+c1); 
        
    }
    
}
