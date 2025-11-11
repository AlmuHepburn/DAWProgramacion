import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){

        Scanner lectorTeclado= new Scanner(System.in);
        System.out.println("Introduce un número (1-7): ");
        int numero= lectorTeclado.nextInt();
        switch(numero){
            case 1->{
                System.out.println("El día 1 es Lunes");
            }
            case 2->{
                System.out.println("El día 2 es Martes");
            }
            case 3->{
                System.out.println("El día 3 es Miércoles");
            }
            case 4->{
                System.out.println("El día 4 es Jueves");
            }
            case 5->{
                System.out.println("El día 5 es Viernes");
            }
            case 6->{
                System.out.println("El día 6 es Sábado");
            }
            case 7->{
                System.out.println("El día 7 es Domingo");
            }
            default -> {
                System.out.println("Número introducido no valido");
            }
        }
        System.out.println("Fin del programa");

        lectorTeclado.close();

    }
}
