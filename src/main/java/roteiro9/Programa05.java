package roteiro9;

public class Programa05 {

    public static void main(String[] args) {
        int[] v = new int [10];
        int n, limite;
        
        System.out.println("5 - Procurar em vetores");
        
        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o " + (i+1)+ "° número: ");
            v[i] = Validadores.ehInteiro();
        }
        System.out.print("\nNúmero: ");
        n = Validadores.ehInteiro();
        System.out.println("Limite (0 a 9): ");
        limite = Validadores.ehInteiro();
        
        System.out.println("Quantidade: " + contar(v, n, limite));
    }
    public static int contar(int[] v, int n, int limite) {
        int cont = 0;
        if (limite >= v.length) {
            limite = v.length - 1;
        }

        if (limite < 0) {
            limite = 0;
        }
        cont = 0;
        
        for (int i = 0; i <= limite; i++) {
            if (v[i] == n) {
                cont++;
            }
        }
        return cont;
    }
}
