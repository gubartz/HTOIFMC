package exercicio02_01_operacoes_basicas;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        OperacoesBasicas operacoesBasicas = new OperacoesBasicas();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Qual operação você quer realizar?");
        System.out.println("+: Somar");
        System.out.println("-: Subtrair");
        System.out.println("/: Dividir");
        System.out.println("*: Multiplicar");

        String operacao = scanner.next();
        String resultado = "";

        if (operacao.equals("+")) {
            resultado = String.valueOf(operacoesBasicas.somar(num1, num2));
        } else if (operacao.equals("-")) {
            resultado = String.valueOf(operacoesBasicas.subtrair(num1, num2));
        } else if (operacao.equals("*")) {
            resultado = String.valueOf(operacoesBasicas.multiplicar(num1, num2));
        } else if (operacao.equals("/")) {
            resultado = String.valueOf(operacoesBasicas.dividir(num1, num2));
        } else {
            System.out.println("Opção Inválida");
            return;
        }

        System.out.println("O resultado da " + operacao + " é " + resultado);
    }
}