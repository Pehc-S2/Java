package QuaseTudoGostoso;

import java.util.ArrayList;

public class Usuario {
    private int idUsuario;
    private String nome;
    private String email;
    private String dtNascimento;
    private int cep;
    private String genero;
    private String senha;
    private int salt;
    private String dtInscricao;
    private String uuid;

    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static int contador = 1;



    public Usuario(String nome, String email, String dtNascimento,
        int cep, String genero, String senha, int salt, String dtInscricao, String uuid) {
        this.idUsuario = contador++;
        this.nome = nome;
        this.email = email;
        this.dtNascimento = dtNascimento;
        this.cep = cep;
        this.genero = genero;
        this.senha = senha;
        this.salt = salt;
        this.dtInscricao = dtInscricao;
        this.uuid = uuid;

        usuarios.add(this);
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSalt(int salt) {
        this.salt = salt;
    }

    public void setDtInscricao(String dtInscricao) {
        this.dtInscricao = dtInscricao;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    //

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getEmail() {
        return this.email;
    }

    public String getDtNascimento() {
        return this.dtNascimento;
    }

    public int getCep() {
        return this.cep;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getSenha() {
        return this.senha;
    }

    public int getSalt() {
        return this.salt;
    }

    public String getDtInscricao() {
        return this.dtInscricao;
    }

    public String getUuid() {
        return this.uuid;
    }
}
