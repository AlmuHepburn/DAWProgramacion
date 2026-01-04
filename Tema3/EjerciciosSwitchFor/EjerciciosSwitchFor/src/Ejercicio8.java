import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int contadorPares = 0;
        int contadorImpares = 0;
        System.out.println("Introduce un número");
        int numero = scanner.nextInt();
        for (int i = 1; i <= numero; i++) {
            if(i%2==0){
                contadorPares = contadorPares+1;

            }else{
                contadorImpares = contadorImpares+1;
            }

        }
        System.out.println("Recorriendo números del 1 al "+numero);
        System.out.println("Número pares encontrados: "+contadorPares);
        System.out.println("Número impares encontrados: "+contadorImpares);
    }
}
