package com.mycompany.areatriangulo2;
/**
 * @author Talita
 * (area = pi * Math.pow(raio,2)) é uma fórmula que também pode ser usada. É recomendado que se use o método 'pow' apanas quando a exponenciação for maior que 2.
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
