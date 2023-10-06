package Multimedia;

public class Foto extends MMelem implements GestioneLuminosita {
    private int luminosita;

    public Foto(String titolo, int luminosita) {
        super(titolo);
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

    private void show() {
        System.out.println("titolo: " + this.titolo + " luminosita: " + printStars(this.luminosita));
    }
}
