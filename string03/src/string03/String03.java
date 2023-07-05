package string03;
import java.util.Scanner;
public class String03 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion = 1213;  //inicializar opcion con valor que
                            //permita ingresar al menos una vez al while
        while( opcion != 4 )
        {
            System.out.println("***********************************");
            System.out.println("1 Conversor a mayusculas");
            System.out.println("2 Conversor a minusculas");
            System.out.println("3 Longitud de cadena");
            System.out.println("4 Salir");
            System.out.print("Digitar opcion: ");
            opcion = s.nextInt();
            
           //evaluar la opcion
           switch(opcion){
               case 1:
                   System.out.println("HA PEDIDO LA OPCION 1");
               break;
               case 2:
                   System.out.println("HA PEDIDO LA OPCION 2");
               break;
               case 3:
                   System.out.println("HA PEDIDO LA OPCION 3");
               break;
               case 4:
                   System.out.println("Adios!");
               break;
               default:
                   System.out.println("Opcion no valida");
           }
        }
    }
    
}
