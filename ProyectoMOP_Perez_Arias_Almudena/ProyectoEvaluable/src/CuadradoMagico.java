import java.util.Scanner;

public class CuadradoMagico {

        private Scanner scanner = new Scanner(System.in);
        private int n = 0;
        private int [][] cuadrado;
        private int sumaFila = 0;
        private int sumaColumna = 0;
        private int sumaDiagonal1 = 0;
        private int sumaDiagonal2 = 0;

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

            int intentos = 0;
            boolean esMagico = false;
            int constanteMagica = n*(n*n +1)/2;

            do {
                intentos++;
                cuadrado = new int[n][n];


                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        int aleatorio;
                        do {
                            aleatorio = (int) (Math.random() * (n * n)) + 1;
                        } while (estaNumero(aleatorio));
                        cuadrado[i][j] = aleatorio;

                    }

                }
                esMagico = verificarCuadrado(constanteMagica);
            }while(!esMagico);

            System.out.println("===CUADRADO MÁGICO ENCONTRADO===");


            for (int[] fila : cuadrado) {
                    for (int item : fila) {
                        System.out.print(item + "\t");
                    }
                    System.out.println();
            }

            System.out.println("Constante mágica: " + constanteMagica);
            System.out.println("Intentos realizados: " + intentos);


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

        private boolean verificarCuadrado(int constanteMagica) {

            for (int i = 0; i < n; i++) {
                sumaFila=0;
                for (int j = 0; j < n; j++) {
                    sumaFila += cuadrado[i][j];
                }
                if (sumaFila != constanteMagica) {
                    return false;
                }


            }
            for (int j = 0; j < n; j++) {
                sumaColumna=0;
                for (int i = 0; i < n; i++) {
                    sumaColumna += cuadrado[i][j];
                }
                if (sumaColumna != constanteMagica) {
                    return false;
                }


            }

            sumaDiagonal1 = 0;
            for (int i = 0; i < n; i++) {
                sumaDiagonal1 += cuadrado[i][i];
            }
            if (sumaDiagonal1 != constanteMagica) {
                return false;
            }

            sumaDiagonal2 = 0;
            for (int i = 0; i < n; i++) {
                sumaDiagonal2 += cuadrado[i][n-1-i];
            }
            if (sumaDiagonal2 != constanteMagica) {
                return false;
            }

            return true;

        }

    }


