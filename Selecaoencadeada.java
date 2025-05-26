package com.selecaoencadeada;

import javax.swing.JOptionPane;

public class Selecaoencadeada {

    public static void main(String[] args) {
       
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um número:"));
        
        if
            (numero % 10 == 0){
        JOptionPane.showMessageDialog(null,"Seu número é divisível por 10.");
        }
        else if
            (numero % 5 == 0){
        JOptionPane.showMessageDialog(null,"Seu número é divisível por 5.");
        }
            else if
                   (numero % 2 == 0){
        JOptionPane.showMessageDialog(null,"Seu número é divisível por 2.");
        } 
                   else
        JOptionPane.showMessageDialog(null,"Seu número não é divisivel. ");
    }
}