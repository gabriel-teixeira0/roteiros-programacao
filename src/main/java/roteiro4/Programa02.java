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
public class Programa02 {
    public static void main(String[] args) {
        int numeral = 0;
        double soma = 0;
        double[] numeros = new double[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Soma total de 10 números");
        for (int i = 0; i < numeros.length; i++) {
            numeral = numeral + 1;
            System.out.println("Digite o " + numeral + "° número");
            numeros[i] = sc.nextDouble();
            soma += +numeros[i];
        }
        System.out.println("A soma dos dez números é: " + soma + "!");
    }
}
