public class Kup extends Kare implements I3D{

    public int hacim;
    public Kare kare;

    public Kup(){

    }
    public Kup(Kare kare) {
        this.kare = kare;
    }

    @Override
    public void alan_Hesapla() {
        this.alan = this.kare.alan * 6;
    }

    @Override
    public void hacim_Hesapla() {
        this.hacim = kare.alan* kare.cizgi_Birim;
    }

}
