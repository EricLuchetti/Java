import javax.swing.JOptionPane;

public class QuatroNumerosUL {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º número: "));

        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º número: "));

        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3º número: "));

        double n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 4º número: "));

        double q1 = n1 * n1;
        double q2 = n2 * n2;
        double q3 = n3 * n3;
        double q4 = n4 * n4;

        double resultado = q1 + q2 + q3 + q4;

        JOptionPane.showMessageDialog(null,"O dobro dos números são respectivamente: " + q1 + "; " + q2 + "; " + q3 + "; " + q4 + " e a soma dos números é: " + resultado);
        
    }  
}
