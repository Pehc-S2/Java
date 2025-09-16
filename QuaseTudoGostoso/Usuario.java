package QuaseTudoGostoso;
import java.util.ArrayList;

public class Usuario {
    int idUsuario;
    String nome;
    String email;
    String dtNascimento;
    int cep;
    String genero;
    String senha;
    String dtInscricao;

    ArrayList<Receita> receitas = new ArrayList<>();

    public Usuario(int idUsuario, String nome,  String email, String dtNascimento, 
    int cep, String genero, String senha, String dtInscricao){
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.dtNascimento = dtNascimento;
        this.cep = cep;
        this.genero = genero;
        this.senha = senha;
        this. dtInscricao = dtInscricao;
    }
} 
