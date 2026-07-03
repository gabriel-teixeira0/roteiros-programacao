package roteiro6;

public class Programa06 {

    public static void main(String[] args) {

        String escolha = "S";
        int a, b, c;
        int delta;
        int raizDelta;
        double x1, x2;

        System.out.println("6 - Equação do 2º Grau");

        while (!escolha.equalsIgnoreCase("N")) {
            System.out.print("\nInforme o valor de A: ");
            a = Validadores.ehInteiro();
            
            while (a == 0) {
                System.out.println("O valor de A não pode ser zero, por favor, digite novamente: ");
                a = Validadores.ehInteiro();
            }

            System.out.print("Informe o valor de B: ");
            b = Validadores.ehInteiro();
            System.out.print("Informe o valor de C: ");
            c = Validadores.ehInteiro();

            delta = calcularDelta(a, b, c);

            System.out.println("\nDelta = " + delta);
            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else {
                raizDelta = encontrarRaiz(delta);
                if (raizDelta == -1) {
                    System.out.println("O delta não possui raiz quadrada inteira.");
                    System.out.println("Não é possível calcular as raízes sem utilizar Math.sqrt.");
                } else {
                    x1 = (-b + raizDelta) / (double) (2 * a);
                    x2 = (-b - raizDelta) / (double) (2 * a);
                    if (x1 == x2) {
                        System.out.println("As raízes são reais e iguais.");
                        System.out.println("x1 = x2 = " + x1);
                    } else {
                        System.out.println("As raízes são reais e diferentes.");
                        System.out.println("x1 = " + x1);
                        System.out.println("x2 = " + x2);
                    }
                }
            }
            escolha = Validadores.escolha();
        }
    }

    public static int calcularDelta(int a, int b, int c) {
        return (b * b) - (4 * a * c);
    }

    public static int encontrarRaiz(int numero) {
        for (int i = 0; i <= numero; i++) {
            if (i * i == numero) {
                return i;
            }
        }
        return -1;
    }
}