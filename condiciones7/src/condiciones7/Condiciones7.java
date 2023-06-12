package condiciones7;
import java.util.Scanner;
public class Condiciones7 {
    public static void main(String[] args) {
        /*Hacer un programa que pregunte el salario mensual de un empleado
        y su antiguedad en años.
        El programa devolverá el bono anual obtenido de
        multiplicar el salario mensual por el % de bono el cual
        sale de la tabla siguiente:

        Antigüedad			% bono
        menos de 5 años			10%
        de 5 a menos de 10 años		15%
        de 10 a menos de 20 años	20%
        20 años o mas			25%*/
        double salario, tasaBono = 0.00;
        int antiguedad;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite salario mensual: ");
        salario = s.nextDouble();
        System.out.print("Digite la antigüedad: ");
        antiguedad = s.nextInt();
        
        if( antiguedad < 5 ) tasaBono = 0.10;
        if( antiguedad >= 5 && antiguedad < 10 ) tasaBono = 0.15;
        if( antiguedad >= 10 && antiguedad < 20 ) tasaBono = 0.20;
        if( antiguedad >= 20 ) tasaBono = 0.25;
        
        System.out.println("El bono anual es: "+(salario*tasaBono));
    }
    
}
