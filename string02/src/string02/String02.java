package string02;
import java.util.Scanner;
public class String02 {
    public static void main(String[] args) {
        //Captura de cadena de texto por medio de Scanner
        Scanner s = new Scanner(System.in);
        String cadena;
        
        System.out.print("Digitar cadena de texto: ");
        cadena = s.nextLine();
        
        System.out.println("Tamaño de la cadena: "+cadena.length());
        System.out.println("Version en mayusculas: "+cadena.toUpperCase());
        System.out.println("Version en minusculas: "+cadena.toLowerCase());
        System.out.println("Cadena sin relleno de espacios: "+cadena.trim());
        System.out.println("Tamaño sin relleno de espacios: "+cadena.trim().length());
        
        //IMPORTANTE: en la consola de texto cuando se viene de leer un numero
        //entero y luego se quiere leer un String con el mismo Scanner entonces
        //la consola de text hace crash, esto es un bug de sistema operativo
        //porque al leer el numero no se vacia el input buffer.
        int a;
        System.out.print("Digitar numero entero: ");
        a = s.nextInt();
        
        System.out.print("Digitar cadena de texto: ");
        //si viene de leer un numero y quiere leer un String con
        //el mismo Scanner, entonces hay que forzar el vaciado
        //del buffer de entrada:
        s.nextLine();   //llamar un nextLine sin depositar en variable.
        
        cadena = s.nextLine();
        
        System.out.println("Cadena leida: "+cadena);
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
