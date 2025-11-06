import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){

        Scanner lectorTeclado= new Scanner(System.in);
        System.out.println("Introduce el importe de la compra:");
        double importeCompra= lectorTeclado.nextDouble();
        double descuento= importeCompra*0.1;
        double importeFinal=0;
        String palabra= "€";

        if(importeCompra>=100){
            importeFinal=importeCompra-descuento;
            System.out.printf("Importe original: %.1f%s\n",importeCompra, palabra);
            System.out.printf("Descuento aplicado: %.1f%s\n",descuento, palabra);
            System.out.printf("Importe final: %.1f%s\n",importeFinal, palabra);

        }else{
            System.out.println("Importe mínimo no alcanzado. Esta compra no tiene descuento.");
        }

        lectorTeclado=null;

    }
}
