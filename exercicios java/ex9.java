import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int n2 = scanner.nextInt();

        if (n1 % n2 == 0) {
            System.out.println("É multiplo");
        } else {
            System.out.println("Não é multiplo");
        }
    }
}