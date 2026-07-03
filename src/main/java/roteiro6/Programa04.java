package roteiro6;

import java.util.Scanner;

public class Programa04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String escolha = "S", sexo;
        double altura, pesoIdeal;

        System.out.println("4 - Calculadora de peso ideal");

        while (!escolha.equalsIgnoreCase("N")) {
            sexo = "X";
            altura = 0;
            pesoIdeal = 0;
            
            System.out.println("Informe o seu sexo:");
            System.out.print("M - Masculino, F - Feminino: ");
            sexo = sc.next().toUpperCase();

            System.out.print("\nInforme sua altura: ");
            altura = Validadores.ehReal();
            switch (sexo) {
                case "M":
                    pesoIdeal = (72.7 * altura) - 58;
                    System.out.println("\nO peso ideal é: " + pesoIdeal);
                    break;
                case "F":
                    pesoIdeal = (62.1 * altura) - 44.7;
                    System.out.println("\nO peso ideal é: " + pesoIdeal);
                    break;
                default:
                    System.out.println("\nNenhuma das opções escolhidas, por favor, escolha novamente");
                    continue;
            }
            
            escolha = Validadores.escolha();
        }
    }
}
