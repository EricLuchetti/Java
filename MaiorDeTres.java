import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double a = sc.nextDouble();

        System.out.println("Digite o segundo número");
        double b = sc.nextDouble();

        System.out.println("Digite o terceiro número");
        double c = sc.nextDouble();

        if ((a > b) && (a > c)) {
            System.out.print("O maior valor é " + a);
        } else if ((b > a) && (b > c)) {
            System.out.print("O maior valor é " + b);
        } else if ((c > a) && (c > b)) {
            System.out.print("O maior valor é " + c);
        } else {
            System.out.print("Não foi possível definir o maior valor");
        }

        sc.close();
    }
}
