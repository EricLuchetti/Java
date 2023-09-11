import javax.swing.JOptionPane;

/* Escreva um programa que pede para o usuário inserir dois números, obtém os números do usuário e então imprime
o maior número seguido pelas palavras “é o maior”. Se os números forem iguais, imprime a mensagem “Estes
números são iguais”. */

public class Exercicio4 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o número B: "));

        if (a > b) {
            JOptionPane.showMessageDialog(null, a + " é maior");
        } else {
            JOptionPane.showMessageDialog(null, b + " é maior");
        }

    }
}
