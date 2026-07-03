package roteiro_10;

public class Programa07 {

    public static void main(String[] args) {
        int[] vetor = new int[10];

        System.out.println("7 - Ordenar em ordem decrescente ou crescente");

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° número : ");
            vetor[i] = Validadores.ehInteiro();
        }

        System.out.println("1 - Crescente");
        System.out.println("2 - Decrescente");
        int opcao = Validadores.ehInteiro();

        ordenarVetor(vetor, opcao);

        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }
    }

    public static void ordenarVetor(int[] vetor, int opcao) {
        int aux;

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (opcao == 1) { // crescente
                    if (vetor[i] > vetor[j]) {
                        aux = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = aux;
                    }
                } else { // decrescente
                    if (vetor[i] < vetor[j]) {
                        aux = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = aux;
                    }
                }
            }
        }
    }
}
