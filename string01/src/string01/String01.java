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
        
        //saber el tamaño de un String
        System.out.println("La cadena str1 tiene "+str1.length()+" caracteres");
        //volcar el tamaño de un String en una variable
        int x1 = str2.length();
        System.out.println("El tamaño de str2 es "+x1);
        
        String nombre = "Gerardo Portillo";
        System.out.println("La cadena nombre en mayusculas: "+nombre.toUpperCase());
        System.out.println("La cadena nombre en minusculas: "+nombre.toLowerCase());
        System.out.println("Contenido de la cadena nombre: "+nombre);
        //sobreescribir a nombre y dejarla permanentemente en mayusculas
        nombre = nombre.toUpperCase();
        System.out.println("Contenido de la cadena nombre: "+nombre);
        
        //trim() eliminar los espacios iniciales y finales en un String
        String verdura = "     Zanahoria verde         ";
        System.out.println("Variable verdura: ***"+verdura+"***");
        System.out.println("Tamaño del String verdura: "+verdura.length()+" chars.");
        //imprimir verdura sin relleno de espacios
        System.out.println("Variable verdura sin relleno de espacios: ***"+verdura.trim()+"***");
        System.out.println("Tamaño de verdura aplicando trim: "+verdura.trim().length());
        //verdura sigue manteniendose sin cambios:
        System.out.println("Variable verdura: ***"+verdura+"***");
        //imprimir la variable verdura sin espacios de relleno y todo en mayusculas.
        //sin alterar a la variable.
        System.out.println( "***"+verdura.trim().toUpperCase()+"***" );
        
        System.out.println("Variable verdura: ***"+verdura+"***");
        
        //convertir el contenido de la variable verdura a mayusculas y sin espacios
        //de relleno y luegro imprimirla.
        verdura = verdura.trim().toUpperCase();
        System.out.println("Variable verdura: ***"+verdura+"***");
        
    }
    
}
