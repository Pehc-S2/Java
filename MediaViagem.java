import java.util.Scanner;

public class MediaViagem {
    public static void main(String[] args) {
        System.out.println("Média de tempo de uma viagem");
        Scanner scanner = new Scanner(System.in);
    try {
        System.out.println("Digite a distancia: ");
        double distancia = scanner.nextDouble();
        System.out.println("Digite o tempo: ");
        double tempo = scanner.nextDouble();

        double media = distancia / tempo;
        System.out.println("A velocidade média da viagem é: " + media);
        } catch (Exception e) {
            System.out.println("Erro my friend! escreve certo ai!");
        } finally {
            scanner.close();
        }
    }
}
