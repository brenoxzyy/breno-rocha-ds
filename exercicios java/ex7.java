import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius");
        double c = scanner.nextDouble();

        double f = (c * 9/5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + f);
    }
}