import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma = suma+i;

        }
        System.out.printf("La suma de los números del 1 al %d es: %d\n",numero,suma);
        //ESTÁ INCOMPLETO. FALTARÍA QUE SE IMPRIMA POR CONSOLA SUMANDO: 1 + 2 + 3 + 4 +5

    }
}
