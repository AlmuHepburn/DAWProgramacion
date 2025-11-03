import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args){

        //Ejercicio 7
        System.out.println("Ejercicio 7\n");

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre y apellido:");
        String nombreApellido = lectorTeclado.nextLine();
        System.out.println("Introduce tu edad:");
        int edad = lectorTeclado.nextInt();
        System.out.println("Introduce la ciudad donde vives:");
        String ciudad = lectorTeclado.next();

        System.out.println("¡Hola! Me llamo "+nombreApellido+".");
        System.out.println("Tengo "+edad+" años y vivo en "+ciudad);

        lectorTeclado.close();



    }


}
