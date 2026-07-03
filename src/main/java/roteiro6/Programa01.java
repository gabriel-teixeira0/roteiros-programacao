package roteiro6;

import java.util.Scanner;

public class Programa01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int raiz, entrada;
        String escolha = "S";
        boolean ok;

        System.out.println("1 - Verificador de raíz perfeita");

        while (!escolha.equalsIgnoreCase("n")) {

            System.out.print("Digite um número para saber se é ou não uma raíz perfeita: > ");
            raiz = 0;
            ok = false;
            entrada = Validadores.ehInteiro();

            for (int i = 0; i * i <= entrada; i++) {
                if (entrada < 0) {
                    break;
                }
                if (entrada == (i * i)) {
                    raiz = i;
                    ok = true;
                    break;
                }
            }

            if (ok) {
                System.out.println("O número " + entrada + " é um quadrado perfeito com sua raíz sendo: " + raiz + "^2");
            } else {
                System.out.println("O número digitado não é um quadrado perfeito");
            }

            escolha = Validadores.escolha();
        }
    }
}
