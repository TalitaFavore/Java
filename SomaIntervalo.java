package com.mycompany.somaintervalo;

import java.util.Scanner;

/**
 * @author Talita
 */
public class SomaIntervalo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = valorA();
        int b = valorB();
        
        while (a > b) {
            System.out.println("Valor inferior do intervalo não pode ser maior que o valor superior.");
            System.out.println("Preencha novamente.");
            a = valorA();
            b = valorB();
        }
        
        int somaDesejada = valorSoma();

        int count = 0;
        for (int i = a; i <= b; i++) {
            int soma = calcularSoma(i);
            if (soma == somaDesejada) {
                count++;
            }
        }

        System.out.println("Quantidade de números dentro do intervalo cuja soma dos algarismos resulta na soma desejada: " + count);
    }

    public static int valorA() {
        System.out.print("Informe o valor A do intervalo: ");
        int a = scanner.nextInt();

        while (a < 1 || a > 10000) {
            System.out.println("Valor inferior do intervalo fora do intervalo permitido. O intervalo deve ser entre 1 e 10000.");
            System.out.println("Digite novamente o valor de A:");
            a = scanner.nextInt();
        }
        return a;
    }

    public static int valorB() {
        System.out.print("Informe o valor B do intervalo: ");
        int b = scanner.nextInt();

        while (b < 1 || b > 10000) {
            System.out.println("Valor superior do intervalo fora do intervalo permitido. O intervalo deve ser entre 1 e 10000.");
            System.out.println("Digite novamente o valor de B:");
            b = scanner.nextInt();
        }
        return b;
    }

    public static int valorSoma() {
        System.out.print("Informe a soma desejada (entre 1 e 36): ");
        int somaDesejada = scanner.nextInt();

        while (somaDesejada < 1 || somaDesejada > 36) {
            System.out.println("Soma desejada fora do intervalo permitido. Tente um número entre 1 e 36");
            System.out.println("Digite novamente o valor da soma: ");
            somaDesejada = scanner.nextInt();
        }
        return somaDesejada;
    }

    public static int calcularSoma(int number) {
        int soma = 0;
        while (number > 0) {
            soma += number % 10;
            number /= 10;
        }
        return soma;
    }
}
