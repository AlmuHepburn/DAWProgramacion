import model.Carrera;
import model.Coche;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        ArrayList<Coche> coches = new ArrayList<>();

       System.out.println("Introduce el número de coches participantes: ");
       int numCoches = scanner.nextInt();
       scanner.nextLine();

       System.out.println("Has inscrito "+numCoches+" participantes al campeonato\n");

        for (int i = 1; i <= numCoches ; i++) {

            System.out.println("Introduce la marca del participante "+i);
            String marca = scanner.nextLine();
            System.out.println("Introduce el modelo del participante "+i);
            String modelo = scanner.nextLine();
            System.out.println("El "+marca + modelo+" tendrá el dorsal "+i);
            System.out.println();

            coches.add(new Coche());

        }

        ArrayList<Carrera> carreras = new ArrayList<>();

        System.out.println("¿Cuántas carreras quieres que tenga el campeonato?:");
        int numCarreras = scanner.nextInt();

        for (int i = 1; i <= numCarreras ; i++) {

            System.out.println("Introduce la distancia (km) de la carrera "+i);
            int kmDistancia = scanner.nextInt();
            System.out.println();

            carreras.add(new Carrera());

        }



    }
}
