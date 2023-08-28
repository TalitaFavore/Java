package com.mycompany.lataoleo1;
import java.util.Scanner;

/**
 * @author Talita
 */
public class LataOleo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double pi = 3.14159;
        double raio, altura;
        System.out.println("Informe o raio da lata: ");
        raio = scanner.nextDouble();
        
        System.out.println("Informe a altura da lata: ");
        altura = scanner.nextDouble();
        
        double volume = (pi*(raio*raio)*altura);
        System.out.println("O volume da lata de óleo é: " + volume);   
    }
}
