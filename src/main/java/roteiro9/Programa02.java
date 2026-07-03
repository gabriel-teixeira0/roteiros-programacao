package roteiro9;

public class Programa02 {

    public static void main(String[] args) {
        int numero, qntdDivisores;
        String escolha = "S";

        System.out.println("2 - Quantidade de divisores");

        while (escolha.equalsIgnoreCase("s")) {
            while (true) {
                System.out.print("Digite um número: ");
                numero = Validadores.ehInteiro();

                qntdDivisores = contarDivisores(numero);
                if (qntdDivisores == -1) {
                    System.out.println("Número inválido para divisores");
                    break;
                } else if (qntdDivisores == 0) {
                    System.out.println("O número " + numero + " não possui divisores");
                } else {
                    System.out.println("O número " + numero + " possui " + qntdDivisores + " divisores");
                }
                break;
            }
            escolha = Validadores.escolha();
        }
    }

    public static int contarDivisores(int num) {
        int contador;

        if (num <= 0) {
            return -1;
        }
        contador = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }
        return contador;
    }
}
