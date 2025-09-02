import java.util.Scanner;

public class AnaliseTriangulo {
    public static void main(String[] args) {
        System.out.println("Programa de identificação de triangulos");
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Diga a medida do primeiro lado: ");
            double lado1 = scanner.nextDouble();
            System.out.println("Diga a medida do segundo lado: ");
            double lado2 = scanner.nextDouble();
            System.out.println("Diga a medida do terceiro lado: ");
            double lado3 = scanner.nextDouble();

            if (
                (lado1 <= (lado2 + lado3 ))&&
                (lado2 <= (lado1 + lado3 ))&&
                (lado3 <= (lado2 + lado1 ))
             ){
                System.out.println("As medidas informadas formam um Triangulo");
             } else {
                System.out.println("As medidas informadas não formam um Triangulo");
             }

        } catch (Exception ex) {
            System.out.println("Algo deu errado! tente novamente");
        } finally {
            scanner.close();
        }
    }
}

//Bom dia