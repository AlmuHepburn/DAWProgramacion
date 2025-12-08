import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = scanner.nextInt();
        int suma = 0;
        int i = 0;
        for (i = 1; i < numero+1; i++) {
            suma = suma+i;
            System.out.printf("La suma de los números del 1 al %d es: %d\n",numero,suma);

        }
        //ESTÁ INCOMPLETO E INCORRECTO

    }
}
