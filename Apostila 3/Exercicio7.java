
/* Faça um programa que lê um valor real, representando o valor de uma peça de roupa. A seguir, o programa deve ler
um inteiro (0, 1 ou 2) os quais representam as seguintes opções:
    0 – Compra à vista
    1 – Compra parcelada no cartão
    2 – Crediário
Na opção 0, o programa deve calcular quanto custa a peça de roupa com 10% de desconto.
Na opção 1, o programa deve perguntar ao usuário quantas parcelas deseja utilizar e exibir o valor da parcela.
Na opção 2, o usuário pagará juros de 10% sobre o valor total. O programa deve ler o número de parcelas
desejado e exibir o valor de cada parcela, que é calculado sobre o valor com juros.
Caso o usuário digite alguma opção diferente de 0, 1 ou 2, o programa deve informar “opção inválida” e
terminar. */

import javax.swing.JOptionPane;

public class Exercicio7 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da roupa: "));
        int metodo = Integer.parseInt(JOptionPane.showInputDialog("Digite o método de pagamento: "));
        double total = 0;
        double porcentagem = valor * 0.1;
        int parcelas = 0;

        switch (metodo) {
            case 0:
                total = valor - porcentagem;

                JOptionPane.showMessageDialog(null, "Valor total: " + total);
                break;
            case 1:
                parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas (Máximo de 12x)"));
                total = valor / parcelas;

                JOptionPane.showMessageDialog(null, "Valor por parcela: " + total);
                break;
            case 2:
                parcelas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de parcelas (Máximo de 12x)"));
                total = (valor + porcentagem) / parcelas;

                JOptionPane.showMessageDialog(null, "Valor por parcela: " + total);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");

        }
    }
}
