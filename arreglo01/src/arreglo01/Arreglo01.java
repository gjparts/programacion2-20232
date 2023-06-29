package arreglo01;
import java.util.Random;
public class Arreglo01 {
    public static void main(String[] args) {
        /*Arreglo
        es una estructura de datos estática y secuencial
        que permite almacenar de forma agrupada datos
        homogéneos.
        existen dos formas de declarar arreglos:
        1) declararlo sin inicializar y posteormente ponerle datos
        2) declararlo inicializado con datos prellenados
        */
        //FORMA 1: declararlo sin inicializar y posteormente ponerle datos
        //crear un arreglo de enteros de 5 posiciones sin inicializar valores.
        int arreglo1[] = new int[5];
        //los arreglos en java numeran sus elementos usando zero indexing
        //o sea comenzando desde CERO y llegando hasta N-1
        //un arreglo de 5 posiciones numera desde 0 hasta 4
        //imprimir lo que esta almacenado en la posicion cero del arreglo
        System.out.println( arreglo1[0] );
        System.out.println( arreglo1[1] );
        System.out.println( arreglo1[2] );
        System.out.println( arreglo1[3] );
        System.out.println( arreglo1[4] );
        //notara que JAVA inicializa cada elemento de un arreglo con cero.
        //podemos cambiar los valores de cada elemento en el arreglo
        arreglo1[3] = 50;
        arreglo1[4] = 12;
        //imprimir el arreglo de forma practica
        System.out.println("******************");
        for( int i = 0; i < arreglo1.length; i++ ){
            System.out.println("indice: "+i+", valor: "+arreglo1[i]);
        }
        
        //FORMA 2: declararlo inicializado con datos prellenados
        int arreglo2[] = { 10, 5, 111, 14, 18, 92 };
        //reemplazar un valor:
        arreglo2[3] = 777;
        //imprimir el arreglo
        System.out.println("******************");
        for( int i = 0; i < arreglo2.length; i++ ){
            System.out.println("indice: "+i+", valor: "+arreglo2[i]);
        }
        
        /*Hacer un programa que tenga un arreglo unidimensional
        de numeros enteros de tamaño 25 y llenar cada uno de sus
        elementos con un numero entre 5 y 97 no importa que se repitan.
        Por ultimo imprimir el arreglo.*/
        int arreglo3[] = new int[25];
        Random azar = new Random();
        //llenar arreglo con numeros al azar.
        for( int i = 0; i < arreglo3.length; i++ ){
            arreglo3[i] = azar.nextInt(97-5+1)+5;
        }
        //imprimir el arreglo
        System.out.println("******************");
        for( int i = 0; i < arreglo3.length; i++ ){
            System.out.println("indice: "+i+", valor: "+arreglo3[i]);
        }
        
    }
    
}
