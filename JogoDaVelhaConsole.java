package com.mycompany.jogodavelhaconsole;

/**
 * @author Talita
 */
import java.util.Scanner;
import java.util.Random;

public class JogoDaVelhaConsole {

public static void main(String[] args) {
        char[][] tabuleiro = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int vez = 1; //** 1 para jogador e 2 para computador */
        char jogador = 'X';
        char computador = 'O';
        
        while (true) {
            exibirTabuleiro(tabuleiro);
            
            if (vez == 1) {
                System.out.println("Vez do jogador. Informe a linha (0-2) e coluna (0-2) separadas por espaço:");
                int linha = scanner.nextInt();
                int coluna = scanner.nextInt();
                
                if (jogadaValida(tabuleiro, linha, coluna)) {
                    tabuleiro[linha][coluna] = jogador;
                    vez = 2;
                } else {
                    System.out.println("Jogada inválida. Tente novamente.");
                }
            } else {
                System.out.println("Vez do computador.");
                int linha = random.nextInt(3);
                int coluna = random.nextInt(3);
                
                if (jogadaValida(tabuleiro, linha, coluna)) {
                    tabuleiro[linha][coluna] = computador;
                    vez = 1;
                }
            }
            
            if (verificarVitoria(tabuleiro, jogador)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Jogador venceu!");
                break;
            }
            
            if (verificarVitoria(tabuleiro, computador)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Computador venceu!");
                break;
            }
            
            if (tabuleiroCompleto(tabuleiro)) {
                exibirTabuleiro(tabuleiro);
                System.out.println("Empate!");
                break;
            }
        }
        
        scanner.close();
    }

    public static void exibirTabuleiro(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }
    
    public static boolean jogadaValida(char[][] tabuleiro, int linha, int coluna) {
        return linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' '; //** testa se as linhas e colunas estão entre 0 e 2 *//
    }
    
    public static boolean verificarVitoria(char[][] tabuleiro, char jogador) {
        //** Verificar linhas */
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }
        
        //** Verificar colunas */
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }
        
        //** Verificar diagonais */
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        
        return false;
    }
    
    public static boolean tabuleiroCompleto(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

