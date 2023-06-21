package for03;
import java.util.Scanner;
public class For03 {

    public static void main(String[] args) {
        /*Hacer un programa que pida al usuario 10 numeros,
        al finalizar el programa imprimira la suma de esos
        10 numeros, asi como cual es el mayor y el menor de los 10 numeros.*/
        Scanner s = new Scanner(System.in);
        double numero;  //variable para almacenar cada numero leido
        double suma = 0;    //variable acumulador para sumar los numeros leidos.
        double mayor = 777; //variable bandera que guarda el mayor numero leido
        double menor = 777; //variable bandera que guarda el menor numero leido
        for( int i = 1; i <= 10; i++ )
        {
            System.out.print("Digitar numero: ");
            numero = s.nextDouble();
            
            //si es el primer numero que leemos (primera iteracion)
            //entonces ese numero sera el mayor y el menor de los numeros leidos.
            if( i == 1 )
            {
                mayor = numero;
                menor = numero;
            }
            else
            {
                //cualquier otra iteracion
                if( numero > mayor )    //si el numero leido supera al ultimo mayor...
                    mayor = numero; //...entonces el numero pasa a ser el nuevo mayor
                
                if( numero < menor )    //si el numero leido es inferior al ultimo menor...
                    menor = numero; //...entonces el numero pasa a ser el nuevo menor
            }
            
            suma += numero;     //suma = suma + numero;
        }
        System.out.println("La suma es: "+suma);
        System.out.println("El mayor es: "+mayor);
        System.out.println("El menor es: "+menor);
    }
}
