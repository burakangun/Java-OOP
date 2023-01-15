public class Nokta extends Sekil{
    int nokta_Sayisi;

    boolean somut;
    public Nokta(int nokta_Sayisi){
        this.nokta_Sayisi = nokta_Sayisi;
    }
    public Nokta() {

    }

    @Override
    boolean somutMu() {
        return true;

    }
}
