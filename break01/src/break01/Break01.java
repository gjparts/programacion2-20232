package break01;
import java.util.Scanner;
public class Break01 {
    public static void main(String[] args) {
        /*Hacer un programa que lea 100 numeros positivos, al finalizar la lectura
        el programa mostrara la suma de los numeros positivos leidos.
        -> si durante la lectura de los 100 numeros se digitara un numero menor
        que cero entonces no continuar con la lectura de los numeros.
        -> desarrollarlo utilizando una estructura de repeticion for.*/
        //FORMA 1
        Scanner s = new Scanner(System.in);
        double numero;      //variable temporal para leer numeros
        double suma = 0;    //acumulador
        
        //100 iteraciones (potencialmente)
        for( int i = 1; i <= 100; i++ ){
            System.out.print("Digitar numero positivo: ");
            numero = s.nextDouble();
            
            if( numero >= 0 )
                suma += numero;
            else
                break;  //se termina la estructura for y la lectura
        }
        System.out.println("La suma de los positivos leidos es: "+suma);
    }
    
}
