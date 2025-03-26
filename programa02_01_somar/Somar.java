import java.util.Scanner;

public class Somar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        // O método nextDouble() lê apenas o número, mas não consome a quebra de linha (\n) que o usuário digitou ao pressionar "Enter".
        scanner.nextLine();

        double result = 0;
        result = num1 + num2;
        
        System.out.println("O resultado é: " + result);
    }

}