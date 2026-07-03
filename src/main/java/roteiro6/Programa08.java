package roteiro6;

import java.util.Scanner;

public class Programa08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entrada, inverter;
        String escolha = "s";

        System.out.println("8 - Número Invertido");

        while (!escolha.equalsIgnoreCase("n")) {
            System.out.print("Digite um número de tamanho três: ");
            entrada = sc.nextInt();

            if (entrada > 999 || entrada < 100) {
                System.out.println("Número digitado está fora dos limites, por favor, digite novamente");
                continue;
            }
            inverter = (((entrada % 100) % 10) * 100) + (((entrada % 100) / 10) * 10) + (entrada / 100);
            System.out.println("\nNúmero invertido: " + inverter);

            System.out.println("\nDeseja verificar novamente?");
            System.out.println("S - Sim");
            System.out.println("N - Não");
            System.out.print("> ");
            escolha = sc.next();

            while (!escolha.equalsIgnoreCase("S")
                    && !escolha.equalsIgnoreCase("N")) {
                System.out.println("Opção inválida.");
                System.out.print("> ");
                escolha = sc.next();
            }
            if (escolha.equalsIgnoreCase("N")) {
                System.out.println("Encerrado.");
            }
        }
    }
}
