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

        // Se o num2 (que é o denominador) for zero
        // isso resulta em uma divisão por zero.
        // Nós não queremos isso!
        if (num2 <= 0 || num1 <= 0) {
            System.out.println("O Denominador ou Numero é menor ou igual zero!");
        } else {
            double result = 0;
            result = num1 / num2;

            System.out.println("A velocidade média é: " + result);
        }

    }

}