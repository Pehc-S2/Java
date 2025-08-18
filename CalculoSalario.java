import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
        System.out.println("Programa que irá calcular o valor de seu salário");
        Scanner scanner = new Scanner(System.in);

        try {
        System.out.println("Iforme o quanto recebe em horas: ");
        double valorEmHoras = scanner.nextDouble();
        System.out.println("Iforme quantas horas trabalha: ");
        double horasDeTrabalho = scanner.nextDouble();

        double total = valorEmHoras * horasDeTrabalho; 

        if (horasDeTrabalho > 40) {
            total = total + (total / 2);
        }

        System.out.println("O seu salário é: " + total + "Reais");
       } catch (Exception e) {
        System.out.println("Erro! Faz certo!");
       } finally {
        scanner.close();
       }
    }
}
