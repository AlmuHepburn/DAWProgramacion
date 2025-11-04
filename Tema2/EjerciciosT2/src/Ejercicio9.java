import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner lectorNotas = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen:");
        int nota1= lectorNotas.nextInt();
        System.out.println("Introduce la nota del segundo examen:");
        int nota2= lectorNotas.nextInt();
        System.out.println("Introduce la nota del tercer examen:");
        int nota3= lectorNotas.nextInt();
        double media= (nota1+nota2+nota3)/(double)3;
        boolean aprobado= media>=5;
        boolean notable= media>=7;
        boolean sobresaliente= media>=9;
        System.out.printf("Nota media: %.1f\n",media);
        System.out.println("¿Ha aprobado? (>=5): "+aprobado);
        System.out.println("¿Tiene notable? (>=7): "+notable);
        System.out.println("¿Tiene sobresaliente? (>=9): "+sobresaliente);

        lectorNotas.close();


    }
}
