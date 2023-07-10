package string06;
import java.util.Scanner;
public class String06 {
    public static void main(String[] args) {
        //Analizar una cadena caracter por caracter
        String nombre = "Estebancito Maravilla";
        System.out.println("Primer caracter: "+nombre.charAt(0));
        System.out.println("Quinto caracter: "+nombre.charAt(4));
        //lo siguiente da error porque no puede obtener un char 
        //en una posicion que no existe.
        //System.out.println("Test: "+nombre.charAt(10000));
        
        System.out.println("El ultimo caracter: "+nombre.charAt( nombre.length()-1 ));
        
        //leer una cadena de texto y mostrar cuantas veces sale la vocal a
        //dentro de ella, ignorando mayusculas y minusculas.
        Scanner s = new Scanner(System.in);
        String str;
        System.out.print("Digitar una cadena: ");
        str = s.nextLine();
        
        //contar las veces que sale la vocal a
        int contador = 0;
        for( int i = 0; i < str.length(); i++ ){
            if( str.charAt(i) == 'a' || str.charAt(i) == 'A' ) //if( str.toLowerCase().charAt(i) == 'a' )
                contador++;
        }
        System.out.println("La cadena tiene la vocal a "+contador+" veces.");
    }    
}
