import java.util.Scanner;

public class ComprandoMaca {
    public static void main(String[] args) {
        System.out.println("Vamo comprar umas maçãs");
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;

        try {
            System.out.println("Quantas maçãs deseja?");
            double quantiaMaca = scanner.nextDouble();
            
            if (quantiaMaca < 12){
                resultado = quantiaMaca * 1.30;
            } else {
                resultado = quantiaMaca * 1.00;
            }

            System.out.println("A conta ficou R$ " + resultado);

        } catch (Exception ex) {
            System.out.println("Algo deu errado! tente novamente");
        } finally {
            scanner.close();
        }
    }
}
