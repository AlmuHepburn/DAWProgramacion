import java.util.Scanner;

public class Bonoloto {

    private int[] numerosSistema = new int[5];

    private int[] numerosUsuario = new int[5];

    private Scanner scanner = new Scanner(System.in);

    public void generarNumerosSistema(){
        for (int i = 0; i < numerosSistema.length; i++) {
            numerosSistema[i] = (int) (Math.random()*20)+1;

        }
    }

    public void pedirNumerosUsuario(){
        for (int i = 0; i < numerosUsuario.length; i++) {
            int numero;
            do{
                System.out.println("Introduce un valor");
                numero = scanner.nextInt();
                if (numero<1 || numero>20){
                    System.out.println("Este número no es válido");
                }

            }while (numero<1 || numero>20);
            numerosUsuario[i] = numero;

        }
    }

    public void comprobacionNumeros(){
        //para que me imprima por consola ambas arrays
        for(int comprobacion1 : numerosUsuario){
            System.out.println(comprobacion1);
        }

        for(int comprobacion2 : numerosSistema){
            System.out.println(comprobacion2);
        }
    }


    public void comprobarAciertos(){
        int contador = 0;

        for (int i = 0; i < numerosSistema.length; i++) {
            for (int j = 0; j < numerosUsuario.length; j++) {
                if (numerosSistema[i] == numerosUsuario[j]) {
                    contador++;
                    numerosUsuario[j] = 0;
                    break;
                }

            }


        }

        System.out.println("El número de aciertos es "+contador);
        switch (contador){
            case 1:
                System.out.println("Has ganado 10 euros");
                break;
            case 2:
                System.out.println("Has ganado 10 euros");
                break;
            case 3:
                System.out.println("Has ganado 1.000 euros");
                break;
            case 4:
                System.out.println("Has ganado 10.000 euros");
                break;
            case 5:
                System.out.println("Has ganado 1 millón de euros");
                break;
            default:
                System.out.println("Prueba suerte la próxima vez");
        }


    }


}
