/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package captura1;

/**
 *
 * @author Gerardo
 */
//importacion de clases que estan en librerias
import java.util.Scanner;   //clase para capturar entrada de datos
public class Captura1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //construir un objeto de clase Scanner, se le asigna memoria RAM
        //a traves del constructor que recibe como origen de entrada
        //al System.in o sea a la entrada que ocurre por medio de la consola
        //del sistema.
        Scanner lector = new Scanner(System.in);
        double a,b;
        System.out.print("Digitar el valor de a: ");
        a = lector.nextDouble();
        System.out.print("Digitar el valor de b: ");
        b = lector.nextDouble();
        
        //forma 1
        double c = a+b;
        System.out.println("La suma de ambos numeros es "+c);
        
        //forma 2
        System.out.println("La suma de ambos numeros es "+(a+b));
    }
    
}
