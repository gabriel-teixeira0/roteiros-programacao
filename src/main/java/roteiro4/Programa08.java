/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro4;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Programa08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeral = 0;
        int[] array = new int[16];

        System.out.println("Troca números");

        for (int i = 0; i < array.length; i++) {
            numeral = numeral + 1;
            System.out.println("Digite o " + numeral + "° número");
            array[i] = sc.nextInt();
        }
        System.out.println("Resultado:");
        for (int i = 8; i < 16; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
