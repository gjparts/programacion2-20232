package condiciones6;
import java.util.Scanner;
public class Condiciones6 {
    public static void main(String[] args) {
        /*Uso del operador logico AND
        Leer una edad de una persona y posteriormente imprimir a que
        grupo poblacional pertenece de acuerdo a la siguiente tabla:
        GRUPO               Rango de Edad
        menor de edad       menores de 18
        mayor de edad       entre 18 y 20
        adulto              entre 21 y 59
        tercera edad        de 60 en delante*/
        int edad;
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar la edad: ");
        edad = s.nextInt();
        
        if( edad < 18 ) System.out.println("Es menor de edad");
        if( edad >= 18 && edad <= 20 ) System.out.println("Es mayor de edad");
        if( edad >= 21 && edad <= 59 ) System.out.println("Es adulto");
        if( edad >= 60 ) System.out.println("Es tercera edad");
    }
    
}
