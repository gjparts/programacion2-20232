package for04;
import java.util.Scanner;
public class For04 {
    public static void main(String[] args) {
        /*Hacer un programa que pida al usuario 10 numeros,
        al finalizar el programa imprimira la suma de esos
        10 numeros, asi como cual es el mayor y el menor de los 10 numeros.*/
        Scanner s = new Scanner(System.in);
        double suma = 0;    //acumulador
        double numero;      //numero a leer en cada iteracion
        //variable bandera para el mayor numero leido, se inicializa
        //en el numero mas pequeño permitido por mi arquitectura
        double mayor = Double.MIN_VALUE;
        //variable bandera para el menor numero leido, se inicializa
        //en el numero mas grande permitido por mi arquitectura
        double menor = Double.MAX_VALUE;
        
        for( int i = 1; i <= 10; i++ )
        {
            System.out.print("Digitar numero: ");
            numero = s.nextDouble();
            
            suma += numero;
            
            if( numero > mayor )
                mayor = numero;
            
            if( numero < menor )
                menor  = numero;
        }
        System.out.println("Suma: "+suma);
        System.out.println("Mayor: "+mayor);
        System.out.println("Menor: "+menor);
    }
    
}
