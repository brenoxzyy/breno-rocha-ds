import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
        double n1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota");
        double n2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}