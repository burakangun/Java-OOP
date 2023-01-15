import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Nokta sayısını belirle : ");
        int nokta_Sayisi = scanner.nextInt();

        System.out.println("Çizgi sayısını belirle : ");
        Nokta nokta = new Nokta(nokta_Sayisi);

        int cizgi_Sayisi = scanner.nextInt();
        Cizgi cizgi = new Cizgi(nokta, cizgi_Sayisi);


        Kare kare = new Kare(cizgi);

        Kup kup = new Kup(kare);

        kare.alan_Hesapla();
        System.out.println(kare.alan);
        System.out.println();

        kup.hacim_Hesapla();
        kup.alan_Hesapla();
        System.out.println(kup.alan);
        System.out.println(kup.hacim);







    }
}