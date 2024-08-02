import java.util.Random;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        int a = 5;
        System.out.println(numero);
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número que voce irá chutar");
            int chute = leitura.nextInt();
            if (numero == chute){
                System.out.println("Você acertou!");
                break;
            } else{
                System.out.println("Voce errou, mas ainda tem " + --a + " tentativas");
            }

        }



    }
}
