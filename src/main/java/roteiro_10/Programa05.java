package roteiro_10;

public class Programa05 {

    public static void main(String[] args) {
        int[][] vetor = new int[3][3];
        int soma, num = 1;

        System.out.println("5 - Força da diagonal");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o " + num + "° número : ");
                vetor[i][j] = Validadores.ehInteiro();
                num++;
            }
        }

        System.out.println("Vetor: ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", vetor[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        soma = somarDiagonalPrincipal(vetor);

        if (soma > 100) {
            System.out.println("Diagonal forte");
        } else {
            System.out.println("Diagonal fraca");
        }
    }

    public static int somarDiagonalPrincipal(int[][] array) {
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            soma = soma + array[i][i];
        }
        return soma;
    }
}
