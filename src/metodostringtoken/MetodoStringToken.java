/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodostringtoken;

import java.util.StringTokenizer;

/**
 *
 * @author alumnos
 */
public class MetodoStringToken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String token;
        String texto1="La programacion orientada a objetos";
        //Token es el espacio en blanco
        StringTokenizer tokenizer1=new StringTokenizer(texto1);
        while (tokenizer1.hasMoreElements()) {
            token=tokenizer1.nextToken();
            System.out.println("El token es: "+ token);
        }
        String texto2="Este;es;otro;texto;de;prueba";
        //Token es el punto y coma(;)
        System.out.println(texto2);
         StringTokenizer tokenizer2=new StringTokenizer(texto2,";");
        while (tokenizer2.hasMoreElements()) {
            token=tokenizer2.nextToken();
            System.out.println("El token con delimitador ; es: "+ token);
        }
        String texto3="Feliz-24-cumpleaños-Thomy-te-desean-tus-compañeros";
        //Token es el punto y coma(-)
         StringTokenizer tokenizer3=new StringTokenizer(texto3,"-");
        while (tokenizer3.hasMoreElements()) {
            token=tokenizer3.nextToken();
            System.out.println("El token con delimitador -  es: "+ token);
        }
    }
    
}
