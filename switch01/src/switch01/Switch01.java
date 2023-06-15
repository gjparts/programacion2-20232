package switch01;
import java.util.Random;
public class Switch01 {
    public static void main(String[] args) {
        /*Hacer un programa que genere un numero al azar
        entre 1 y 7, imprimir un nombre de color de acuerdo al numero
        generado:
        1 = Rojo, 2 = Amarillo, 3 = Azul, 4 = Verde, 5 = Violeta
        6 = Negro, 7 = Blanco
        Restriccion: usar una estructura de seleccion switch.*/
        //declarar un objeto de clase Random como generador de numeros al azar
        Random generador = new Random();
        int numero;
        //generador.nextInt(Maximo-Minimo+1)+Minimo;
        numero = generador.nextInt(7-1+1)+1;
        
        switch(numero){
            case 1:
                System.out.println("Rojo");
            break;
            case 2:
                System.out.println("Amarillo");
            break;
            case 3:
                System.out.println("Azul");
            break;
            case 4:
                System.out.println("Verde");
            break;
            case 5:
                System.out.println("Violeta");
            break;
            case 6:
                System.out.println("Negro");
            break;
            case 7:
                System.out.println("Blanco");
            break;
            default:
                System.out.println("Numero no valido");
        }
    }
    
}
