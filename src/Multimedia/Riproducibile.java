package Multimedia;

public abstract class Riproducibile extends MMelem {
    protected int volume;
    protected int durata;

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
}
