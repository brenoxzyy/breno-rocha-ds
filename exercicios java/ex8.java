import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto");
        double valor = scanner.nextDouble();

        if (valor > 100) {
            valor = valor * 0.80;
        } else {
            valor = valor * 0.90;
        }

        System.out.println("Valor final: " + valor);
    }
}