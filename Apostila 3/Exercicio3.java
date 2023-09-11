import javax.swing.JOptionPane;

/* Escreva um programa que faz a leitura de 2 números inteiros. Caso o primeiro seja maior do que o segundo, o
programa imprime “primeiro maior do que o segundo”. Caso contrário, o programa imprime “segundo maior do que o
primeiro”. */

public class Exercicio3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o número B: "));

        if (a > b) {
            JOptionPane.showMessageDialog(null, "Primeiro maior do que o segundo.");
        } else {
            JOptionPane.showMessageDialog(null, "Segundo maior do que o primeiro");
        }
    }
}
