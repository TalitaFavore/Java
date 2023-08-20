package com.mycompany.torneiotenis;

import java.util.Scanner;

/**
 * @author Talita
 */
public class TorneioTenis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seus resultados dos seis torneios. Use V para vitória e D para derrota.");
        String sequencia = scanner.nextLine();

        if (sequencia.length() != 6) {
            System.out.println("Sequência inválida. Por favor, insira exatamente 6 letras.");
        } else {
            int vCount = 0;
            int dCount = 0;
            boolean isValid = true;

            for (char letra : sequencia.toCharArray()) {
                if ((letra != 'v' && letra != 'V') && (letra != 'd' && letra != 'D')) {
                    System.out.println("Sequência inválida. Use apenas 'V' ou 'D' como letras.");
                    isValid = false;
                    break;
                }

                if (letra == 'v' || letra == 'V') {
                    vCount++;
                } else {
                    dCount++;
                }
            }

            if (isValid) {
                if (vCount == 5 || vCount == 6) {
                    System.out.println("Grupo 1");
                } else if (vCount == 3 || vCount == 4) {
                    System.out.println("Grupo 2");
                } else if (vCount == 1 || vCount == 2) {
                    System.out.println("Grupo 3");
                } else if (vCount == 0) {
                    System.out.println("Grupo -1");
                    System.out.println("Muito obrigado por sua participação!");
                } else {
                    System.out.println("Sequência não corresponde a nenhum grupo.");
                }
            }
        }
    }
}
