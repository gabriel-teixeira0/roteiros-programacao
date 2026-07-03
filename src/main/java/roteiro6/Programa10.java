package roteiro6;

public class Programa10 {

    public static void main(String[] args) {

        double salario, taxaINSS, taxaIR, inss, ir, salarioLiquido;
        
        System.out.println("9 - Sistema de folha de pagamento");

        System.out.print("Digite o salário: R$ ");
        salario = Validadores.ehInteiro();
        System.out.print("Digite a taxa de INSS (%): ");
        taxaINSS = Validadores.ehInteiro();
        System.out.print("Digite a taxa de IR (%): ");
        taxaIR = Validadores.ehInteiro();

        inss = salario * taxaINSS / 100;

        if (inss > 150) {
            inss = 150;
        }
        
        ir = (salario - inss) * taxaIR / 100;
        salarioLiquido = salario - inss - ir;

        System.out.println("\n===== CONTRACHEQUE =====");
        System.out.println("Vencimentos - ");
        System.out.println("Salário Bruto: R$ " + salario);
        System.out.println("\nDescontos - ");
        System.out.println("Desconto INSS: R$ " + inss);
        System.out.println("Desconto IR: R$ " + ir);
        System.out.println("\nSalário Líquido: R$ " + salarioLiquido);
        System.out.println("========================");
    }
}
