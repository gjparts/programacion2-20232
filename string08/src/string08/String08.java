package string08;
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
    }    
}
