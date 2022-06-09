/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodobiginteger;

import java.math.BigInteger;

/**
 *
 * @author alumnos
 */
public class MetodoBigInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long potLong;
        int base=10;
        //long
        for (int exp=15 ; exp <= 25; exp++) {
            potLong=(long)Math.pow(base, exp);
            System.out.println("La potenciacion usando long de "
            +base+" ^ "+exp+" es: "+potLong);
        }
        //BigInteger
        BigInteger potBigInteger=new BigInteger(String.valueOf(base));
        for (int exp=15 ; exp <= 25; exp++) {
            System.out.println("La potencia usado BigIntegere de "
                    +base+" ^ "+exp+" es:"+potBigInteger.pow(exp) );
        }
    }
    
}
