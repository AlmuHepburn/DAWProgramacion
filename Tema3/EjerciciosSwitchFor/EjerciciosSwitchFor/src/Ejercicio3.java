import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int op1= scanner.nextInt();
        System.out.println("Introduce el segundo número");
        int op2= scanner.nextInt();
        System.out.println("Introduce la operación");
        String operacion= scanner.next();
        double resultado=0;
        switch (operacion){
            case "+"->{
                resultado=op1+op2;
                System.out.printf("Resultado: %d %s %d = %.0f\n",op1,operacion,op2,resultado);
            }
            case "-"->{
                resultado=op1-op2;
                System.out.printf("Resultado: %d %s %d = %.0f\n",op1,operacion,op2,resultado);
            }
            case "*"->{
                resultado=op1*op2;
                System.out.printf("Resultado: %d %s %d = %.0f\n",op1,operacion,op2,resultado);
            }
            case "/"->{
                resultado=(double)op1/op2;
                System.out.printf("Resultado: %d %s %d = %.1f\n",op1,operacion,op2,resultado);
            }
            default -> {
                System.out.println("Operación introducida no valida");

            }
        }
        scanner.close();

    }
}
