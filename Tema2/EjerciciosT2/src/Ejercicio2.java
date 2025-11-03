import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        int op1= lectorTeclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        int op2= lectorTeclado.nextInt();
        boolean mayor= op1>op2;
        boolean menor= op1<op2;
        boolean igual= op1==op2;
        boolean diferente= op1!=op2;
        boolean mayorIgual= op1>=op2;
        boolean menorIgual= op1<=op2;


        System.out.println("¿"+op1+" es mayor que "+op2+"?: "+mayor);
        System.out.println("¿"+op1+" es menor que "+op2+"?: "+menor);
        System.out.println("¿"+op1+" es igual a "+op2+"?: "+igual);
        System.out.println("¿"+op1+" es diferente de "+op2+"?: "+diferente);
        System.out.println("¿"+op1+" es mayor o igual que "+op2+"?: "+mayorIgual);
        System.out.println("¿"+op1+" es menor o igual que "+op2+"?: "+menorIgual);


    }
}
