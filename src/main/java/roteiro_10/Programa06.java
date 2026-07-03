package roteiro_10;

public class Programa06 {

    public static void main(String[] args) {
        int[][] vetor = new int[5][5];
        int num = 1;

        System.out.println("6 - Valores acima da média");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o " + num + "° número : ");
                vetor[i][j] = Validadores.ehInteiro();
                num++;
            }
        }
        mostrarValoresAcimaDaMedia(vetor);
    }

    public static void mostrarValoresAcimaDaMedia(int[][] vetor) {
        int soma = 0, total = 25;
        double media;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                soma = soma + vetor[i][j];
            }
        }

        media = soma / 25.0;

        System.out.println("Vetor: ");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%4d", vetor[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Média: " + media);
        System.out.println("Valores acima da média:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (vetor[i][j] > media) {
                    System.out.println(vetor[i][j]);
                }
            }
        }
    }
}
