package com.mycompany.areatriangulo2;
/**
 * @author Talita
 */
import javax.swing.JOptionPane;

public class AreaTriangulo2 {

    public static void main(String[] args) {
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura"));
        JOptionPane.showMessageDialog(null, "A área é: " + ((base * altura) / 2));
    }
}
