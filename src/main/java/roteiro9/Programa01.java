package roteiro9;

public class Programa01 {

    public static void main(String[] args) {
        int entrada, resultado;
        String escolha = "s";
        System.out.println("1 - Verificador positivo, negativo ou zero");

        while (escolha.equalsIgnoreCase("s")) {
            System.out.print("Digite um número: ");
            entrada = Validadores.ehInteiro();

            resultado = verificarStatus(entrada);
            if (resultado == 1) {
                System.out.println("O número é positivo");
            } else if (resultado == -1) {
                System.out.println("O número é negativo");
            } else {
                System.out.println("O número é Zero");
            }

            escolha = Validadores.escolha();
        }
    }

    public static int verificarStatus(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
