package condiciones4;

import java.util.Scanner;
public class Condiciones4 {

    public static void main(String[] args) {
        /*Leer las 3 calificaciones parciales y mostrar el
        promedio obtenido en la clase.
        En la nota de promedio no se permite numeros decimales, debera
        redondear al proximo entero.
        Si el promedio es mayor o igual a 65 mostrar mensaje APROBADO
        sino, mostrar el mensaje REPROBADO*/
        Scanner s = new Scanner(System.in);
        double a,b,c;
        System.out.print("Primer Parcial: ");
        a = s.nextDouble();
        System.out.print("Segundo Parcial: ");
        b = s.nextDouble();
        System.out.print("Tercer Parcial: ");
        c = s.nextDouble();
        
        double promedio = (a+b+c)/3;
        promedio = Math.round(promedio);
        System.out.println("El promedio es: "+promedio);
        
        if( promedio >= 65 )
            System.out.println("APROBADO");
        else
            System.out.println("REPROBADO");
    }
    
}
