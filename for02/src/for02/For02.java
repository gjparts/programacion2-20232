package for02;
import java.util.Scanner;
public class For02 {
    public static void main(String[] args) {
        /*10) Hacer un programa que pida 10 numeros, al finalizar
        mostrar el promedio de los numeros, asi como el conteo de
        cuantos numeros pares fueron leidos y cuantos numeros impares
        fueron leidos.*/
        Scanner s = new Scanner(System.in);
        double numero;  //variable para guardar el numero recien leido
        double suma = 0;    //variable que va sumando cada numero leido
                            //variable acumulador
        double promedio;
        int pares = 0, impares = 0; //acumuladores para contar
        //repetiremos 10 veces la captura de los numeros
        for( int i = 1; i <= 10; i++ )
        {   
            //haremos 10 iteraciones
            System.out.print("Digitar numero "+i+": ");
            numero = s.nextDouble();
            //sumar el numero reciendo leido a la
            //suma de numeros
            suma = suma + numero;
            
            if( numero%2 == 0 )
                pares++;
            else
                impares++;
        }
        promedio = suma/10;
        System.out.println("El promedio es "+promedio);
        System.out.println("Cantidad de pares: "+pares);
        System.out.println("Cantidad de impares: "+impares);
    }
    
}
