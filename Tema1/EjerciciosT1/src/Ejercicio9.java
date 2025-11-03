import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        //Ejercicio9
        System.out.println("Ejercicio 9\n");

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Introduzca nombre del producto:");
        String nombreProducto= lectorTeclado.nextLine();
        System.out.println("Introduzca precio del producto:");
        double precio= lectorTeclado.nextDouble();
        System.out.println("Introduzca código de producto");
        String codigoProducto= lectorTeclado.next();
        System.out.println("¿Está disponible el producto en tienda?");
        boolean disponibilidad= lectorTeclado.nextBoolean();
        System.out.println();
        System.out.println("INFORMACIÓN DEL PRODUCTO\n-----------------------------");
        System.out.println("Nombre: "+nombreProducto);
        System.out.println("Precio: "+precio);
        System.out.println("Código: "+codigoProducto);
        System.out.println("Disponible: "+disponibilidad);

        lectorTeclado.close();



    }
}
