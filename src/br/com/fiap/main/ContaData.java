package br.com.fiap.main;

import javax.swing.*;
import java.time.Period;

public class ContaData {
    public static void main(String[] args) {
        Period dataInicial = Period.parse(JOptionPane.showInputDialog("Digite uma data inicial:"));
        Period dataFinal = Period.parse(JOptionPane.showInputDialog("Digite uma data final:"));
        JOptionPane.showMessageDialog(null,"Data inicial: ");

    }
}
