package roteiro9;

import java.util.Scanner;

public class Validadores {

    public static Scanner sc = new Scanner (System.in);
    
    public static int ehInteiro() {
        int valido;

        while (!sc.hasNextInt()) {
            System.out.print("Entrada digitada não é um número, por favor, digite novamente: ");
            sc.next();
        }
        valido = sc.nextInt();
        return valido;   
    }
    
    public static double ehReal() {
        double validoD;

        while (!sc.hasNextDouble()) {
            System.out.print("Entrada digitada não é um número, por favor, digite novamente: ");
            sc.next();
        }
        validoD = sc.nextDouble();
        return validoD;   
    }
    
    public static String escolha () {
        String letra;
        
        System.out.println("\nDeseja verificar novamente?");
            System.out.println("S - Sim");
            System.out.println("N - Não");
            System.out.print("> ");
            letra = sc.next();

            while (!letra.equalsIgnoreCase("S")
                    && !letra.equalsIgnoreCase("N")) {
                System.out.println("Opção inválida.");
                System.out.print("> ");
                letra = sc.next();
            }
            if (letra.equalsIgnoreCase("N")) {
                System.out.println("Encerrado.");
            }
            
        return letra;
    }
    
}
