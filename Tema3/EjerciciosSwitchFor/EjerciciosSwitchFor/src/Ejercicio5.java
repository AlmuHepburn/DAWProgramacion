import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número del mes (1-12)");
        int mes = scanner.nextInt();
        switch (mes) {
            case 12,1,2 ->{
                System.out.printf("El mes %d corresponde a: Invierno\n",mes);
            }
            case 3,4,5 ->{
                System.out.printf("El mes %d corresponde a: Primavera\n",mes);
            }
            case 6,7,8 ->{
                System.out.printf("El mes %d corresponde a: Verano\n",mes);
            }
            case 9,10,11 ->{
                System.out.printf("El mes %d corresponde a: Otoño\n",mes);
            }
            default ->
                System.out.println("Valor introducido no valido");
        }
        scanner.close();

    }
}
