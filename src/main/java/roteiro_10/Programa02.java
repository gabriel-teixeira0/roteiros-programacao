package roteiro_10;

import java.util.Scanner;

public class Programa02 {
    
    public static void main(String[] args) {
        double[] array = new double[8];
        double media;
        
        System.out.println("2 - Calculadora de média");
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o " + (i + 1) + "° número :");
            array[i] = Validadores.ehReal();
        }
        media = calcularMedia(array);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
    public static double calcularMedia(double[] array) {
        double soma = 0;

        for (int i = 0; i < 8; i++) {
            soma = soma + array[i];
        }
        return soma / 8;
    }
}