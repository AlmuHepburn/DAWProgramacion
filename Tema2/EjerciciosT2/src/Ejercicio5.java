import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args){

        Scanner lectorTeclado= new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad= lectorTeclado.nextInt();
        System.out.println("¿Tienes carnet de conducir? (true/false): ");
        boolean carnet= lectorTeclado.nextBoolean();
        boolean mayor21= edad>=21;
        System.out.println("Eres mayor de 21 años?: "+mayor21);
        System.out.println("Tienes carnet?: "+carnet);
        boolean alquiler= carnet==true && mayor21==true;
        System.out.println("¿Puedes alquilar un coche? (AND): "+alquiler);

        lectorTeclado.close();

    }
}
