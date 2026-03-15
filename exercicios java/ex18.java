import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o consumo em kWh");
        double consumo = scanner.nextDouble();

        double valor;

        if (consumo < 100) {
            valor = consumo * 0.20;
        } else {
            valor = consumo * 0.25;
        }

        System.out.println("Valor da conta: " + valor);
    }
}