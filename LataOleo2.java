package com.mycompany.lataoleo2;
import javax.swing.JOptionPane;

/**
 * @author Talita
 */
public class LataOleo2 {

    public static void main(String[] args) {
        final double pi = 3.14159;
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio da lata: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura da lata: "));
        JOptionPane.showMessageDialog(null, "O volume da lata de óleo é: " + (pi*(raio*raio)*altura));
    }
}
