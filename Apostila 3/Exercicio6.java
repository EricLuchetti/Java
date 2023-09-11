import javax.swing.JOptionPane;

public class Exercicio6 {

/* Escreva um programa que lê dois valores reais. O primeiro valor é o saldo de uma conta bancária e o segundo é um
valor que o usuário deseja sacar desta conta. Caso seja possível efetuar o saque (ou seja, o saldo não fique negativo), o
programa deve mostrar o saldo remanescente. Caso contrário, deve informar o usuário que não foi possível realizar o
saque. */
    public static void main(String[] args) {
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo: "));
        double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o saque: "));

        if (saque > saldo) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o saque");
        } else {
            double saldoRemanescente = saldo - saque;
            JOptionPane.showMessageDialog(null, "Saldo remanescente: " + saldoRemanescente);
        }

    }
}
