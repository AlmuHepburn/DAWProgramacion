import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args){

        Scanner lectorTeclado= new Scanner(System.in);
        System.out.println("Introduce tu nota:");
        int nota= lectorTeclado.nextInt();
        if(nota>=0&&nota<=10){
            if(nota>=5){
                System.out.println("¡Enhorabuena! Has aprobado.");
            }else{
                System.out.println("Lo sentimos, estás suspenso.");
            }
        }else{
            System.out.println("Rango incorrecto.");
        }

        lectorTeclado=null;

    }
}