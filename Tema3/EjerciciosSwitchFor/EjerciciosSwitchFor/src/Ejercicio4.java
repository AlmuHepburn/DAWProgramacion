import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("---MENÚ---");
        System.out.println("1. Ver perfil");
        System.out.println("2. Configuración");
        System.out.println("3. Ayuda");
        System.out.println("4. Salir");
        System.out.println("Elige una opción");
        int opcion = scanner.nextInt();
        switch (opcion){
            case 1->{
                System.out.println("Has seleccionado: Ver perfil");
            }
            case 2->{
                System.out.println("Has seleccionado: Configuración");
            }
            case 3->{
                System.out.println("Has seleccionado: Ayuda");
            }
            case 4->{
                System.out.println("Has seleccionado: Salir");
            }
            default ->{
                System.out.println("Opción no valida");
            }
        }
        scanner.close();


    }
}
