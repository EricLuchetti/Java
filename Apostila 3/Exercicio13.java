import javax.swing.JOptionPane;

/* Escreva um programa que lê três números inteiros diferentes e os exibe em ordrescente. Se o usuário digitar
números iguais, seu programa deve exibir uma mensagem de erro e terminar. */

public class Exercicio13 {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));

        if ((numero1 == numero2) || (numero1 == numero3) || (numero2 == numero3)) {
            JOptionPane.showMessageDialog(null, "Nenhum número pode ser igual");
        } else {
            int maior = Math.max(Math.max(numero1, numero2), numero3);
            int menor = Math.min(Math.min(numero1, numero2), numero3);
            int meio = 0;

            if (((maior == numero1) && (menor == numero2)) || ((menor == numero1) && (maior == numero2))) {
                meio = numero3;
            } else if (((maior == numero1) && (menor == numero3)) || ((menor == numero1) && (maior == numero3))) {
                meio = numero2;
            } else {
                meio = numero1;
            }

            JOptionPane.showMessageDialog(null, "Ordem crescente: " + menor + " " + meio + " " + maior);
        }

    }
}
