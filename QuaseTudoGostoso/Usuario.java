package QuaseTudoGostoso;

public class Usuario {
    Double idUsuario;
    String nome;
    String email;
    String dtNascimento;
    Double cep;
    String genero;
    String senha;
    String dtInscricao;

    public Usuario(Double idUsuario, String nome,  String email, String dtNascimento, 
    Double cep, String genero, String senha, String dtInscricao){
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
