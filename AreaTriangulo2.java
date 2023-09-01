package com.mycompany.areatriangulo2;
/**
 * @author Talita
 * "Double.parseDouble" converte de String para Double, já que tudo o que é informado no campo de "JOptionPane.showInputDialog" é interpretado 
 *como uma String, e é necessário que esteja em double para realizar o cálculo.
 */
import javax.swing.JOptionPane;

public class AreaTriangulo2 {

    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura"));
        JOptionPane.showMessageDialog(null, "A área é: " + ((base * altura) / 2));
    }
}
