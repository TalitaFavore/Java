package com.mycompany.salario2;
import javax.swing.JOptionPane;

/**
 * @author Talita
 */
public class Salario2 {

    public static void main(String[] args) {
    
        double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas: "));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora trabalhada: "));
        double percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do percentual de desconto: "));
        
        double salarioBruto = (horasTrabalhadas * valorHora);
        double totalDesconto = ((percentualDesconto/100) * salarioBruto);
        double salarioLiquido = (salarioBruto - totalDesconto);
        
        JOptionPane.showMessageDialog(null, "O total de horas trabalhadas é: " + horasTrabalhadas);
        JOptionPane.showMessageDialog(null, "O salário bruto é: " + salarioBruto);
        JOptionPane.showMessageDialog(null, "O total de desconto é: " + totalDesconto);
        JOptionPane.showMessageDialog(null, "O salário líquido é: " + salarioLiquido);
    }

}
