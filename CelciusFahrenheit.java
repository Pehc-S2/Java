import java.util.Scanner;

public class CelciusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa de converção Celcius e Fahrenheit");
        double fahrenheit = 0;
        double celcius = 0;

        try {
            char tipo = '0';
            String entrada = "";
            do{
            System.out.println("Digite qual a temperatura original: (C - Celcius; F - Fahrenheit)");
            entrada = scanner.next();
            tipo = entrada.charAt(0);
            switch (tipo) {
                case 'C':
                case 'c':
                    System.out.println("Digite a temperatura em Celcius");
                    double tempCelsius = scanner.nextDouble();
                    fahrenheit = (tempCelsius * 1.8) + 32;
                    System.out.println("A temperatura em Fahrenheit é " + fahrenheit);
                    break;

                case 'F':
                case 'f':    
                    System.out.println("Digite a temperatura em Fahrenheit");
                    double tempFahr = scanner.nextDouble();
                    celcius = (tempFahr - 32) / 1.8;
                    System.out.println("A temperatura em Celsius é " + celcius);
                    break;

                default:
                entrada = "";
                System.out.println("Digite uma opção válida!");
                    break;
            }
            } while (entrada == "");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao calcular a temperatura. Tente novamente!");
        } finally {
            scanner.close();
        }
    }
}
