package Multimedia;

public abstract class MMelem {
    private String titolo;


    public MMelem(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public String printStars(int luminosita) {
        String stars = "";
        for (int i = 0; i < luminosita; i++) {
            stars += "*";
        }
        return stars;
    }
    public String printExclamatives (int volume) {
        String exclamatives = "";
        for (int i = 0; i < volume; i++) {
            exclamatives += "!";
        }
        return exclamatives;
    }
}
