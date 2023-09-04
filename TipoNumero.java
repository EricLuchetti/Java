import javax.swing.JOptionPane;

public class TipoNumero {
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

        if (numero > 0) {
            JOptionPane.showMessageDialog(null, "Número positivo");
        } else if (numero == 0) {
            JOptionPane.showMessageDialog(null, "Número neutro");
        } else {
            JOptionPane.showMessageDialog(null, "Número negativo");
        }

    }

}
