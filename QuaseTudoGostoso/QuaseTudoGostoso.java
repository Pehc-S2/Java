package QuaseTudoGostoso;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class QuaseTudoGostoso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedSet<Usuario> usuarios = new TreeSet<>();
        try {
            int escolha = 0;
            int entrada = 0;
            do {
                System.out.println("Bem vindo ao Quase tudo gostoso o que quer fazer?");
                System.out.println(
                        "Adicionar usuário (1) - Listar usuário (2) - Adicionar receita (3) - Listar receita (4)");
                entrada = scanner.nextInt();
                escolha = entrada;
                switch (entrada) {
                    case 1:
                        System.out.print("Digite o Id do Usuário: ");
                        Double idUsuario = scanner.nextDouble();
                        System.out.print("Digite o Nome do Usuário: ");
                        String nome = scanner.nextLine();
                        System.out.println("Digite o Email do Usuário: ");
                        String email = scanner.nextLine();
                        System.out.print("Digite a Senha do Usuário: ");
                        String senha = scanner.nextLine();
                        System.out.println("Digite a Data de Nascimento do Usuário: ");
                        String dtNascimento = scanner.nextLine();
                        System.out.print("Digite a Data de Inscrição do Usuário: ");
                        String dtInscricao = scanner.nextLine();
                        System.out.print("Digite o Cep do Usuário: ");
                        Double cep = scanner.nextDouble();
                        System.out.print("Digite o Genero do Usuário: ");
                        String genero = scanner.nextLine();

                        Usuario a = new Usuario(idUsuario, nome, email, dtNascimento, cep, genero, senha, dtInscricao);
                        usuarios.add(a);
                        break;

                    case 2:
                    for (Usuario usuario : usuarios){
                        System.out.println("Informações do Usuário");
                        System.out.println("ID: " + usuario.idUsuario);
                        System.out.println("Nome: " + usuario.nome);
                        System.out.println("Email: " + usuario.email);
                        System.out.println("Senha: " + usuario.senha);
                        System.out.println("Data de Nascimento: " + usuario.dtNascimento);
                        System.out.println("Data de Inscrição: " + usuario.dtInscricao);
                        System.out.println("Cep: " + usuario.cep);
                        System.out.println("Genero: " + usuario.genero);
                    }
                        break;

                    case 3:

                        break;

                    case 4:

                        break;

                    default:
                        entrada = 0;
                        System.out.println("Digite uma opção válida!");
                        break;
                }
            } while (entrada == 0);
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
