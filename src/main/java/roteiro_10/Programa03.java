package roteiro_10;

public class Programa03 {

    public static void main(String[] args) {
        int[] array = new int[6];

        System.out.println("3 - Positivos, negativos e zeros");

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "° número : ");
            array[i] = Validadores.ehInteiro();
        }
        verificar(array);
    }

    public static void verificar(int[] array) {
        int pos = 0, neg = 0, zero = 0;

        for (int i = 0; i < 6; i++) {
            if (array[i] > 0) {
                pos++;
            } else if (array[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }

        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Zeros: " + zero);
    }
}
