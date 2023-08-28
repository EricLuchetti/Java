import javax.swing.JOptionPane;

public class DolarUL {
    public static void main(String[] args) {
        double cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do Dólar: "));

        double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de Dólares: "));

        double real = cotacao * quantidade;

        JOptionPane.showMessageDialog("Quantidade em Dólar: " + quantidade + "; em Real: " + real);
        
    }    
}
