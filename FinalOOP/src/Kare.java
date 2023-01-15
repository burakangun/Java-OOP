public class Kare extends Cizgi implements IAlan{

    public Cizgi cizgi;
    public int alan;
    public Kare() {

    }
    public Kare(Cizgi cizgi) {
        this.cizgi = cizgi;
    }
    @Override
    public void alan_Hesapla() {
        this.alan = cizgi.cizgi_Birim * cizgi.cizgi_Birim;

    }
}


