package Multimedia;

public class Video extends Audio implements GestioneVolume,GestioneLuminosita,Riproduci{

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

    @Override
    public void aumentaluminosita() {
        int temp = getLuminosita();
        temp++;
        setLuminosita(temp);
    }

    @Override
    public void diminuisciluminosita() {
        int temp = getLuminosita();
        temp--;
        setLuminosita(temp);
    }

    @Override
    public void aumentavolume() {
        int temp = getVolume();
        temp++;
        setVolume(temp);
    }

    @Override
    public void diminuiscivolume() {
        int temp = getVolume();
        temp--;
        setVolume(temp);
    }

    @Override
    public void play() {
        System.out.println("titolo: " + this.getTitolo() + " luminosita: " + printStars(this.getLuminosita()) + " volume: " + printExclamatives(this.getVolume()));
    }
}
