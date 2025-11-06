import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args){

        Scanner lectorTeclado= new Scanner(System.in);
        System.out.println("Introduce un número:");
        int numero= lectorTeclado.nextInt();

        if(numero%2==0){
            System.out.printf("El número %d es par\n",numero);
        }else{
            System.out.printf("El número %d es impar\n",numero);
        }

        lectorTeclado.close();

    }
}
