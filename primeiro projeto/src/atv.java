import java.util.Scanner;

public class atv {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        /*System.out.println("Digite um número aletório.");
        double numero = leitura.nextDouble();
        if (numero>0){
            System.out.println("Esse número é positivo");
        } else{
            System.out.println("Esse número é negativo");
        }
        System.out.println("Digite outro número");
        double numero2 = leitura.nextDouble();
        if (numero>numero2){
            System.out.println("o numero " + numero + " é maior que o numero " + numero2);
        } else{
            System.out.println("o numero " + numero + " é menor que o numero " + numero2);
        }
        if (numero == numero2){
            System.out.println("os numeros sao iguais");
        } else {
            System.out.println("os numeros são diferentes");
        }

         

        System.out.println("Digite 1 para calcular a área do quadrado e 2 para calcular a area do círuclo.");

        int resp = leitura.nextInt();

        if (resp == 1) {
            System.out.println("Digite o valor da base do quadrado");
            double baseQuadrado = leitura.nextDouble();
            System.out.println("o valor da área do quadrado é: " + baseQuadrado * baseQuadrado);
        }
        if (resp == 2) {
                System.out.println("Digite o valor do raio do círculo");
                double raioCirculo = leitura.nextDouble();
                System.out.println("O valor da área do círculo é: " + raioCirculo * 3.14 * 2);
        }
        System.out.println("Digite um número para fazer a tabuada do mesmo do 1 ao 10");
        int numero = leitura.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + "*" + i + " = " + numero * i);
        }


        System.out.println("Digite um numero para saber se ele é par ou impar");
        int numero = leitura.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é ímpar");
        }

         */

        System.out.println("Digite um número para calcular o seu fatorial");
        int numero = leitura.nextInt();
        int fatorial = 1;
        for (int i = 1; i < numero; i++) {
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
