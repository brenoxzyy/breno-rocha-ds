import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salario");
        double salario = scanner.nextDouble();

        if (salario < 2000) {
            salario = salario * 1.10;
        } else if (salario <= 4000) {
            salario = salario * 1.07;
        } else {
            salario = salario * 1.05;
        }

        System.out.println("Salario final: " + salario);
    }
}