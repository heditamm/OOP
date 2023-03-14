import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        Vaateratas vaateratas = new Vaateratas();
        TasulineLõbustus tasulineVaateratas = new TasulineLõbustus(2.25, vaateratas);

        Lasketiir lasketiir = new Lasketiir();
        TasulineLõbustus tasulineLasketiir = new TasulineLõbustus(1.5, lasketiir);
        VanuseKontrollija vanuseKontrollija = new VanuseKontrollija(10, tasulineLasketiir);

        Kloun kloun = new Kloun("Harnold");
        LõbustavKloun lõbustavKloun = new LõbustavKloun(kloun);

        Lõbustuspark lõbustuspark = new Lõbustuspark(Arrays.asList(tasulineVaateratas, vanuseKontrollija, lõbustavKloun));

        KülastajaPraks anne = new KülastajaPraks(9);
        KülastajaPraks mario = new KülastajaPraks(11);

        lõbustuspark.alustaSeiklust(anne);
        lõbustuspark.alustaSeiklust(mario);

    }
}
