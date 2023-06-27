package while03;
import java.util.Scanner;
public class While03 {
    public static void main(String[] args) {
        /*Hacer un programa que lea N cantidad de numeros positivos.
        La lectura de numeros terminara cuando se lea un numero negativo.
        Una vez concluida la lectura de numeros mostraremos la suma de los
        numeros positivos capturados*/
        //UTILIZANDO WHILE
        Scanner s = new Scanner(System.in);
        double numero = 123; //variable para leer numeros
                             //se inicializa con un valor que permita
                             //ingresar a while
        double suma = 0;    //variable acumulador
                             
        while( numero >= 0 )
        {
            System.out.print("Digitar un numero positivo: ");
            numero = s.nextDouble();
            
            if( numero >= 0 )   //sumar solo los positivos
                suma += numero;
        }
        System.out.println("La suma es: "+suma);
        
        //UTILIZANDO DO-WHILE
        System.out.println("************* do-while ****************");
        double cifra;   //variable para leer numeros
        double sumatoria = 0;
        
        do{
            System.out.print("Digitar un numero positivo: ");
            cifra = s.nextDouble();
            
            if( cifra >= 0 )   //sumar solo los positivos
                sumatoria += cifra;
        }while( cifra >= 0 );
        System.out.println("La suma es: "+sumatoria);
    }
    
}
