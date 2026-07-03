package roteiro9;

public class Programa06 {

    public static void main(String[] args) {
        int a, b, somaA, somaB;

        System.out.println("6 - Números unidos");

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "° dupla");
            
            System.out.print("\nNúmero A: ");
            a = Validadores.ehInteiro();
            System.out.print("Número B: ");
            b = Validadores.ehInteiro();

            somaA = somaDivisores(a);
            somaB = somaDivisores(b);

            verificar(a, b, somaA, somaB);
        }
    }

    public static int somaDivisores(int n) {
        int soma;
        if (n <= 0) {
            return 0;
        }
        soma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma = soma + i;
            }
        }
        return soma;
    }

    public static void verificar(int a, int b, int somaA, int somaB) {
        if (somaA == b || somaB == a) {
            System.out.println("Os números são unidos!");
        } else {
            System.out.println("Os números não são unidos.");
        }
    }
}
