import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        System.out.println("Programa de Contagem regressiva");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite um numero para começar: ");
            double inicial = scanner.nextDouble();

            for (double i = inicial; i >= 0; i--){
                System.out.println(inicial);
                inicial = inicial - 1;

            }
        } catch (Exception e) {
            System.out.println("Erro! Faz o negócio certo man...");
        } finally {
            scanner.close();
        }
    }
}
