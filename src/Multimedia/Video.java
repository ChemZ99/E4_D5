package Multimedia;

public class Video extends Riproducibile implements play {

    private int luminosita;
    public Video(String titolo, int volume, int durata, int luminosita){
        super(titolo,volume,durata);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }
}
