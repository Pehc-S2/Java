import java.util.Scanner;

public class NumerosAB {
    public static void main(String[] args) {
        System.out.println("Programa de troca de valores");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("De um valor a A: ");
            double a = scanner.nextDouble();
            System.out.println("De um valor a B: ");
            double b = scanner.nextDouble();

            System.out.println("O valor de 'A' é: " + b);
            System.out.println("O valor de 'B' é: " + a);
        } catch (Exception e) {
            System.out.println("Erro! faz o negocio certo ai man...");
        } finally {
            scanner.close();
        }
    }
}
