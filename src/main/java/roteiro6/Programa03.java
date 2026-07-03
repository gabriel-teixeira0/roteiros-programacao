package roteiro6;

public class Programa03 {

    public static void main(String[] args) {
        String escolha = "S";
        double n1, n2;

        System.out.println("3 - Divisores ou não");
        while (!escolha.equalsIgnoreCase("N")) {

            System.out.print("\nDigite o primeiro número: ");
            n1 = Validadores.ehReal();
            System.out.print("Digite o segundo número: ");
            n2 = Validadores.ehReal();

            if (n1 == 0 || n2 == 0) {
                System.out.println("\nERRO: Não é possível verificar divisão por zero, tente novamente.");
                continue;
            }

            if (n1 % n2 == 0) {
                System.out.println("\nO número: " + n2 + " é divisor de " + n1);
            } else if (n2 % n1 == 0) {
                System.out.println("\nO número: " + n1 + " é divisor de " + n2);
            } else {
                System.out.println("\nNenhum dos dois números são divisores.");
            }

            escolha = Validadores.escolha();
        }
    }
}
