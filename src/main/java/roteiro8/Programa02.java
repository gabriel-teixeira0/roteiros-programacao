package roteiro8;

import java.util.Random;

public class Programa02 {

    public static void main(String[] args) {
        Random rd = new Random();

        int[][] matriz = new int[5][5];
        int[] matrizOrd = new int[25];
        int temp, numero, numeroAleatorio, num = -1;

        System.out.println("2 - Ordenação de matriz aleatória");

        System.out.println("Matriz aleatória: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                num++;
                numeroAleatorio = rd.nextInt(100) + 1;
                matriz[i][j] = numeroAleatorio;
                System.out.printf("%4d", matriz[i][j]);
                matrizOrd[num] = numeroAleatorio;
            }
            System.out.println(" ");
        }

        for (int i = 0; i < matrizOrd.length - 1; i++) {
            for (int j = 0; j < matrizOrd.length - 1 - i; j++) {
                if (matrizOrd[j] > matrizOrd[j + 1]) {
                    temp = matrizOrd[j];
                    matrizOrd[j] = matrizOrd[j + 1];
                    matrizOrd[j + 1] = temp;
                }
            }
        }
        System.out.println("\nMatriz ordenada");
        
        num = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = matrizOrd[num];
                System.out.printf("%4d", matriz[i][j]);
                num++;
                }
            System.out.println(" ");
        }
    }
}
