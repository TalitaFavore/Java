package com.mycompany.exemploif1;
import java.util.Scanner;

/**
 * @author Talita
 */
public class ExemploIf1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        
        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();
        
        if (idade <5){
            System.out.println("Você é um bebê.");
        } else if (idade < 12) {
            System.out.println("Você é uma criança.");
        } else if (idade < 17) {
            System.out.println("Você é um adolescente.");
        } else if (idade < 64) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é um idoso.");
        }
    }
}
