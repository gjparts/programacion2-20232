package while02;

public class While02 {

    public static void main(String[] args) {
        //imprimir los numeros del 0 al 20 de dos en dos usando while.
        int z = 0;
        //este ejemplo hace 11 iteraciones 
        while( z <= 20 )
        {
            System.out.println(z);
            z += 2;
        }
        System.out.println("************************");
        //este ejemplo hace 21 iteraciones
        z = 0;
        while( z <= 20 )
        {
            if( z%2 == 0 )
                System.out.println(z);
            
            z++;
        }
    }
    
}
