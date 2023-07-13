package string08;
import java.util.Scanner;
public class String08 {
    public static void main(String[] args) {
        //metodo REPLACE
        //reemplaza texto dentro de un String sin ignorar mayusc./minusc.
        String str = "Roja es la Manzana, la manzana es Roja.";
        System.out.println("Contenido de str: "+str);
        
        //reemplazar Roja por Verde alterando la cadena original
        str = str.replace("Roja", "Verde");
        System.out.println("Contenido de str: "+str);
        
        //reemplazar Manzana por Pera
        str = str.replace("Manzana", "Pera");
        System.out.println("Contenido de str: "+str);
        
        //remplazar Manzana por Pera, ignorando mayusc./misnuc.
        //OJO: esto altera el character casing del String
        str = str.toLowerCase().replace("manzana", "Pera");
        System.out.println("Contenido de str: "+str);
        
        /*leer un String y luego reemplazar todas las letras a por 4,
        toas las letras e por 3 y todas las letras i por 1 alterando
        el String original ignorando mayusc/minusc., luego imprimirla.
        ejemplo:
        Digitar String: ArlequiN
        Resultado: 4rl3qu1N*/
        Scanner s = new Scanner(System.in);
        System.out.print("Digitar String: ");
        str = s.nextLine();
        
        str = str.replace("a", "4");
        str = str.replace("A", "4");
        str = str.replace("e", "3");
        str = str.replace("E", "3");
        str = str.replace("i", "1");
        str = str.replace("I", "1");
        
        //str = str.replace("a", "4").replace("A", "4").replace("e", "3").replace("E", "3").replace("i", "1").replace("I", "1");
        
        System.out.println("String luego de reemaplazar: "+str);
        
        /*leer una cadena de texto, y reemplazar dentro de ella todos
        los espacios en blanco por guiones bajos, ejemplo:
        Digitar String: Gerardo Josue Portillo
        resultado: Gerardo_Josue_Portillo*/
        System.out.print("Digitar String: ");
        str = s.nextLine();
        
        str = str.replace(" ", "_");
        System.out.println("resultado: "+str);
    }    
}
