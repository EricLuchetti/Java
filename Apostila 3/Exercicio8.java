
/* Escreva um programa que lê a altura e peso do usuário e calcula o seu IMC, índice de massa corpórea.
O programa deve exibir um texto para o usuário conforme a tabela abaixo:
        IMC                     Texto
    Abaixo de 18,5      ||  Abaixo do peso ideal.
    Entre 18,5 e 24,9   ||  Peso ideal, muito bem.
    Entre 25,0 e 29,9   ||  Sobrepeso, um regime leve pode ajudar.
    Entre 30,0 e 34,9   ||  Obesidade leve.
    Entre 35,0 e 39,9   ||  Obesidade moderada.
    Acima de 40         ||  Obesidade mórbida. */

import javax.swing.JOptionPane;

public class Exercicio8 {
    public static void main(String[] args) {
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso ideal");
        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "Peso ideal, muito bem");
        } else if (imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "Sobrepeso, um regime leve pode ajudar");
        } else if (imc >= 30 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "Obesidade leve");
        } else if (imc >= 35 && imc <= 39.9) {
            JOptionPane.showMessageDialog(null, "Obesidade moderada");
        } else if (imc >= 40) {
            JOptionPane.showMessageDialog(null, "Obesidade mórbida");
        }

    }
}
