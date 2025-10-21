package QuaseTudoGostoso;

import java.util.ArrayList;

public class Dificuldade {
    private int idDificuldade;
    private String dificuldade;

    private static ArrayList<Dificuldade> dificuldades = new ArrayList<>();
    private static int contador = 1;


    public Dificuldade(String dificuldade){
        this.idDificuldade = contador++;
        this.dificuldade = dificuldade;

        dificuldades.add(this);
    }

    public void setIdDificuldade(int idDificuldade) {
        this.idDificuldade = idDificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    //

    public int getIdDificuldade() {
        return this.idDificuldade;
    }

    public String getdificuldade() {
        return this.dificuldade;
    }
}
