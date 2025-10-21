package QuaseTudoGostoso;

import java.util.ArrayList;

public class Preparo {
    int idPreparo;
    String modoPreparo;
    String urlVideo;
    String tempoPreparo;

    private static ArrayList<Preparo> preparos = new ArrayList<>();
    private static int contador = 1;

    public Preparo(String modoPreparo, String urlVideo, String tempoPreparo){
        this.idPreparo = contador++;
        this.modoPreparo = modoPreparo;
        this.urlVideo = urlVideo;
        this.tempoPreparo = tempoPreparo;

        preparos.add(this);
    }

    public void setIdPreparo(int idPreparo) {
        this.idPreparo = idPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public void setTempoPreparo(String tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    //

    public int getIdPreparo() {
        return this.idPreparo;
    }

    public String getModoPreparo() {
        return this.modoPreparo;
    }

    public String getUrlVideo() {
        return this.urlVideo;
    }

    public String getTempoPreparo() {
        return this.tempoPreparo;
    }
}
