import java.util.Scanner;

public class TimeVencedorGols {
    public static void main(String[] args) {
        System.out.println("Vamos ver se seu time fávorito é o vencedor!");
        Scanner scanner = new Scanner(System.in);
        String nomeTimeUm = "";
        String nomeTimeDois = "";
        double resultado = 0;
        
        try {
            System.out.println("Mas primeiro, diga o nome do primeiro time: ");
            nomeTimeUm = scanner.next();
            System.out.println("Bom, quantos gols esse time fez?");
            double golsTimeUm = scanner.nextDouble();

            System.out.println("Agora diga o nome do Segundo time: ");
            nomeTimeDois = scanner.next();
            System.out.println("E quantos gols esse time fez?");
            double golsTimeDois = scanner.nextDouble();
            
            if (golsTimeUm > golsTimeDois){
                resultado = (golsTimeUm - golsTimeDois);
                System.out.println("Parabéns o time: " + nomeTimeUm + " é o vencedor!");
                System.out.println("Com uma vantagem de " + resultado + " gols!");
            } else if (golsTimeDois > golsTimeUm) {
                resultado = (golsTimeDois - golsTimeUm);
                System.out.println("Parabéns o time: " + nomeTimeDois + " é o vencedor!");
                System.out.println("Com uma vantagem de " + resultado + " gols!");
            } else if (golsTimeUm == golsTimeDois){
                System.out.println("Foi um Empate!");
            }

        } catch (Exception ex) {
            System.out.println("Algo deu errado! tente novamente");
        } finally {
            scanner.close();
        }
    }
}
