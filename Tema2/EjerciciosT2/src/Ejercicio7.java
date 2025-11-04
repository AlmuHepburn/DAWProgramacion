import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args){

        Scanner lectorTeclado= new Scanner(System.in);
        System.out.println("Introduce tu edad:");
        int edad= lectorTeclado.nextInt();
        boolean menor26= edad<26;
        System.out.println("¿Eres estudiante? (true/false):");
        boolean estudiante= lectorTeclado.nextBoolean();
        boolean resultadoEstudiante= estudiante==true;
        boolean resultadoEstudianteInv= !resultadoEstudiante;
        boolean descuentoEspecial= menor26 && resultadoEstudiante;
        System.out.println("¿Eres menor de 26 años?: "+menor26);
        System.out.println("¿Eres estudiante?: "+resultadoEstudiante);
        System.out.println("¿NO eres estudiante?: "+resultadoEstudianteInv);
        System.out.println("¿Tienes descuento joven? (menor de 26): "+menor26);
        System.out.println("¿Tienes descuento estudiante?: "+estudiante);
        System.out.println("¿Tienes descuento especial? (menor de 26 AND estudiante: "+descuentoEspecial);

        lectorTeclado.close();




    }
}
