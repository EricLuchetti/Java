import javax.swing.JOptionPane;

/* Escreva um programa que faz a leitura de um número inteiro e um número real. Caso o número inteiro seja menor
do que o número real, o programa deve imprimir uma mensagem dizendo isso ao usuário. Caso contrário, o programa
somente termina. */

public class Exercicio1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número A: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o número B: "));

        if (a > b) {
            JOptionPane.showMessageDialog(null, "O número A é maior que o número B");
        } else {
            JOptionPane.showMessageDialog(null, "O número B é maior que o número A");
        }
    }
}