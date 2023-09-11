import javax.swing.JOptionPane;

/* Escreva um programa que faz a leitura de dois números reais e verifica se eles são iguais. Se forem, o programa
deve mostrar uma mensagem ao usuário informando-o disso. Caso contrário, o programa somente termina. */

public class Exercicio2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o número B: "));

        if (a == b) {
            JOptionPane.showMessageDialog(null, "Os números são iguais");
        } else {
            JOptionPane.showMessageDialog(null, "Os números são diferentes");
        }
    }
}