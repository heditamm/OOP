import java.time.LocalDate;

public class KolmnurkneKook extends Kook {
    private double yksKylg;
    private double teineKylg;
    private double kolmasKylg;

    public KolmnurkneKook(String koogiNimetus, LocalDate parimEnne, double ruutCMHind, double yksKylg, double teineKylg, double kolmasKylg) {
        super(koogiNimetus, parimEnne, ruutCMHind);
        this.yksKylg = yksKylg;
        this.teineKylg = teineKylg;
        this.kolmasKylg = kolmasKylg;
    }

    @Override
    double pindala() {
        double p = (yksKylg + teineKylg + kolmasKylg) / 2;
        double juureAlla = p * (p - yksKylg) * (p - teineKylg) * (p - kolmasKylg);
        return Math.sqrt(juureAlla);
    }


}
