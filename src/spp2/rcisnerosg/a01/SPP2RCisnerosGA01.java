/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.rcisnerosg.a01;
import java.util.Scanner;
/**
 *
 * @author Rafael
 */
public class SPP2RCisnerosGA01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double num = 1, sum = 0;
        Scanner T = new Scanner (System.in);
        while(num >0){
            try{
                num = SolicitarNumero();
                if (num>0){
                    sum = CalcularSuma(num,sum);
                }
            }
           catch (Exception ex){
               System.out.println("No teclo un número");
               System.out.println("Por favor teclea un número");
               T.next();
           }
        }
        System.out.println("La suma es " +sum);
    }
    static double SolicitarNumero(){
        double num;
        Scanner kb = new Scanner (System.in) ;
        System.out.println("Teclea un numero positivo");
        num = kb.nextDouble();
        return num;
    }
    static double CalcularSuma(double num, double sum){
        return sum = sum + num;
    }
}
