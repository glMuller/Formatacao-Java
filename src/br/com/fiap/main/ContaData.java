package br.com.fiap.main;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ContaData {
    public static void main(String[] args) {
        // Definir o formato de data que o usuário vai usar
        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");

       //Receber data Inicial
        String dataInicialString = JOptionPane.showInputDialog("Digite uma data inicial:");
        LocalDate dataInicial = LocalDate.parse(dataInicialString, formatado);

        //Receber data final
        String dataFinalString = JOptionPane.showInputDialog("Digite uma data final");
        LocalDate dataFinal = LocalDate.parse(dataFinalString, formatado);


        //Usar Period pra descobrir o período entre as datas
        Period periodo = Period.between(dataInicial,dataFinal);

        //Mostrar ao usuário
        JOptionPane.showMessageDialog(null,"Data inicial: " + dataInicial.format(formatado) + "\nData final: " + dataFinal.format(formatado) + "\nEntre as datas fornecidas existem: " + periodo.getYears() + "ano(s), " + periodo.getMonths() + "Mês(es) e " + periodo.getDays() + "Dia(s)");

    }
}
