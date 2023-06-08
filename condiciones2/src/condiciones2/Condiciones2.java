/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condiciones2;

/**
 *
 * @author Gerardo
 */
import java.util.Scanner;
public class Condiciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*En una tienda se da un descuento de acuerdo al monto vendido.
        si el monto es mayor que 10000 entonces damos un descuento del 20%
        sobre el valor de la venta de lo contrario no damos descuento.
        Capturar el monto vendido e imprimir el valor del descuento y el
        valor final a pagar. ejemplo:

        Digitar monto vendido: 15000
        El descuento es: 3000
        El valor a pagar es: 12000

        otro ejemplo:
        Digitar monto vendido: 10000
        El descuento es: 0
        El valor a pagar es: 10000

        otro ejemplo:
        Digitar monto vendido: 5000
        El descuento es: 0
        El valor a pagar es: 5000*/
        Scanner s = new Scanner(System.in);
        double venta, descuento = 0.00;
        System.out.print("Digitar monto de lo vendido: ");
        venta = s.nextDouble();
        
        //el valor del descuento dependerá de lo vendido
        //si es mayor a 10000 entonces se otorga un 20% de descuento
        if( venta > 10000 )
            descuento = venta*0.2;
        
        System.out.println("Descuento: "+descuento);
        System.out.println("Pagar: "+(venta-descuento));
    }
    
}
