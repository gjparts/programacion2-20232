package captura3;

import java.util.Scanner;
public class Captura3 {

    public static void main(String[] args) {
        //declarar variables
        Scanner s = new Scanner(System.in);
        double a,b,c,d;
        System.out.print("Digitar valor de a: ");
        a = s.nextDouble();
        System.out.print("Digitar valor de b: ");
        b = s.nextDouble();
        System.out.print("Digitar valor de c: ");
        c = s.nextDouble();
        System.out.print("Digitar valor de d: ");
        d = s.nextDouble();
        
        //forma 1: evitando usar muchos parentesis
        double numerador, denominador, raiz;
        numerador = Math.pow(a+b-c,2);
        denominador = Math.PI*d;
        raiz = Math.sqrt(numerador/denominador);
        System.out.println("resultado: "+raiz);
        
        //forma 2, hacer el calculo en una sola instruccion
        //y almacenarlo en variable
        double resultado = Math.sqrt( ( Math.pow(a+b-c,2) )/( Math.PI*d ) );
        System.out.println("resultado: "+resultado);
        
        //forma 3, hacer el calculo en la impresion
        System.out.println("resultado: "+Math.sqrt( ( Math.pow(a+b-c,2) )/( Math.PI*d ) ));
    }
    
}
