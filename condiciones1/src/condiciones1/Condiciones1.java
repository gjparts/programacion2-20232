/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiciones1;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class Condiciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar el valor de a: ");
        a = s.nextInt();
        System.out.print("Digitar el valor de b: ");
        b = s.nextInt();
        
        if( a > b )
            System.out.println("El numero mayor es "+a);
        else
            if( b > a )
                System.out.println("El numero mayor es "+b);
            else
                System.out.println("Son iguales");
        
        //usando la funcion max
        if( a == b )
            System.out.println("Son iguales");
        else
            System.out.println("El mayor es: "+Math.max(a,b));
    }
    
}
