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
public class Programa07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, palavra = "", invertida = "";
        char resultado, letra;

        System.out.println("7 - Ordem inversa de uma frase");
        frase = sc.nextLine();

        for (int i = frase.length() - 1; i >= 0; i--) {
            letra = frase.charAt(i);
            if (letra == ' ') {
                invertida = invertida + palavra + " ";
                palavra = "";
            } else {
                palavra = letra + palavra;
            }
        }
        invertida = invertida + palavra;
        for (int i = 0; i < invertida.length(); i++) {
            resultado = invertida.charAt(i);
            System.out.print(resultado);
        }

    }
}
