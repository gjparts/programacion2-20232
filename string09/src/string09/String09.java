package string09;

public class String09 {
    public static void main(String[] args) {
        
        
        /*CONTAINS: permite saber si existe una cadena de texto
        de otra. Devuelve true si es verdad o falso si no es cierto.
        No ignora mayusc/minusc.*/
        String s1 = "Hay un MANGO verde en el árbol de la esquina.";
        System.out.println("String: "+s1);
        System.out.println("Las siguientes comprobaciones son sin ignorar mayusc/minusc.");
        System.out.println( "Contiene verde: "+s1.contains("verde") );
        System.out.println( "Contiene rojo: "+s1.contains("rojo") );
        System.out.println( "Contiene mango: "+s1.contains("mango") );
        System.out.println( "Contiene MANgo: "+s1.contains("MANgo") );
        System.out.println( "Contiene arbol: "+s1.contains("arbol") );
        System.out.println( "Contiene árbol: "+s1.contains("árbol") );
        System.out.println("Las siguientes comprobaciones son ignorando mayusc/minusc.");
        System.out.println( "Contiene MANgo: "+s1.toLowerCase().contains("MANgo".toLowerCase()) );
        
        //preguntar al usuario que desea buscar dentro de s1 ignorando mayusculas/misnuculas
        //si lo que el usuario desea buscar se encuentra entonces responder: "Texto encontrado"
        //del lo contrario responder: "Texto no se encontró"
        
    }   
}
