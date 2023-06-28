package arreglo01;
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
        System.out.println( arreglo1[4] );
        //notara que JAVA inicializa cada elemento de un arreglo con cero.
    }
    
}
