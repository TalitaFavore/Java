package com.mycompany.celsiusfahrenheit2;
import javax.swing.JOptionPane;

/**
 * @author Talita
 */

public class CelsiusFahrenheit2 {

    public static void main(String[] args) {
        
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Informe a temperatura em C°: "));
        JOptionPane.showMessageDialog(null, "A temperatura em F° é: " + ((9 * celsius + 160)/5));
    }
}
