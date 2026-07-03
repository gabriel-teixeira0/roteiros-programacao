package roteiro6;

public class Programa_11 {

    public static void main(String[] args) {

        int dia, mes, ano, dAtual, mAtual, aAtual, idade;

        System.out.println("11 - Data de Nascimento");

        System.out.print("Digite o dia do seu nascimento: ");
        dia = validoDia();
        System.out.print("Digite o mês do seu nascimento: ");
        mes = validoMes();
        System.out.print("Digite o ano do seu nascimento: ");
        ano = validoAno();

        System.out.print("\nDigite o dia atual: ");
        dAtual = validoDia();
        System.out.print("Digite o mês atual: ");
        mAtual = validoMes();
        System.out.print("Digite o ano atual: ");
        aAtual = validoAno();

        idade = aAtual - ano;

        if (mAtual < mes) {
            idade--;
        } else if (mAtual == mes && dAtual < dia) {
            idade--;
        }

        System.out.println("Sua idade é: " + idade + " anos");

    }

    public static int validoDia() {
        int nDia = Validadores.ehInteiro();

        while (!(nDia > 0 && nDia < 32)) {
            System.out.print("\nDia informado está fora dos limites, digite novamente: ");
            nDia = Validadores.ehInteiro();
        }
        return nDia;
    }

    public static int validoMes() {
        int nMes = Validadores.ehInteiro();

        while (!(nMes < 13 && nMes > 0)) {
            System.out.print("\nMês informado está fora dos limites, digite novamente: ");
            nMes = Validadores.ehInteiro();
        }
        return nMes;
    }

    public static int validoAno() {
        int nAno = Validadores.ehInteiro();
        while (!(nAno < 10000 && nAno > 1499)) {
            System.out.print("\nAno informado está fora dos limites, digite novamente: ");
            nAno = Validadores.ehInteiro();
        }
        return nAno;
    }
}
