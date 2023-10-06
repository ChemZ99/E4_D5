package Multimedia;

public class Audio extends MMelem implements GestioneVolume,Riproduci {
    protected int volume;
    protected int durata;

    public Audio(String titolo, int volume, int durata){
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public int getDurata() {
        return durata;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setDurata(int durata) {
        this.durata = durata;
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
        System.out.println("titolo: " + this.titolo + " volume: " + printExclamatives(this.volume));
    }
}
