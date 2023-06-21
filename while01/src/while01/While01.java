package while01;
public class While01 {
    public static void main(String[] args) {
        /*imprimir los numeros del 1 al 10 de uno en uno*/
        //declarar la variable de control e inicializarla
        //while (pregunta primero, hace despues)
        int x = 1;
        while( x <= 10 ){
            System.out.println(x);
            x++;
        }
        System.out.println("Adios");
        
        //do-while (hace primero, pregunta despues)
        int y = 1;
        do{
            System.out.println(y);
            y++;
        }while(y <= 10);
        System.out.println("Adios");
    }
    
}
