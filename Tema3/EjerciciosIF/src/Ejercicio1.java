import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){

        Scanner lectorTeclado= new Scanner(System.in);
        System.out.println("Dime tu edad:");
        int edad= lectorTeclado.nextInt();
        if(edad>=18){
            System.out.println("Eres mayor de edad. Puedes votar.");
        } else {
            System.out.println("No eres mayor de edad. No puedes votar.");
        }
        lectorTeclado= null;



    }
}
