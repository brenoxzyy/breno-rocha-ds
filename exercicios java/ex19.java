import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int n2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero");
        int n3 = scanner.nextInt();

        int menor = n1;

        if (n2 < menor) {
            menor = n2;
        }

        if (n3 < menor) {
            menor = n3;
        }

        System.out.println("O menor numero é " + menor);
    }
}