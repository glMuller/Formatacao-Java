package br.com.fiap.main;

import javax.swing.*;

public class PraticandoFrase {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite uma frase qualquer");
        JOptionPane.showMessageDialog(null,frase);
        JOptionPane.showMessageDialog(null,frase.length());
        JOptionPane.showMessageDialog(null,frase.toUpperCase());
        String palavra1 = JOptionPane.showInputDialog("Digite uma frase existente na frase");
        String palavra2 = JOptionPane.showInputDialog("Digite uma nova palavra");
    }
}
