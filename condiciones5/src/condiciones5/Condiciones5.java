package condiciones5;
import java.util.Scanner;
public class Condiciones5 {
    public static void main(String[] args) {
        /*Hacer un programa que pida 3 numeros, y que diga
        cual es el mayor de ellos; pero utilizando
        el operador logico AND
        Si los 3 numeros son iguales entonces decirlo.*/
        double a,b,c, mayor = 0;
        Scanner s = new Scanner(System.in);
        //entrada de datos
        System.out.print("A: ");
        a = s.nextDouble();
        System.out.print("B: ");
        b = s.nextDouble();
        System.out.print("C: ");
        c = s.nextDouble();
        //procesamiento y salida
        if( a >= b && a >= c ) mayor = a;
        if( b >= a && b >= c ) mayor = b;
        if( c >= a && c >= b ) mayor = c;
        
        if( a == b && a == c && b == c )
            System.out.println("Los tres son iguales");
        else
            System.out.println("El mayor es "+mayor);
    }
    
}
