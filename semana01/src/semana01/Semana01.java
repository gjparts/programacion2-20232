/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana01;

/**
 *
 * @author Gerardo
 */
public class Semana01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //imprime texto en la consola de sistema y hace una nueva linea
        System.out.println("Hola UNAH");
        System.out.println("Ingenieria en Sistemas");
        //imprime texto en la consola de sistema y no hace nueva linea
        System.out.print("Soy Gerardo Portillo");
        System.out.print("Vivo en SPS");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Texto");
        System.out.print("Soy Gerardo\nVivo en SPS\n");
        System.out.println("Num\tNombre\tEdad");
        System.out.println("1\tJosue\t10");
        System.out.println("2\tViena\t14");
        System.out.println("3\tIrene\t40");
        System.out.println("");
        //declaracion de variables
        double x = 10.0/3.0;
        System.out.println(x);
        float y = 10.0f/3.0f;
        System.out.println(y);
        System.out.println(Math.PI);
        
        int a;
        a = 12;
        int b = 17;
        int c = 45, d = 100, e = 90, f, g = 1;
        System.out.println("el valor de a es "+a);
        System.out.println("el valor de c es "+c);
        //f no tiene un valor por lo tanto no se puede imprimir:
        //System.out.println("el valor de f es "+f);
        
        double d1 = 100.5;
        //d4 inicializa con PI elevado al cubo
        double d2, d3 = 70.345677, d4 = Math.pow(Math.PI,3);
        double d5 = d1+d3;
        System.out.println("el valor de d1 es "+d1);
        System.out.println("el valor de d4 es "+d4);
        System.out.println("el valor de d5 es "+d5);
        //como sacamos la raiz cubica de 27?
        double d6 = Math.pow(27, 1.0/3.0);
        System.out.println("el valor de d6 es "+d6);
        //raiz cuadada de d3
        System.out.println("la raiz cuadrada de d3 es "+Math.sqrt(d3));
        //al momento de imprimir calculare la suma de d1 y d4
        System.out.println("suma de d1 y d4: "+(d1+d4) );
        
        float f1 = 3.4567f;
        float f2 = 4.0f, f3, f4 = f1*5.2f;
        System.out.println("el valor de f1 es "+f1);
        System.out.println("el valor de f2 es "+f2);
        System.out.println("el valor de f4 es "+f4);
        System.out.println("La suma de f2 y f4 es: "+(f2+f4));
        //la raiz cuadra de f2 pero usando float
        float raizf2 = (float)Math.sqrt(f2);
        System.out.println("la raiz de f2 es "+raizf2);
        
        System.out.println( "La resta de "+f2+" menos "+f1+" es "+(f2-f1) );
        
        int e1 = 5, e2 = 2;
        System.out.println("El cociente de la division entera de 5 entre 2 es "+(5/2));
        System.out.println("El residuo de la division entera de 5 entre 2 es "+(5%2));
    }
    
}
