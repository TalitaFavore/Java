package com.mycompany.jogodavelha;

/**
 * @author Talita (area = pi * Math.pow(raio,2))
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JogoDaVelha extends JFrame implements ActionListener {

    private JButton[] botoes;
    private JButton botaoReiniciar;
    private JButton botaoLimparPlacar;
    private JLabel placar;
    private JLabel placarJogadorLabel;
    private JLabel placarComputadorLabel;
    private JLabel placarEmpateLabel;
    private int placarJogador;
    private int placarComputador;
    private int placarEmpate;
    private boolean turnoJogador;
    private boolean jogoTerminado;

    public JogoDaVelha() {
        super("Jogo da Velha");
        setBounds(250, 100, 700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        botoes = new JButton[9];
        for (int i = 0; i < 9; i++) {
            botoes[i] = new JButton("");
            botoes[i].setFont(new Font("Arial", Font.PLAIN, 60));
            botoes[i].addActionListener(this);
            add(botoes[i]);
            botoes[i].setBounds(20 + (i % 3) * 100, 20 + (i / 3) * 100, 100, 100);
        }

        botaoReiniciar = new JButton("Reiniciar Jogo");
        botaoReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reiniciarJogo();
            }
        });
        add(botaoReiniciar);
        botaoReiniciar.setBounds(70, 350, 200, 50);

        botaoLimparPlacar = new JButton("Limpar Placar");
        botaoLimparPlacar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparPlacar();
            }
        });
        add(botaoLimparPlacar);
        botaoLimparPlacar.setBounds(400, 350, 200, 50);

        placar = new JLabel("PLACAR");
        add(placar);
        placar.setFont(new Font("Arial", Font.PLAIN, 30));
        placar.setBounds(440, 50, 200, 50);

        placarJogadorLabel = new JLabel("Jogador: 0");
        add(placarJogadorLabel);
        placarJogadorLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        placarJogadorLabel.setBounds(400, 110, 200, 50);

        placarComputadorLabel = new JLabel("Computador: 0");
        add(placarComputadorLabel);
        placarComputadorLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        placarComputadorLabel.setBounds(400, 160, 200, 50);

        placarEmpateLabel = new JLabel("Empates: 0");
        add(placarEmpateLabel);
        placarEmpateLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        placarEmpateLabel.setBounds(400, 210, 200, 50);

        placarJogador = 0;
        placarComputador = 0;
        placarEmpate = 0;
        turnoJogador = true;
        jogoTerminado = false;

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botaoClicado = (JButton) e.getSource();

        if (!botaoClicado.getText().equals("") || jogoTerminado) {
            return;
        }

        if (turnoJogador) {
            botaoClicado.setText("X");
        } else {
            botaoClicado.setText("O");
        }

        turnoJogador = !turnoJogador;
        verificarVencedor();
        if (!turnoJogador && !jogoTerminado) {
            fazerJogadaComputador();
        }
    }

    private void verificarVencedor() {
        String[] tabuleiro = new String[9];
        for (int i = 0; i < 9; i++) {
            tabuleiro[i] = botoes[i].getText();
        }

        for (int i = 0; i < 8; i++) {
            String linha = "";
            switch (i) {
                case 0:
                    linha = tabuleiro[0] + tabuleiro[1] + tabuleiro[2];
                    break;
                case 1:
                    linha = tabuleiro[3] + tabuleiro[4] + tabuleiro[5];
                    break;
                case 2:
                    linha = tabuleiro[6] + tabuleiro[7] + tabuleiro[8];
                    break;
                case 3:
                    linha = tabuleiro[0] + tabuleiro[3] + tabuleiro[6];
                    break;
                case 4:
                    linha = tabuleiro[1] + tabuleiro[4] + tabuleiro[7];
                    break;
                case 5:
                    linha = tabuleiro[2] + tabuleiro[5] + tabuleiro[8];
                    break;
                case 6:
                    linha = tabuleiro[0] + tabuleiro[4] + tabuleiro[8];
                    break;
                case 7:
                    linha = tabuleiro[2] + tabuleiro[4] + tabuleiro[6];
                    break;
            }

            if (linha.equals("XXX")) {
                jogadorVence("Jogador");
                reiniciarJogo();
                return;
            } else if (linha.equals("OOO")) {
                jogadorVence("Computador");
                reiniciarJogo();
                return;
            }
        }

        boolean empate = true;
        for (int i = 0; i < 9; i++) {
            if (botoes[i].getText().equals("")) {
                empate = false;
                break;
            }
        }

        if (empate) {
            jogoTerminado = true;
            JOptionPane.showMessageDialog(this, "Empate!");
            botaoReiniciar.setEnabled(true);
            reiniciarJogo(); // Chama o método reiniciarJogo
            placarEmpate++; // Incrementa o placar de empates
            placarEmpateLabel.setText("Empates: " + placarEmpate); // Atualiza a label de empates
        }
    }

    private void jogadorVence(String jogador) {
        jogoTerminado = true;
        JOptionPane.showMessageDialog(this, jogador + " venceu!");
        if (jogador.equals("Jogador")) {
            placarJogador++;
            placarJogadorLabel.setText("Jogador: " + placarJogador);
        } else {
            placarComputador++;
            placarComputadorLabel.setText("Computador: " + placarComputador);
        }
        botaoReiniciar.setEnabled(true);
    }

    private void fazerJogadaComputador() {
        int contagemVazios = 0;
        for (int i = 0; i < 9; i++) {
            if (botoes[i].getText().equals("")) {
                contagemVazios++;
            }
        }

        if (contagemVazios == 0) {
            return;
        }

        Random random = new Random();
        int indiceAleatorio;
        do {
            indiceAleatorio = random.nextInt(9);
        } while (!botoes[indiceAleatorio].getText().equals(""));

        botoes[indiceAleatorio].doClick();
    }

    private void reiniciarJogo() {
        for (int i = 0; i < 9; i++) {
            botoes[i].setText("");
        }
        turnoJogador = true;
        jogoTerminado = false;
        botaoReiniciar.setEnabled(false);
    }

    private void limparPlacar() {
        placarJogador = 0;
        placarComputador = 0;
        placarEmpate = 0; // Zera a contagem de empates
        placarJogadorLabel.setText("Jogador: 0");
        placarComputadorLabel.setText("Computador: 0");
        placarEmpateLabel.setText("Empates: 0"); // Atualiza a label de empates
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JogoDaVelha());
    }
}
