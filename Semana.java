import javax.swing.JOptionPane;

public class Semana {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do dia da semana"));

        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "Segunda-feira");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Terça-feira");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Quarta-feira");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Quinta-feira");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Sexta-feira");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sábado");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Segunda");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Não foi possível identificar o dia da semana");

        }
    }
}
