
/* Escreva um programa que lê as notas de 10 alunos e calcula a média aritmética delas. Caso a média seja pelo
menos 6, o programa deve exibir a quantidade de alunos que tiveram nota maior do que 8. Caso contrário, o programa
deve exibir a quantidade de alunos que tiraram nota 0. */

import java.util.LinkedList;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Exercicio14 {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota: "));
        double nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota: "));
        double nota5 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quinta nota: "));
        double nota6 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sexta nota: "));
        double nota7 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sétima nota: "));
        double nota8 = Double.parseDouble(JOptionPane.showInputDialog("Digite a oitava nota: "));
        double nota9 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nona nota: "));
        double nota10 = Double.parseDouble(JOptionPane.showInputDialog("Digite a décima nota: "));

        double[] array = { nota1, nota2, nota3, nota4, nota5, nota6, nota7, nota8, nota9, nota10 };
        double media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 + nota7 + nota8 + nota9 + nota10) / 10;

        int tamanhoArray = 0;

        if (media >= 6) {
            
            for (double item : array) {
                if (item > 8) {
                    tamanhoArray++;
                }
            }

            JOptionPane.showMessageDialog(null, "Média: " + media + " ; quantidade de alunos com a nota maior que 8: " + tamanhoArray);
        } else {
            
            for (double item : array) {
                if (item == 0) {
                    tamanhoArray++;
                }
            }

            JOptionPane.showMessageDialog(null, "Média: " + media + " ; quantidade de alunos com a nota igual a 0: " + tamanhoArray);
        }
    }
}
