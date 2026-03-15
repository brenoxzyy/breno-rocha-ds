import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        double n1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero");
        double n2 = scanner.nextDouble();

        System.out.println("Digite a operação (+ - * /)");
        String op = scanner.next();

        if (op.equals("+")) {
            System.out.println("Resultado: " + (n1 + n2));
        } else if (op.equals("-")) {
            System.out.println("Resultado: " + (n1 - n2));
        } else if (op.equals("*")) {
            System.out.println("Resultado: " + (n1 * n2));
        } else if (op.equals("/")) {
            System.out.println("Resultado: " + (n1 / n2));
        } else {
            System.out.println("Operação inválida");
        }
    }
}