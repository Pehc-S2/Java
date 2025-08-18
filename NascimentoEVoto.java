import java.util.Scanner;

public class NascimentoEVoto {
    public static void main(String[] args) {
        System.out.println("Programa que mede se você pode votar ou não :)");
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Informe o Ano Atual: ");
            double anoAtual = scanner.nextDouble();
            System.out.println("Informe o Mes Atual: ");
            double mesAtual = scanner.nextDouble();

            System.out.println("Agora Informe o Ano do seu nascimento: ");
            double anoNascimento = scanner.nextDouble();
            System.out.println("E Também Mes do seu nascimento: ");
            double mesNascimento = scanner.nextDouble();

            if (mesNascimento <= mesAtual && anoNascimento - anoAtual >= 17){
                System.out.println("Você pode votar");
            } else {
                System.out.println("Você não pode votar");
            }

        } catch (Exception ex){
            System.out.println("Erro! tente novamente");
        } finally {
            scanner.close();
        }
    }
}
