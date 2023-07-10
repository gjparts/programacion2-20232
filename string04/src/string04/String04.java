package string04;
public class String04 {
    public static void main(String[] args) {
        //conversiones
        //convertir de String a numero
        //de String a Entero
        String cadena1 = "100";
        int entero1;
        entero1 = Integer.parseInt(cadena1);
        System.out.println("cadena1: "+cadena1);
        System.out.println("entero1: "+entero1);
        
        //de String a Float
        String cadena2 = "4.5675";
        float flotante1;
        flotante1 = Float.parseFloat(cadena2);
        System.out.println("cadena2: "+cadena2);
        System.out.println("flotante1: "+flotante1);
        
        //de String a Double
        String cadena3 = "3.141545";
        double doble1;
        doble1 = Double.parseDouble(cadena3);
        System.out.println("cadena3: "+cadena3);
        System.out.println("doble1: "+doble1);
        
        //de numero a String
        String cadena4, cadena5, cadena6;
        int entero2 = 91;
        float flotante2 = 8.459877f;
        double doble2 = 3.1416;
        cadena4 = String.valueOf(entero2);
        cadena5 = String.valueOf(flotante2);
        cadena6 = String.valueOf(doble2);
        System.out.println("cadena4: "+cadena4);
        System.out.println("entero2: "+entero2);
        System.out.println("cadena5: "+cadena5);
        System.out.println("flotante2: "+flotante2);
        System.out.println("cadena6: "+cadena6);
        System.out.println("doble2: "+doble2);
    }    
}
