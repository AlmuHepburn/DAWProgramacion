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

    public void comprobarAciertos(){
        for (int i = 0; i < numerosSistema.length; i++) {
            if(numerosSistema[i] == numerosUsuario[i]);
            System.out.println("Has tenido 5 aciertos y has ganado 1 millón de euros");
            

        }


    }
}
