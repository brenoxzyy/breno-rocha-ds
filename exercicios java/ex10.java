import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura");
        double h = scanner.nextDouble();

        System.out.println("Digite seu sexo (M ou F)");
        String sexo = scanner.next();

        if (sexo.equals("M")) {
            double peso = (72.7 * h) - 58;
            System.out.println("Peso ideal: " + peso);
        } else {
            double peso = (62.1 * h) - 44.7;
            System.out.println("Peso ideal: " + peso);
        }
    }
}