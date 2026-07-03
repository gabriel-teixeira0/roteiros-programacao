/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro5;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Programa03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = "";
        boolean valido = false;

        System.out.println("3 - Palavra invertida");
        while (!valido) {
            System.out.println("Digite uma palavra:");
            palavra = sc.next();

            if (palavra.matches("^[a-zA-ZÀ-ÿ]+$")) {
                valido = true;
            } else {
                System.out.println("Erro, entrada inválida. Por favor, digite uma palavra.");
            }
        }
        char[] letras = new char[palavra.length()];
        char[] invertida = new char[letras.length];
        for (int i = 0; i < letras.length; i++) {
            letras[i] = palavra.charAt(i);
        }

        for (int i = 0; i < letras.length; i++) {
            invertida[letras.length - 1 - i] = letras[i];
        }

        String resultado = "";
        for (int i = 0; i < invertida.length; i++) {
            resultado += invertida[i];
        }
        System.out.println("Palavra invertida: " + resultado);
    }
}
