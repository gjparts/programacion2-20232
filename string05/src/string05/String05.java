package string05;
import java.util.Scanner;
public class String05 {
    public static void main(String[] args) {
        //comparar dos cadenas de texto
        //incorrecto: no usar == o != para comparar String
        String c1 = "Pera";
        String c2 = "Pera";
        if( c1 == c2 )
            System.out.println("c1 y c2 son iguales");
        //aparentemente funciona cuando los String son valores
        //constantes (fijos) ¿Que pasaria si es el usuario quien los digita?
        Scanner s = new Scanner(System.in);
        String str1, str2;
        System.out.print("Digitar String 1: ");
        str1 = s.nextLine();
        System.out.print("Digitar String 2: ");
        str2 = s.nextLine();
        //usamos equals en lugar de == porque los String son objetos
        //y todo objeto en JAVA debe compararse con equals ya que
        //analiza las simulitudes entre dos objetos
        //en cambio == en objetos comparar que tengan la misma direccion
        //de memoria por eso no nos sirve para comparar objetos.
        if( str1.equals(str2) == true )
            System.out.println("Cadenas son iguales");
        else
            System.out.println("Cadenas no son iguales");
        
        //comparar dos cadenas de texto ignorando mayusculas/minusculas
        //forma 1: usando el metodo equalsIgnoreCase
        if( str1.equalsIgnoreCase(str2) == true )
            System.out.println("Cadenas son iguales ignorando mayusc./minusc.");
        else
            System.out.println("Cadenas no son iguales aun ignorando mayusc./minusc.");
        
        //forma 2: usando los metodos Uppercase y Lowercase
        if( str1.toUpperCase().equals( str2.toUpperCase() ) == true )
            System.out.println("Cadenas son iguales ignorando mayusc./minusc.");
        else
            System.out.println("Cadenas no son iguales aun ignorando mayusc./minusc.");
        
    }    
}
