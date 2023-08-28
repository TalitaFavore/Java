package com.mycompany.celsiusfahrenheit1;
import java.util.Scanner;

/**
 * @author Talita
 */

public class CelsiusFahrenheit1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double celsius, fahrenheit;
        System.out.println("Informe a temperatura em C°: ");
        celsius = scanner.nextDouble();
        
        fahrenheit = (9 * celsius + 160)/5;
        System.out.println("A temperatura em F° é: " + fahrenheit);
    }
}
