import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não pode votar");
        } else if (idade < 18 || idade >= 70) {
            System.out.println("Voto opcional");
        } else {
            System.out.println("Voto obrigatório");
        }
    }
}