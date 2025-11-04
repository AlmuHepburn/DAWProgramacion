import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args){

        Scanner datosHoras= new Scanner(System.in);
        System.out.println("Introduce el salario por hora:");
        int salarioHora= datosHoras.nextInt();
        System.out.println("Introduce las horas trabajadas:");
        int horasTrabajadas= datosHoras.nextInt();
        System.out.println("¿Has hecho horas extra? (true/false):");
        boolean Extra= datosHoras.nextBoolean();
        int horasExtra= horasTrabajadas-40;
        int horasNormales= horasTrabajadas-horasExtra;
        boolean mas40= horasTrabajadas>40;
        boolean derechoHE= mas40==true;
        boolean aplicacionHE= mas40&&derechoHE==true;
        double salarioHorasNormales= (double)salarioHora*horasNormales;
        double salarioHorasExtra= (double)(salarioHora*horasExtra)*2;
        double salarioTotal= salarioHorasExtra+salarioHorasNormales;

        System.out.println("Horas normales (máximo 40): "+horasNormales);
        System.out.println("Horas extra: "+horasExtra);
        System.out.println("¿Trabajaste más de 40 horas?: "+mas40);
        System.out.println("¿Tienes derecho a horas extra?: "+derechoHE);
        System.out.println("¿Se aplican horas extra?: "+aplicacionHE);
        System.out.printf("Salario por horas normales: %.1f\n",salarioHorasNormales);
        System.out.printf("Salario por horas extra (al doble): %.1f\n",salarioHorasExtra);
        System.out.printf("Salario total: %.1f\n",salarioTotal);

        datosHoras.close();
    }
}
