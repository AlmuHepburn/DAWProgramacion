import java.util.Scanner;

public class Ejercicio6 {

    public static void main(){

        Scanner lectorTeclado= new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad= lectorTeclado.nextInt();

        if(edad>=16){
            System.out.println("Acceso permitido");
        }else{
            System.out.println("Acceso denegado. Debes tener al menos 16 años.");
        }

        lectorTeclado.close();

    }
}
