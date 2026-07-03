package roteiro_10;

public class Programa04 {
    
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        int num = 1, somaPares = 0, impares = 0;
        
        System.out.println("4 - Soma de pares e quantidade de ímpares");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
            System.out.print("Digite o " + num + "° número : ");
                array[i][j] = Validadores.ehInteiro();
                if (array[i][j] % 2 == 0) {
                    somaPares = somaPares + array[i][j];
                } else {
                    impares++;
                }
                num++;
            }
        }

        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Quantidade de ímpares: " + impares);
    }
}
