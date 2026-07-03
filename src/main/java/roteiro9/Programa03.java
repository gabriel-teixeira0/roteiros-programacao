package roteiro9;

public class Programa03 {

    public static void main(String[] args) {
        int numero, qntdDivisores;
        String escolha = "S";

        System.out.println("3 - Divisores");

        while (escolha.equalsIgnoreCase("s")) {
            System.out.print("Digite um número: ");
            numero = Validadores.ehInteiro();
            mostrarDivisores(numero);

            escolha = Validadores.escolha();
        }
    }

    public static void mostrarDivisores(int num) {
        boolean ok = false;
        if (num <= 0) {
            System.out.println("Número inválido para divisores");
        } else {
            System.out.println("Divisores: ");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                    ok = true;
                }
            }
            System.out.println(" ");
            if (!ok) {
                System.out.println("Não há nenhum divisor para " + num);
            }
        }
    }
}
