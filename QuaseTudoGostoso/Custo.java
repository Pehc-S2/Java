package QuaseTudoGostoso;

import java.util.ArrayList;

public class Custo {
    private int idCusto;
    private String custo;

    private static ArrayList<Custo> custos = new ArrayList<>();
    private static int contador = 1;

    public Custo(String custo) {
        this.idCusto = contador++;
        this.custo = custo;

        custos.add(this);
    }

    public void setIdCusto(int idCusto) {
        this.idCusto = idCusto;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }

    //

    public int getIdCusto() {
        return this.idCusto;
    }

    public String getCusto() {
        return this.custo;
    }
}
