import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a distancia da viagem");
        double distancia = scanner.nextDouble();

        System.out.println("Digite o consumo do carro (km/L)");
        double consumo = scanner.nextDouble();

        double litros = distancia / consumo;

        System.out.println("Litros necessários: " + litros);
    }
}