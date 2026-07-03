/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package roteiro3;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Programa07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dia, mes, ano;

        System.out.println("Informe o dia do seu nascimento (dd)");
        dia = sc.nextDouble();
        System.out.println("Informe o mês do seu nascimento (mm)");
        mes = sc.nextDouble();
        System.out.println("Informe o ano do seu nascimento (aaaa)");
        ano = sc.nextDouble();

        int personalidade = (int) ((dia + mes + ano) % 4);

        switch (personalidade) {
            case 0:
                System.out.println("Seu tipo de personalidade é: Discreto");
                break;
            case 1:
                System.out.println("Seu tipo de personalidade é: Amoroso");
                break;
            case 2:
                System.out.println("Seu tipo de personalidade é: Tímido");
                break;
            case 3:
                System.out.println("Seu tipo de personalidade é: Namorador");
                break;
            default:
                System.out.println("Tipo não encontradoo");
                break;
        }
        sc.close();
    }
}
