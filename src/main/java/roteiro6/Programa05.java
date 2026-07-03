package roteiro6;

import java.util.Scanner;

public class Programa05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usuario = "", credencial;
        int tipo = 0;

        System.out.println("5 - Sistema de Login");
        System.out.println("Olá, por favor, digite seu login e senha:");

        while (tipo != 1) {
            System.out.print("\nLogin > ");
            usuario = sc.next();
            System.out.print("Senha > ");
            credencial = sc.next();
            System.out.println("");

            tipo = validar(usuario, credencial);

            if (tipo == 1) {
                System.out.println("Acesso autorizado");
            } else if (tipo == 2) {
                System.out.println("ERRO: Conta incorreta ou não existe");
            } else {
                System.out.println("ERRO: Senha incorreta");
            }
        }
        System.out.println("Bem-vindo novamente, " + usuario + "!");
    }

    public static int validar(String login, String senha) {
        String[][] dadosDeLogin = {
            {"admin", "acesso", "gabriel", "amanda83"},
            {"admin", "6RX37", "Gaband9090", "am76198"}
        };
        int codigo;
        boolean loginOk = false, senhaOk = false;

        for (int i = 0; i < dadosDeLogin.length; i++) {
            if (login.equals(dadosDeLogin[0][i])) {
                loginOk = true;
                if (senha.equals(dadosDeLogin[1][i])) {
                    senhaOk = true;
                    break;
                } else {
                    break;
                }
            }
        }

        /*Tabela de códigos
        * 1 - Acesso autorizado
        * 2 - Erro, login inválido
        * 3 - Erro, senha inválida
         */
        if (loginOk && senhaOk) {
            codigo = 1;
        } else if (!loginOk) {
            codigo = 2;
        } else {
            codigo = 3;
        }

        return codigo;
    }
}
