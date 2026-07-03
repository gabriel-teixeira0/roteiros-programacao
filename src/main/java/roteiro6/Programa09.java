package roteiro6;

public class Programa09 {

    public static void main(String[] args) {

        int saldo = 500, um, cinco, dez, cinquenta, saque;

        System.out.println("8 - Sistema de saque");

        System.out.println("\nDigite um valor a ser sacado: ");
        System.out.println("Saldo: R$ " + saldo);
        System.out.print("Valor > ");
        saque = Validadores.ehInteiro();

        while (saque <= 0 || saque > saldo) {
            System.out.println("\nValor informado está fora dos limites, por favor, digite novamente:");
            System.out.print("Valor > ");
            saque = Validadores.ehInteiro();
        }

        cinquenta = saque / 50;
        saque = saque % 50;

        dez = saque / 10;
        saque = saque % 10;

        cinco = saque / 5;
        saque = saque % 5;

        um = saque;

        System.out.println("\nSaque realizado.");
        System.out.println("Confira as notas sacadas: ");
        System.out.println("");

        if (cinquenta != 0) {
            System.out.println(cinquenta + " Notas de R$50");
        }
        if (dez != 0) {
            System.out.println(dez + " Notas de R$10");
        }
        if (cinco != 0) {
            System.out.println(cinco + " Notas de R$5");
        }
        if (um != 0) {
            System.out.println(um + " Notas de R$1");
        }
    }
}
