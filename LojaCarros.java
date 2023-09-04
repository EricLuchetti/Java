import java.util.Scanner;

public class LojaCarros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de carros vendidos pelo vendedor: ");
        Integer carrosVendidos = sc.nextInt();

        System.out.println("Digite o valor das vendas: ");
        double vendas = sc.nextDouble();

        System.out.println("Digite o seu salário: ");
        double salarioFixo = sc.nextDouble();

        System.out.println("Digite o valor recebido por carro vendido: ");
        double valorRecebido = sc.nextDouble();

        double pagamento = salarioFixo + (carrosVendidos * valorRecebido) + (vendas * 5 / 100);

        System.out.println("Seu ganho este mês foi dê: " + pagamento);

        sc.close();

    }
}