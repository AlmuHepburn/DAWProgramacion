import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){


        Scanner lectorTeclado= new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero = lectorTeclado.nextInt();
        if(numero>0){
            System.out.println("El número es positivo.");
        } else if(numero<0){
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero.");
        }

        lectorTeclado= null;
    }
}
