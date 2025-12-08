import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número");
        int numero = scanner.nextInt();
        System.out.println("Tabla del "+numero);
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d x %d = %d\n",numero,i,numero*i);

        }
        scanner.close();


    }
}
