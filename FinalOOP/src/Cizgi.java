public class Cizgi extends Nokta {

    Nokta nokta;
    public int cizgi_Birim;
    public int cizgi_Sayisi;

    public Cizgi() {

    }

    public Cizgi(Nokta nokta, int cizgi_Sayisi) {
        this.cizgi_Sayisi = cizgi_Sayisi;
        this.cizgi_Birim = nokta.nokta_Sayisi;
    }
}



