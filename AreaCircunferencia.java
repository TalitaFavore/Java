package com.mycompany.areacircunferencia;

import java.util.Scanner;

/**
 * @author Talita (area = pi * Math.pow(raio,2))
 */
public class AreaCircunferencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.14159; //definição de constante
        double area, raio;
        System.out.println("Informe o valor do raio da circunferência: ");
        raio = scanner.nextDouble();

        area = pi * (raio * raio);

        System.out.println("A área da circunferência é igual a: " + area);
    }
}
