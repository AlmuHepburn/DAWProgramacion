import java.util.Scanner;

public class EjercicioClasePintarCuadrado {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño del cuadrado");
        int tamanio = scanner.nextInt();
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if(i==0 || i==tamanio-1){
                    System.out.print("* ");
                }else if (j==0 || j== tamanio-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();


        }


        int factorial = 1;
        for (int i = 1; i <=5 ; i++) {
            factorial = factorial*i;

        }

        System.out.println("El factorial de numero es "+factorial);



    }
}
