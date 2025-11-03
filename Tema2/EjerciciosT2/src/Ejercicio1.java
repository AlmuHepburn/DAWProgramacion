import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner lectorTeclado= new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int op1= lectorTeclado.nextInt();
        System.out.println("Introduce el segundo número:");
        int op2= lectorTeclado.nextInt();
        int suma= op1+op2;
        int resta= op1-op2;
        int multiplicacion= op1*op2;
        double division= (double)op1/op2;
        int modulo= op1%op2;
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicación: "+multiplicacion);
        System.out.printf("División: %.2f\n",division);
        System.out.println("Módulo (resto): "+modulo);


    }
}
