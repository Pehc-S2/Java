/*
package QuaseTudoGostoso;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class QTG {
    public static void main(String[] args) {
        SortedSet<Receita> receitas = new TreeSet<>();
        Custo custo1 = new Custo(1, "55,25");
        Dificuldade dif1 = new Dificuldade(1, "Quase Impossivel");
        Preparo prep1 = new Preparo(1, "...", "UrldoVideo", "1h34min");
        Usuario user1 = new Usuario(1, "João Kléber", "JK.gmail.com", 
        "02/08/1957", 0, "Masculino", "123", "03/08/1957");    
        Receita receita1 = new Receita(1, "Ovo Frito", "Ótima receita para toda hora", 
        "ovoFrito.jpg", custo1, prep1, dif1, user1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Titulo da Receita: ");
        String titulo = scanner.nextLine();
        System.out.println("Digite uma descrição para esta Receita: ");
        String descricao = scanner.nextLine();
        System.out.println("Digite o nome do arquivo da foto: ");
        String imagem = scanner.nextLine();

        Receita receita2 = new Receita(2, titulo, descricao, imagem, custo1, prep1, dif1, user1);

        for (Receita receita : user1.receitas){
            System.out.println("");
            System.out.println("Informações da Receita");
            System.out.println("Titulo: " + receita.titulo);
            System.out.println("Descrição: " + receita.descricao);
            System.out.println("Imagem: " + receita.imagem);
            System.out.println("Custo: " + custo1.custo);
            System.out.println("Modo de Preparação: " + prep1.modoPreparo);
            System.out.println("Tempo de Preparação: " + prep1.tempoPreparo);
            System.out.println("Dificuldade: " + dif1.dificuldade);
            System.out.println("Autor da Receita: " + user1.nome);
        }
        scanner.close();
    }
}
*/