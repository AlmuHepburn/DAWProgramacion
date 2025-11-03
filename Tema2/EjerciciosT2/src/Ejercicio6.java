import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args){

        Scanner lectorTeclado= new Scanner(System.in);
        System.out.println("Introduce el precio del producto:");
        double precio= lectorTeclado.nextDouble();
        System.out.println("Introduce el porcentaje de descuento:");
        int descuento= lectorTeclado.nextInt();
        double descuentoAplicado= (precio*descuento/100);
        double precioFinal= precio-descuentoAplicado;
        System.out.println("Precio original: "+precio+"€");
        System.out.println("Descuento ("+descuento+"%): "+descuentoAplicado+"€");
        System.out.println("Precio final: "+precioFinal+"€");

        lectorTeclado.close();

    }
}
