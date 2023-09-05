import javax.swing.JOptionPane;

public class Bhaskara {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente C: "));

        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "Não existe raiz para esta equação");
        } else if (delta == 0) {
            double raiz = (-b) / (2 * a);
            JOptionPane.showMessageDialog(null, raiz);
        } else {
            double raiz1 = (-b) + Math.sqrt(delta) / (2 * a);
            double raiz2 = (-b) - Math.sqrt(delta) / (2 * a);
            JOptionPane.showMessageDialog(null, "Raiz 1: " + raiz1 + "Raiz  2: " + raiz2);
        }
    }
}
