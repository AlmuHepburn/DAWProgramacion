import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce tu calificación (A-E):");
        String letra= scanner.next();
        String calificacion= "Excelente";
        switch (letra.toLowerCase()){
            case "A"->{
                System.out.println("Calificación A: "+calificacion);
            }
            case "B"->{
                calificacion="Muy bien";
                System.out.println("Calificación B: "+calificacion);
            }
            case "C"->{
                calificacion="Bien";
                System.out.println("Calificación C: "+calificacion);
            }
            case "D"->{
                calificacion="Suficiente";
                System.out.println("Calificación D: "+calificacion);
            }
            case "E"->{
                calificacion="Insuficiente";
                System.out.println("Calificación E: "+calificacion);
            }
            default -> {
                System.out.println("Calificación introducida no valida");
            }
        }

    }
}
