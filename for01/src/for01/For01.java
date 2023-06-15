package for01;

public class For01 {

    public static void main(String[] args) {
        //1) imprimir los numeros del 1 al 10 de uno en uno
        //hace 10 iteraciones
        for( int i = 1; i <= 10; i++ )
            System.out.println(i);
        
        //2) imprimir los numeros del 0 al 50 de dos en dos
        //hace 26 iteraciones
        System.out.println("**************");
        for( int i = 0; i <= 50; i+=2 )
            System.out.println(i);
        
        //3) imprimir los numeros del 0 al 50 de cinco en cinco
        //hace 11 iteraciones
        System.out.println("**************");
        for( int i = 0; i <= 50; i+=5 )
            System.out.println(i);
        
        //hace 51 iteraciones (ineficiente pero no incorrecto)
        System.out.println("**************");
        for( int i = 0; i <= 50; i++ )
        {
            if( i%5 == 0 )
                System.out.println(i);
        }
        
        //4) recorrer los numeros del 0 al 50;
        //pero solo imprimir los numeros impares.
        System.out.println("**************");
        //hacer 51 iteraciones (la peticion del cliente es ineficiente)
        for( int i = 0; i <= 50; i++ )
        {
            if( i%2 == 1 )
                System.out.println(i);
        }
        System.out.println("**************");
        //una solucion eficiente
        //hace 25 iteraciones
        for( int i = 1; i <= 49; i+=2 )
            System.out.println(i);
        
        /*5) imprimir los numeros del 1 al 100;
        colocar un asterisco a la derecha de
        aquellos numeros que son multiplo de 10*/
        System.out.println("**************");
        for( int i = 1; i <= 100; i++ )
        {
            if( i%10 == 0 )
                System.out.println(i+"*");
            else
                System.out.println(i);
        }
        
        //otra forma
        System.out.println("**************");
        for( int i = 1; i <= 100; i++ )
        {
            System.out.print(i);
            if( i%10 == 0 )
                System.out.print("*");
            
            System.out.println();
        }
        
        //usando operador ternario (tema opcional de clase)
        System.out.println("**************");
        for( int i = 1; i <= 100; i++ )
            System.out.println( i+( i%10 == 0 ? "*" : "" ) );
        
        //en los tres casos anteriores son 100 iteraciones
        
    }
    
}
