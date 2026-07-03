package roteiro6;

import java.util.Scanner;

public class Programa02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double entrada;
        String escolha = "S";
        boolean ok;
        System.out.println("2 - Par ou ìmpar e se múltiplo de 5 ou 3 ");

        while (!escolha.equalsIgnoreCase("n")) {
            System.out.print("Digite um núemro: ");
            ok = false;
            entrada = Validadores.ehReal();

            if (entrada % 2 == 0) {
                System.out.println("\nSeu número é par");
            } else {
                System.out.println("\nSeu número é impar");
            }
            if (entrada % 5 == 0) {
                System.out.println("Seu número é um múltiplo de 5");
                ok = true;
            }
            if (entrada % 3 == 0) {
                System.out.println("Seu número é um múltiplo de 3");
                ok = true;
            }
            if (!ok) {
                System.out.println("O número digitado não é mútiplo de 3 ou 5");
            }

            escolha = Validadores.escolha();
        }
    }
}
