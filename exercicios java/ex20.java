import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado 1");
        int a = scanner.nextInt();

        System.out.println("Digite o lado 2");
        int b = scanner.nextInt();

        System.out.println("Digite o lado 3");
        int c = scanner.nextInt();

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Não forma triangulo");
        } 
        else if (a == b && b == c) {
            System.out.println("Triangulo equilatero");
        } 
        else if (a == b || a == c || b == c) {
            System.out.println("Triangulo isosceles");
        } 
        else {
            System.out.println("Triangulo escaleno");
        }
    }
}