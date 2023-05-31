/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package captura2;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class Captura2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        double a,b,c,d;
        System.out.print("Digitar a: ");
        a = s.nextDouble();
        System.out.print("Digitar b: ");
        b = s.nextDouble();
        System.out.print("Digitar c: ");
        c = s.nextDouble();
        System.out.print("Digitar d: ");
        d = s.nextDouble();
        
        //forma 1
        double numerador = a+b;
        double denominador = c+d;
        double raiz = Math.sqrt(numerador/denominador);
        double resultado = raiz-5;
        System.out.println("Resultado: "+resultado);
        
        //forma 2
        System.out.println("Resultado: "+( Math.sqrt( (a+b)/(c+d) )-5 ) );
        
        //forma 3
        resultado = Math.sqrt( (a+b)/(c+d) )-5;
        System.out.println("Resultado: "+resultado);
    }
    
}
