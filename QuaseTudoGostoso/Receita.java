package QuaseTudoGostoso;

public class Receita {
    int idReceita;
    String titulo;
    String descricao;
    String imagem;
    Custo custo;
    Preparo preparo;
    Dificuldade dificuldade;
    Usuario usuario;


    public Receita(int idReceita, String titulo, String descricao, String imagem, 
    Custo custo, Preparo preparo, Dificuldade dificuldade, Usuario usuario){
        this.idReceita = idReceita;
        this.titulo = titulo;
        this.descricao = descricao;
        this.imagem = imagem;
        this.custo = custo;
        this.preparo = preparo;
        this.dificuldade = dificuldade;
        this.usuario = usuario;
    }
}
