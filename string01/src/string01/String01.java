package string01;

public class String01 {
    public static void main(String[] args) {
        /*String (cadena de texto)
        -> es un tipo de dato compuesto (Clase)
        -> es una coleccion de Char
        -> sus char se numeran de 0 a N-1 (zero indexing)
        
        J o s u e
        0 1 2 3 4
        */
        //declaracion:
        String cadena;
        String cadena2 = "Gerardo Portillo";
        String c1 = "", c2 = "Naranja", c3;
        //impresion (para imprimir debe tener un valor de incio)
        //System.out.println(cadena);
        System.out.println(cadena2);
        //imprimir concatenando
        System.out.println("valor de c1: "+c1);
        
        //concatenar dos String generando un nuevo String
        String str1 = "UNAH", str2 = "Sistemas";
        String nueva = "Bienvenido a "+str2+" en la "+str1;
        System.out.println(nueva);
    }
    
}
