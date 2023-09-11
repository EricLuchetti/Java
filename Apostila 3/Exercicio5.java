import javax.swing.JOptionPane;

/* Escreva um programa que lê três inteiros a partir do teclado e imprime a soma, a média, o produto, o menor e o
maior desses números. */

public class Exercicio5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número A: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o número B: "));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o número C: "));

        int soma = a + b + c;
        int media = (soma / 3);
        int produto = a * b * c;
        int maior = 0;
        int menor = 0;

        if ((a > b) && (a > c)) {
            maior = a;
        } else if ((b > a) && (b > c)) {
            maior = b;
        } else if ((c > a) && (c > b)) {
            maior = c;
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível definir o maior número");
        }

        if ((a < b) && (a < c)) {
            menor = a;
        } else if ((b < a) && (b < c)) {
            menor = b;
        } else if ((c < a) && (c < b)) {
            menor = c;
        } else {
            JOptionPane.showMessageDialog(null, "Não foi possível definir o menor número");
        }

        JOptionPane.showMessageDialog(null, "Soma: " + soma + " ; Média: " + media + " ; Produto: " + produto
                + " ; Maior Número: " + maior + " ; Menor Número: " + menor);

    }
}
