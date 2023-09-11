
/* Escreva um programa que verifica se um dado número inteiro de quatro dígitos é uma senha válida. Para ser
considerado como uma senha válida, um número tem que ter as seguintes características:
- O primeiro dígito da esquerda para a direita tem que ser 8 ou 5
- O quarto dígito da esquerda para a direita tem que ser 5 ou 1
- A soma do segundo com o terceiro dígitos tem que ser 3 caso o quarto dígito seja 5 e 0 caso ele seja 1
Por exemplo, o número 8125 é uma senha válida pois começa com 8, termina com 5 e a soma dos dois dígitos do
meio é 3. */

import javax.swing.JOptionPane;

public class Exercicio12 {
    public static void main(String[] args) {
        String senha = JOptionPane.showInputDialog("Digite a senha: ");

        String[] array = senha.split("", 0);

        int numero1 = Integer.parseInt(array[0]);
        int numero2 = Integer.parseInt(array[1]);
        int numero3 = Integer.parseInt(array[2]);
        int numero4 = Integer.parseInt(array[3]);

        if (array.length != 4) {
            JOptionPane.showMessageDialog(null, "A senha deve conter 4 dígitos");
        } else {
            if (numero1 != 8 && numero1 != 5) {
                JOptionPane.showMessageDialog(null, "O primeiro dígito da esquerda para a direita tem que ser 8 ou 5");
            } else if (numero4 != 5 && numero4 != 1) {
                JOptionPane.showMessageDialog(null, "O quarto dígito da esquerda para a direita tem que ser 5 ou 1");
            } else if ((numero4 == 5 && (numero2 + numero3) != 3) || (numero4 == 1 && (numero2 + numero3) != 0)) {
                JOptionPane.showMessageDialog(null,
                        "A soma do segundo com o terceiro dígitos tem que ser 3 caso o quarto dígito seja 5 e 0 caso ele seja 1");
            } else {
                JOptionPane.showMessageDialog(null, "Senha válida.");
            }
        }

    }
}
