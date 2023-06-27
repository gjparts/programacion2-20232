package break02;
import java.util.Scanner;
public class Break02 {
    public static void main(String[] args) {
                /*Hacer un programa que lea 100 numeros positivos, al finalizar la lectura
        el programa mostrara la suma de los numeros positivos leidos.
        -> si durante la lectura de los 100 numeros se digitara un numero menor
        que cero entonces no continuar con la lectura de los numeros.
        -> desarrollarlo utilizando una estructura de repeticion for.*/
        //FORMA 2
        Scanner s = new Scanner(System.in);
        double numero;      //variable temporal para leer numeros
        double suma = 0;    //acumulador
        
        //100 iteraciones (potencialmente)
        for( int i = 1; i <= 100; i++ ){
            System.out.print("Digitar numero positivo: ");
            numero = s.nextDouble();
            //si el numro leido es negativo
            //se rompe la estructura
            if( numero < 0 )
                break;
            //si llego hasta aqui entonces suma el numero
            suma += numero;
        }
        System.out.println("La suma de los positivos leidos es: "+suma);
    }
    
}
