public class OrdenacaoVetores {
    public static void main(String[] args) {
        int[] numeros = { 6, 4, 3, 2, 8, 10, 1, 7};
        // Declarado um vetor com 8 posições.
        int bolso = 0; 
        /* "bolso" serve para guardar um valor para assim efetuar as trocas
            por exemplo, no codigo, se pega a primeira posição do vetor (6)
            e guarda no bolso, depois se compara a posição atual com a seguinte
            (6, 4) e como a condição do "if" foi atendida o valor da primeira 
            posição (6) se torna o valor da segunda posição (4), e a segunda 
            posição recebe o valor que estava no bolso (6), basicamente 
            fazendo uma troca entre elas... 
            (sei que esse texto é maior do que deveria... desculpe kk) */ 
        int i = 0;

        // para imprimir todos os valores do vetor no estado inicial.
        System.out.println("Vetor de forma desordenada: ");
        for (i = 0; i < 8; i++) {
            System.out.println(" " + numeros[i]);
        }

        // Aqui é onde seram feitas as comparações e trocas entre numeros se assim necessario.
        // o "j" não se repete 5 vezes para ele não comparar o ultimo numero com um outro não existente, evitando um erro.
        for (i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    bolso = numeros[j];
                    // Aqui é feita a impressão de todas as trocas por escrito.
                    System.out.println(" ");
                    System.out.println("Numero: " + numeros[j + 1] + " trocado por: " + numeros[j]);
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = bolso;

                    // E aqui é feita a impressão de todos os valores do vetor a cada alteração.
                    System.out.println("Vetor na forma atual: ");
                    for (int k = 0; k < 8; k++) {
                        System.out.println(" " + numeros[k]);
                    }
                }
            }
        }
        // E aqui é feita a impressão de todos os valores do vetor já organizados.
        System.out.println(" ");
        System.out.println("Vetor de forma organizada: ");
        for (i = 0; i < 8; i++) {
            System.out.println(" " + numeros[i]);
        }
    }
}
