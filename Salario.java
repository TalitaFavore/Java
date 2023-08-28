package com.mycompany.salario;
import java.util.Scanner;

/**
 * @author Talita
 */
public class Salario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double horasTrabalhadas, valorHora, percentualDesconto, salarioBruto, totalDesconto, salarioLiquido;
        
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        horasTrabalhadas = scanner.nextDouble();
        
        System.out.println("Informe o valor da hora trabalhada: ");
        valorHora = scanner.nextDouble();
        
        System.out.println("Informe o valor do percentual de desconto ");
        percentualDesconto = scanner.nextDouble();
        
        salarioBruto = (horasTrabalhadas * valorHora);
        totalDesconto = ((percentualDesconto/100) * salarioBruto);
        salarioLiquido = (salarioBruto - totalDesconto);
        
        
        System.out.println("O total de horas trabalhadas é: " + horasTrabalhadas);
        System.out.println("O salário bruto é: " + salarioBruto);
        System.out.println("O total de desconto é:  " + totalDesconto);
        System.out.println("O salário líquido é: " + salarioLiquido);
    }
}
