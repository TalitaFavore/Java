package com.mycompany.exemploif;
import java.util.Scanner;

/**
 * @author Talita
 */
public class ExemploIf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;
        
        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();
        
        if (idade < 18){
            System.out.println("Você é menor de idade.");
        } else if (idade > 18 && idade < 200) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Idade inválida. Você provavelmente foi de comes e bebes.");
        }
    }
}
