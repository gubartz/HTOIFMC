import java.util.Scanner;

public class VelocidadeMedia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o deslocamento:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o tempo:");
        double num2 = scanner.nextDouble();

        // O método nextDouble() lê apenas o número, mas não consome a quebra de linha
        // (\n) que o usuário digitou ao pressionar "Enter".
        scanner.nextLine();

        // Se o num1 for maior que zero E o num2 também for maior que zero
        // aí eu quero realizar a conta.
        if (num2 > 0 && num1 > 0) {
            double result = 0;
            result = num1 / num2;

            System.out.println("A velocidade média é: " + result);
        } else {
            System.out.println("O Denominador ou Numero é menor ou igual zero!");
        }

    }

}