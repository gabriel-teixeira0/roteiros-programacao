package roteiro8;

import java.util.Scanner;

public class Programa01 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[10];
        int temp, pos = 0, resultado, encontrar = 0, mediaQuant = 0, soma = 0;
        double media = 0;
        boolean repetido = true, ok = false;

        System.out.println("1 - Cálculos e ordenação com vetores");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            repetido = true;

            while (repetido) {
                repetido = false;
                array[i] = ehInteiro();

                if (array[i] < 1) {
                    System.out.println("\nEntrada digitada não pode ser menor que 1");
                    System.out.print("Por favor, digite novamente: ");
                    repetido = true;
                    continue;
                }

                for (int k = 0; k < i; k++) {
                    if (array[i] == array[k]) {
                        System.out.println("\nEntrada digitada já existe");
                        System.out.print("Por favor, digite novamente: ");
                        repetido = true;
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("\nMatriz ordenada: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("Cálculos: ");

        int p = 0, o = array.length - 1;

        while (p < o) {
            resultado = 0;
            if (p == o - 1) {
                resultado += array[p] * array[o];
                System.out.println((p + 1) + "° * " + (o + 1) + "°");
                System.out.println(array[p] + " * " + array[o] + " = " + resultado);
            } else {
                resultado += array[p] + array[o];
                System.out.println((p + 1) + "° + " + (o + 1) + "°");
                System.out.println(array[p] + " + " + array[o] + " = " + resultado);
            }
            p++;
            o--;
        }

        for (int i = 0; i < array.length; i++) {
            media = media + array[i];
        }
        media = media / array.length;
        System.out.println("A média de números do vetor é: " + media);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < media) {
                mediaQuant++;
            }
        }
        System.out.println("Números abaixo da média: " + mediaQuant);

        System.out.println("Digite um valor para encontrar a posição: ");
        System.out.print("> ");
        encontrar = ehInteiro();

        ok = false;
        for (int i = 0; i < array.length; i++) {
            if (encontrar == array[i]) {
                pos = i;
                ok = true;
                break;
            }
        }
        if (ok) {
            System.out.println("O número " + encontrar + " está na posição: " + (pos + 1));
        } else {
            System.out.println("0 - O número informado não foi encontrado");
        }

        int numero;
        boolean encontrado = false;

        System.out.print("Digite o número para ser removido: ");
        numero = ehInteiro();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                encontrado = true;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = -1;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Número removido com sucesso!");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Número não encontrado no vetor.");
        }
    }

    public static int ehInteiro() {
        int valido;

        while (!sc.hasNextInt()) {
            System.out.print("Entrada digitada não é um número, por favor, digite novamente: ");
            sc.next();
        }
        valido = sc.nextInt();
        return valido;
    }
}
