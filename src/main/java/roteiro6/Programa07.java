package roteiro6;

public class Programa07 {

    public static void main(String[] args) {
        double n1, n2, n3;
        String escolha = "";

        System.out.println("7 - O menor número");

        while (!escolha.equalsIgnoreCase("n")) {

            System.out.print("Digite o 1° número: ");
            n1 = Validadores.ehReal();
            System.out.print("Digite o 2° número: ");
            n2 = Validadores.ehReal();
            System.out.print("Digite o 3° número: ");
            n3 = Validadores.ehReal();

            if (n1 == n2 && n2 == n3) {
                System.out.println("Todos os números são iguais");
            } else if (n1 <= n2 && n1 <= n3) {
                System.out.println(n1 + " é o menor número");
            } else if (n2 <= n1 && n2 <= n3) {
                System.out.println(n2 + " é o menor número");
            } else {
                System.out.println(n3 + " é o menor número");
            }
            
            escolha = Validadores.escolha();
        }
    }
}
