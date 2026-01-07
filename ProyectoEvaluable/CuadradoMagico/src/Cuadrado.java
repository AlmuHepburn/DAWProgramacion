import java.util.Scanner;

public class Cuadrado {

    private Scanner scanner = new Scanner(System.in);
    private int [][] cuadrado = new int[0][0];



    public void generarCuadrado(){
        System.out.println("Introduce el tamaño de la matriz (n): ");
        int n = scanner.nextInt();
        cuadrado = new int[n][n];
        System.out.println("===CUADRADO MÁGICO ENCONTRADO===");
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                int aleatorio;
                do {
                    aleatorio= (int) (Math.random()*21);
                }while(estaNumero(aleatorio));
                cuadrado[i][j] = aleatorio;

            }

        }
        for (int[] fila: cuadrado){
            for (int item: fila) {
                System.out.print(item+"\t");
            }
            System.out.println();
        }


    }

    private boolean estaNumero(int numero){
        for(int [] fila: cuadrado){
            for( int item: fila){
                if(item==numero){
                    return true;
                }
                return false;
            }
        }

    }

}
