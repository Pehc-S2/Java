public class ContagemImparPar {
    public static void main(String[] args) {
    System.out.println("Contagem Ímpar e Par de 30 a 0");
    System.out.println("Primeiro os Pares: ");

    for (int i = 30; i >= 0; i--){
        if (i % 2 == 0){
            System.out.println(i);
        }
    }
    System.out.println("Agora os Ímpares: ");

    for (int i = 30; i >= 0; i--){
        if (i % 2 > 0){
            System.out.println(i);
        }
    }
    }
    
}
