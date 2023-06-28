package pkgcontinue;
import java.util.Scanner;
public class Continue {
    public static void main(String[] args) {
        /*
        USO DE LA INSTRUCCION DE CONTROL DE FLUJO CONTINUE
        Hacer un programa que imprima los numeros del 1 al 100;
        pero no imprimir aquellos numeros que sean multiplos de 5.*/
        for( int i = 1; i <= 100; i++ ){
            if( i%5 == 0 )
                continue;   //si es multiplo de 5 se salta la iteracion.
            
            //si ha llegado hasta aqui imprime el valor de i
            System.out.println(i);
        }
        
        //otro ejemplo
        /*Leer N cantidad de numeros, sumar unicamente
        los numeros positivos.
        El programa termina al digitar un CERO.
        Si digita un numero negativo debe ignorarlo y seguir
        leyendo numeros.*/
        Scanner s = new Scanner(System.in);
        float numero;
        float suma = 0.00f;
        do{
            System.out.print("Digitar numero (cero termina el programa): ");
            numero = s.nextFloat();
            
            //si el numero es negativo se salta la iteracion
            if( numero < 0 )
                continue;
            
            suma += numero;
        }while( numero != 0 );
        System.out.println("La suma de los positivos es: "+suma);
    }
    
}
