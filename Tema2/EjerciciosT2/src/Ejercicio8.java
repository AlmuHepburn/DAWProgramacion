import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args){

        Scanner lectorNumeros= new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int op1= lectorNumeros.nextInt();
        System.out.println("Introduce el segundo número:");
        int op2= lectorNumeros.nextInt();
        System.out.println("Introduce el tercer número:");
        int op3= lectorNumeros.nextInt();
        int suma= op1+op2+op3;
        double promedio= (double)suma/3;
        double resultado= (double)(op1 * op2)/op3;
        System.out.println("Suma de los tres números: "+suma);
        System.out.printf("Promedio: %.1f\n",promedio);
        System.out.printf("Resultado de (número1 * número2) / número3: %.1f",resultado);

        lectorNumeros.close();

    }
}
