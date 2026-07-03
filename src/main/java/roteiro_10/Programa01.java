package roteiro_10;

public class Programa01 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int pares = 0, impares = 0, maioresCinq = 0;

        System.out.println("1 - Pares, ímpares ou maiores que 50");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            array[i] = Validadores.ehInteiro();

            if (array[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            if (array[i] > 50) {
                maioresCinq++;
            }
        }

        System.out.println("\nPares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Maiores que 50: " + maioresCinq);
    }
}