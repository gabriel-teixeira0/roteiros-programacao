package roteiro2;

import java.util.Scanner;

/**
 *
 * @Gabriel Teixeira 
 * Github: gabriel-teixeira0
 */
public class Programa04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Informe o valor da altura do triângulo");
        altura = sc.nextDouble();
        System.out.println("Informe o valor da base do triângulo");
        base = sc.nextDouble();

        area = base * altura / 2;

        System.out.println("A área do triângulo é: " + area + " m²");

    }
}
