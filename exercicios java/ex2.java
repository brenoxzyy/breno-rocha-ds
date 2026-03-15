import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n1 = scanner.nextInt();

        System.out.println("Digite um numero");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("O maior numero é " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior numero é " + n2);
        } else {
            System.out.println("Os numeros são iguais");
        }
    }
}