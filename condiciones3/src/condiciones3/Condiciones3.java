package condiciones3;

import java.util.Scanner;
public class Condiciones3 {
    public static void main(String[] args) {
        /*determinar si un numero entero digitado es par o impar
        imprimir tambien si el numero es multiplo de 5 o no*/
        Scanner s = new Scanner(System.in);
        int numero;
        System.out.print("Digitar un numero entero: ");
        numero = s.nextInt();
        
        if( numero%2 == 0 )
            System.out.println("El numero es par");
        else
            System.out.println("El numero es impar");
        
        if( numero%5 == 0 )
            System.out.println("Es multiplo de 5");
        else
            System.out.println("No es multiplo de 5");
    }
    
}
