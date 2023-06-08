
package captura4;
import java.util.Scanner;
public class Captura4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x0, x1,discriminante, a, b, c;
        System.out.print("a: ");
        a = s.nextDouble();
        System.out.print("b: ");
        b = s.nextDouble();
        System.out.print("c: ");
        c = s.nextDouble();
        
        discriminante = Math.pow(b, 2)-4*a*c;
        x0 = ( -b+Math.sqrt(discriminante) )/(2*a);
        x1 = ( -b-Math.sqrt(discriminante) )/(2*a);
        
        if( discriminante < 0 )
        {
            System.out.println("No hay solucion dentro de los reales");
        }
        else
        {
            System.out.println("x0 es "+x0);        
            System.out.println("x1 es "+x1);
        } 
    }
    
}
