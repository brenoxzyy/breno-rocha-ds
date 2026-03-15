import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota");
        double nota = scanner.nextDouble();

        System.out.println("Digite a frequencia");
        double frequencia = scanner.nextDouble();

        if (nota >= 7 && frequencia >= 75) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}