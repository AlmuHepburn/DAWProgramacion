import java.util.Scanner;

public class CuadradoMagico {

        private Scanner scanner = new Scanner(System.in);
        private int n = 0;
        private int [][] cuadrado;

        public void pedirNumeroUsuario(){
            do{
                System.out.println("Introduce el tamaño de la matriz (n)");
                n = scanner.nextInt();
                if (n<3){
                    System.out.println("Valor introducido no válido");
                }
            }while (n<3);
        }




        public void generarCuadrado(){
            //System.out.println("Introduce el tamaño de la matriz (n): ");
           // int n = scanner.nextInt();
           // cuadrado = new int[n][n];
            System.out.println("===CUADRADO MÁGICO ENCONTRADO===");
            cuadrado = new int[n][n];
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

        private boolean estaNumero(int numero) {
            for (int[] fila : cuadrado) {
                for (int item : fila) {
                    if (item == numero) {
                        return true;
                    }

                }
            }

            return false;
        }

    }


